// Generated from /home/docker/ws/src/synapse_msgs/src/idl_parser/ROS_IDL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ROS_IDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINITION=1, TYPE=2, ID=3, COMMENT=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "DEFINITION", "TYPE", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'uint64'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFINITION", "TYPE", "ID", "COMMENT", "WS"
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


	public ROS_IDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ROS_IDL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7F\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6#\n\6\f\6\16\6&\13\6\3"+
		"\7\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\3\7\3\7\3\7\3\7\3\7\7\7\65\n\7\f\7"+
		"\16\78\13\7\3\7\3\7\5\7<\n\7\3\7\3\7\3\b\6\bA\n\b\r\b\16\bB\3\b\3\b\4"+
		",\66\2\t\3\2\5\2\7\3\t\4\13\5\r\6\17\7\3\2\4\3\2\62;\5\2\13\f\17\17\""+
		"\"\2I\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3"+
		"\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2\t\30\3\2\2\2\13\37\3\2\2\2\r;\3"+
		"\2\2\2\17@\3\2\2\2\21\22\t\2\2\2\22\4\3\2\2\2\23\24\t\2\2\2\24\6\3\2\2"+
		"\2\25\26\5\t\5\2\26\27\5\13\6\2\27\b\3\2\2\2\30\31\7w\2\2\31\32\7k\2\2"+
		"\32\33\7p\2\2\33\34\7v\2\2\34\35\78\2\2\35\36\7\66\2\2\36\n\3\2\2\2\37"+
		"$\5\3\2\2 #\5\3\2\2!#\5\5\3\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%\f\3\2\2\2&$\3\2\2\2\'(\7\61\2\2(,\7\61\2\2)+\13\2\2\2*)"+
		"\3\2\2\2+.\3\2\2\2,-\3\2\2\2,*\3\2\2\2-/\3\2\2\2.,\3\2\2\2/<\7\f\2\2\60"+
		"\61\7\61\2\2\61\62\7,\2\2\62\66\3\2\2\2\63\65\13\2\2\2\64\63\3\2\2\2\65"+
		"8\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7,\2\2"+
		":<\7\61\2\2;\'\3\2\2\2;\60\3\2\2\2<=\3\2\2\2=>\b\7\2\2>\16\3\2\2\2?A\t"+
		"\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\b\3\2E\20"+
		"\3\2\2\2\t\2\"$,\66;B\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}