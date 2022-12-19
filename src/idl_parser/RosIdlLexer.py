# Generated from /home/docker/ws/src/synapse_msgs/src/idl_parser/RosIdl.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7")
        buf.write("d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3")
        buf.write("\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\66\n")
        buf.write("\2\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\5\3\5")
        buf.write("\3\6\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\6\3\6\3\6\3\6\3")
        buf.write("\6\7\6Q\n\6\f\6\16\6T\13\6\3\6\3\6\5\6X\n\6\3\6\3\6\3")
        buf.write("\7\6\7]\n\7\r\7\16\7^\3\7\3\7\3\b\3\b\4HR\2\t\3\3\5\4")
        buf.write("\7\2\t\2\13\5\r\6\17\7\3\2\6\4\2C\\c|\3\2\62;\4\2\13\13")
        buf.write("\"\"\4\2\f\f\17\17\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2")
        buf.write("\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2")
        buf.write("\2\7?\3\2\2\2\tA\3\2\2\2\13W\3\2\2\2\r\\\3\2\2\2\17b\3")
        buf.write("\2\2\2\21\22\7w\2\2\22\23\7k\2\2\23\24\7p\2\2\24\25\7")
        buf.write("v\2\2\25\26\78\2\2\26\66\7\66\2\2\27\30\7k\2\2\30\31\7")
        buf.write("p\2\2\31\32\7v\2\2\32\33\78\2\2\33\66\7\66\2\2\34\35\7")
        buf.write("w\2\2\35\36\7k\2\2\36\37\7p\2\2\37 \7v\2\2 !\7\65\2\2")
        buf.write("!\66\7\64\2\2\"#\7k\2\2#$\7p\2\2$%\7v\2\2%&\7\65\2\2&")
        buf.write("\66\7\64\2\2\'(\7h\2\2()\7n\2\2)*\7q\2\2*+\7c\2\2+,\7")
        buf.write("v\2\2,-\78\2\2-\66\7\66\2\2./\7h\2\2/\60\7n\2\2\60\61")
        buf.write("\7q\2\2\61\62\7c\2\2\62\63\7v\2\2\63\64\7\65\2\2\64\66")
        buf.write("\7\64\2\2\65\21\3\2\2\2\65\27\3\2\2\2\65\34\3\2\2\2\65")
        buf.write("\"\3\2\2\2\65\'\3\2\2\2\65.\3\2\2\2\66\4\3\2\2\2\67<\5")
        buf.write("\7\4\28;\5\7\4\29;\5\t\5\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2")
        buf.write("\2<:\3\2\2\2<=\3\2\2\2=\6\3\2\2\2><\3\2\2\2?@\t\2\2\2")
        buf.write("@\b\3\2\2\2AB\t\3\2\2B\n\3\2\2\2CD\7\61\2\2DH\7\61\2\2")
        buf.write("EG\13\2\2\2FE\3\2\2\2GJ\3\2\2\2HI\3\2\2\2HF\3\2\2\2IK")
        buf.write("\3\2\2\2JH\3\2\2\2KX\7\f\2\2LM\7\61\2\2MN\7,\2\2NR\3\2")
        buf.write("\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2")
        buf.write("\2SU\3\2\2\2TR\3\2\2\2UV\7,\2\2VX\7\61\2\2WC\3\2\2\2W")
        buf.write("L\3\2\2\2XY\3\2\2\2YZ\b\6\2\2Z\f\3\2\2\2[]\t\4\2\2\\[")
        buf.write("\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b")
        buf.write("\7\2\2a\16\3\2\2\2bc\t\5\2\2c\20\3\2\2\2\n\2\65:<HRW^")
        buf.write("\3\b\2\2")
        return buf.getvalue()


class RosIdlLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    TYPE = 1
    NAME = 2
    COMMENT = 3
    WS = 4
    EOL = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "TYPE", "NAME", "COMMENT", "WS", "EOL" ]

    ruleNames = [ "TYPE", "NAME", "LETTER", "DIGIT", "COMMENT", "WS", "EOL" ]

    grammarFileName = "RosIdl.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


