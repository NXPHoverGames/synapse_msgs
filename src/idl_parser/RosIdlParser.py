# Generated from /home/docker/ws/src/synapse_msgs/src/idl_parser/RosIdl.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7")
        buf.write("\27\4\2\t\2\4\3\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3")
        buf.write("\3\5\3\17\n\3\3\3\7\3\22\n\3\f\3\16\3\25\13\3\3\3\2\2")
        buf.write("\4\2\4\2\2\2\27\2\7\3\2\2\2\4\13\3\2\2\2\6\b\5\4\3\2\7")
        buf.write("\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2")
        buf.write("\2\2\13\f\7\3\2\2\f\16\7\4\2\2\r\17\7\6\2\2\16\r\3\2\2")
        buf.write("\2\16\17\3\2\2\2\17\23\3\2\2\2\20\22\7\7\2\2\21\20\3\2")
        buf.write("\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3")
        buf.write("\2\2\2\25\23\3\2\2\2\5\t\16\23")
        return buf.getvalue()


class RosIdlParser ( Parser ):

    grammarFileName = "RosIdl.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "TYPE", "NAME", "COMMENT", "WS", "EOL" ]

    RULE_specification = 0
    RULE_definition = 1

    ruleNames =  [ "specification", "definition" ]

    EOF = Token.EOF
    TYPE=1
    NAME=2
    COMMENT=3
    WS=4
    EOL=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class SpecificationContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def definition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RosIdlParser.DefinitionContext)
            else:
                return self.getTypedRuleContext(RosIdlParser.DefinitionContext,i)


        def getRuleIndex(self):
            return RosIdlParser.RULE_specification

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSpecification" ):
                listener.enterSpecification(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSpecification" ):
                listener.exitSpecification(self)




    def specification(self):

        localctx = RosIdlParser.SpecificationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_specification)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 4
                self.definition()
                self.state = 7 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==RosIdlParser.TYPE):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class DefinitionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE(self):
            return self.getToken(RosIdlParser.TYPE, 0)

        def NAME(self):
            return self.getToken(RosIdlParser.NAME, 0)

        def WS(self):
            return self.getToken(RosIdlParser.WS, 0)

        def EOL(self, i:int=None):
            if i is None:
                return self.getTokens(RosIdlParser.EOL)
            else:
                return self.getToken(RosIdlParser.EOL, i)

        def getRuleIndex(self):
            return RosIdlParser.RULE_definition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefinition" ):
                listener.enterDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefinition" ):
                listener.exitDefinition(self)




    def definition(self):

        localctx = RosIdlParser.DefinitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_definition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self.match(RosIdlParser.TYPE)
            self.state = 10
            self.match(RosIdlParser.NAME)
            self.state = 12
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RosIdlParser.WS:
                self.state = 11
                self.match(RosIdlParser.WS)


            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==RosIdlParser.EOL:
                self.state = 14
                self.match(RosIdlParser.EOL)
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





