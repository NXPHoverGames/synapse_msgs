#!/usr/bin/env python3

from jinja2 import Template
import antlr4
from RosIdlLexer import RosIdlLexer
from RosIdlListener import RosIdlListener
from RosIdlParser import RosIdlParser
import sys
from dataclasses import dataclass
from typing import List

@dataclass
class Field:
    name: str
    type: str

@dataclass
class Specification:
    fields: List[Field]    

class AstCreator(RosIdlListener):

    def __init__(self):
        self.ast = {}
        self.scope_spec = None
    
    def enterSpecification(self, ctx: RosIdlParser.SpecificationContext):
        self.ast[ctx] = Specification(fields=[])
        self.scope_spec = ctx
        return super().enterSpecification(ctx)

    def enterDefinition(self, ctx: RosIdlParser.DefinitionContext):
        self.ast[ctx] = Field(
            name=str(ctx.NAME()),
            type=str(ctx.TYPE())
        )
        return super().enterDefinition(ctx)
    
    def exitDefinition(self, ctx: RosIdlParser.DefinitionContext):
        self.ast[self.scope_spec].fields.append(self.ast[ctx])
        return super().exitDefinition(ctx)

def main():
    input_stream = antlr4.FileStream('../../msg/Num.msg')
    print(input_stream)
    lexer = RosIdlLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = RosIdlParser(stream)
    tree = parser.specification()
    ast_creator = AstCreator()
    walker = antlr4.ParseTreeWalker()
    walker.walk(ast_creator, tree)
    ast = ast_creator.ast[ast_creator.scope_spec] # type: Specification
    print(ast)

    tm = Template("""
struct name {
{%- for field in spec.fields %}
    {{field.type}} {{ field.name }};
{%- endfor %}
};

void serialize_struct_name() {
}
    """)
    msg = tm.render(spec=ast)
    print(msg)

if __name__ == '__main__':
    main()