// Generated from /home/docker/ws/src/synapse_msgs/src/idl_parser/RosIdl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RosIdlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, NAME=4, COMMENT=5, WS=6, EOL=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "NAME", "LETTER", "DIGIT", "COMMENT", "WS", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "NAME", "COMMENT", "WS", "EOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RosIdlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RosIdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u0092\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\b\3\b\5\b\u0086\n\b\3\b\3\b\3\t"+
		"\6\t\u008b\n\t\r\t\16\t\u008c\3\t\3\t\3\n\3\n\4v\u0080\2\13\3\3\5\4\7"+
		"\5\t\6\13\2\r\2\17\7\21\b\23\t\3\2\6\4\2C\\c|\3\2\62;\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7c\3\2"+
		"\2\2\te\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17\u0085\3\2\2\2\21\u008a\3\2\2"+
		"\2\23\u0090\3\2\2\2\25\26\7]\2\2\26\4\3\2\2\2\27\30\7_\2\2\30\6\3\2\2"+
		"\2\31\32\7d\2\2\32\33\7q\2\2\33\34\7q\2\2\34d\7n\2\2\35\36\7d\2\2\36\37"+
		"\7{\2\2\37 \7v\2\2 d\7g\2\2!\"\7e\2\2\"#\7j\2\2#$\7c\2\2$d\7t\2\2%&\7"+
		"h\2\2&\'\7n\2\2\'(\7q\2\2()\7c\2\2)*\7v\2\2*+\7\65\2\2+d\7\64\2\2,-\7"+
		"h\2\2-.\7n\2\2./\7q\2\2/\60\7c\2\2\60\61\7v\2\2\61\62\78\2\2\62d\7\66"+
		"\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7v\2\2\66d\7:\2\2\678\7w\2\289\7"+
		"k\2\29:\7p\2\2:;\7v\2\2;d\7:\2\2<=\7k\2\2=>\7p\2\2>?\7v\2\2?@\7\63\2\2"+
		"@d\78\2\2AB\7w\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2EF\7\63\2\2Fd\78\2\2GH\7"+
		"k\2\2HI\7p\2\2IJ\7v\2\2JK\7\65\2\2Kd\7\64\2\2LM\7w\2\2MN\7k\2\2NO\7p\2"+
		"\2OP\7v\2\2PQ\7\65\2\2Qd\7\64\2\2RS\7k\2\2ST\7p\2\2TU\7v\2\2UV\78\2\2"+
		"Vd\7\66\2\2WX\7w\2\2XY\7k\2\2YZ\7p\2\2Z[\7v\2\2[\\\78\2\2\\d\7\66\2\2"+
		"]^\7u\2\2^_\7v\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bd\7i\2\2c\31\3\2\2\2c\35"+
		"\3\2\2\2c!\3\2\2\2c%\3\2\2\2c,\3\2\2\2c\63\3\2\2\2c\67\3\2\2\2c<\3\2\2"+
		"\2cA\3\2\2\2cG\3\2\2\2cL\3\2\2\2cR\3\2\2\2cW\3\2\2\2c]\3\2\2\2d\b\3\2"+
		"\2\2ej\5\13\6\2fi\5\13\6\2gi\5\r\7\2hf\3\2\2\2hg\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2k\n\3\2\2\2lj\3\2\2\2mn\t\2\2\2n\f\3\2\2\2op\t\3\2\2p"+
		"\16\3\2\2\2qr\7\61\2\2rv\7\61\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2"+
		"\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u0086\7\f\2\2z{\7\61\2\2{|\7,\2\2"+
		"|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7,\2\2\u0084\u0086\7\61\2\2\u0085q\3\2\2\2\u0085z\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\b\2\2\u0088\20\3\2\2\2\u0089\u008b\t\4\2"+
		"\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\t\2\2\u008f\22\3\2\2\2\u0090"+
		"\u0091\t\5\2\2\u0091\24\3\2\2\2\n\2chjv\u0080\u0085\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}