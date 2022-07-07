// Generated from D:/File/File/JAVA/JSON2ES/src/main/java/com/power/es\ESInit.g4 by ANTLR 4.10.1
package com.power.es.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ESInitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AND=7, OR=8, EQ=9, NE=10, 
		LT=11, GT=12, LE=13, GE=14, LIKE=15, IN=16, NOT_IN=17, EXIST=18, NOT_EXIST=19, 
		IDENTIFIER=20, STRING=21, TIME=22, NUMBER=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "AND", "OR", "EQ", "NE", 
			"LT", "GT", "LE", "GE", "LIKE", "IN", "NOT_IN", "EXIST", "NOT_EXIST", 
			"IDENTIFIER", "STRING", "TIME", "ESC", "UNICODE", "HEX", "NUMBER", "INT", 
			"EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "','", "'true'", "'false'", "'null'", "'AND'", "'OR'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'LIKE'", "'IN'", "'NOT_IN'", 
			"'EXIST'", "'NOT_EXIST'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AND", "OR", "EQ", "NE", "LT", 
			"GT", "LE", "GE", "LIKE", "IN", "NOT_IN", "EXIST", "NOT_EXIST", "IDENTIFIER", 
			"STRING", "TIME", "NUMBER", "WS"
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


	public ESInitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ESInit.g4"; }

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
		"\u0004\u0000\u0018\u00f7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u008a\b\u0013\n\u0013\f\u0013\u008d\t\u0013\u0001\u0013\u0004\u0013\u0090"+
		"\b\u0013\u000b\u0013\f\u0013\u0091\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0096\b\u0013\n\u0013\f\u0013\u0099\t\u0013\u0003\u0013\u009b\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00a0\b\u0014\n\u0014"+
		"\f\u0014\u00a3\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00c2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0003\u0019\u00cd\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00d3\b\u0019\u0001\u0019\u0003\u0019\u00d6\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00dc\b\u0019\u0001"+
		"\u0019\u0003\u0019\u00df\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u00e4\b\u001a\n\u001a\f\u001a\u00e7\t\u001a\u0003\u001a\u00e9\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u00ed\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0004\u001c\u00f2\b\u001c\u000b\u001c\f\u001c\u00f3"+
		"\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u00001\u00003\u00175\u0000"+
		"7\u00009\u0018\u0001\u0000\t\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0002\u0000\"\"\\\\\b\u0000\"\"//\\\\bbffnnrrtt\u0003\u00000"+
		"9AFaf\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u0102\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00009"+
		"\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001\u0000"+
		"\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000"+
		"\tF\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rQ\u0001\u0000"+
		"\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000"+
		"\u0013[\u0001\u0000\u0000\u0000\u0015^\u0001\u0000\u0000\u0000\u0017`"+
		"\u0001\u0000\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001be\u0001\u0000"+
		"\u0000\u0000\u001dh\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000"+
		"!p\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u009a\u0001\u0000\u0000\u0000)\u009c\u0001\u0000\u0000\u0000"+
		"+\u00a6\u0001\u0000\u0000\u0000-\u00be\u0001\u0000\u0000\u0000/\u00c3"+
		"\u0001\u0000\u0000\u00001\u00c9\u0001\u0000\u0000\u00003\u00de\u0001\u0000"+
		"\u0000\u00005\u00e8\u0001\u0000\u0000\u00007\u00ea\u0001\u0000\u0000\u0000"+
		"9\u00f1\u0001\u0000\u0000\u0000;<\u0005[\u0000\u0000<\u0002\u0001\u0000"+
		"\u0000\u0000=>\u0005]\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005"+
		",\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005t\u0000\u0000BC\u0005"+
		"r\u0000\u0000CD\u0005u\u0000\u0000DE\u0005e\u0000\u0000E\b\u0001\u0000"+
		"\u0000\u0000FG\u0005f\u0000\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000"+
		"\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000K\n\u0001\u0000\u0000"+
		"\u0000LM\u0005n\u0000\u0000MN\u0005u\u0000\u0000NO\u0005l\u0000\u0000"+
		"OP\u0005l\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005A\u0000\u0000"+
		"RS\u0005N\u0000\u0000ST\u0005D\u0000\u0000T\u000e\u0001\u0000\u0000\u0000"+
		"UV\u0005O\u0000\u0000VW\u0005R\u0000\u0000W\u0010\u0001\u0000\u0000\u0000"+
		"XY\u0005=\u0000\u0000YZ\u0005=\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000"+
		"[\\\u0005!\u0000\u0000\\]\u0005=\u0000\u0000]\u0014\u0001\u0000\u0000"+
		"\u0000^_\u0005<\u0000\u0000_\u0016\u0001\u0000\u0000\u0000`a\u0005>\u0000"+
		"\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005<\u0000\u0000cd\u0005=\u0000"+
		"\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0005>\u0000\u0000fg\u0005=\u0000"+
		"\u0000g\u001c\u0001\u0000\u0000\u0000hi\u0005L\u0000\u0000ij\u0005I\u0000"+
		"\u0000jk\u0005K\u0000\u0000kl\u0005E\u0000\u0000l\u001e\u0001\u0000\u0000"+
		"\u0000mn\u0005I\u0000\u0000no\u0005N\u0000\u0000o \u0001\u0000\u0000\u0000"+
		"pq\u0005N\u0000\u0000qr\u0005O\u0000\u0000rs\u0005T\u0000\u0000st\u0005"+
		"_\u0000\u0000tu\u0005I\u0000\u0000uv\u0005N\u0000\u0000v\"\u0001\u0000"+
		"\u0000\u0000wx\u0005E\u0000\u0000xy\u0005X\u0000\u0000yz\u0005I\u0000"+
		"\u0000z{\u0005S\u0000\u0000{|\u0005T\u0000\u0000|$\u0001\u0000\u0000\u0000"+
		"}~\u0005N\u0000\u0000~\u007f\u0005O\u0000\u0000\u007f\u0080\u0005T\u0000"+
		"\u0000\u0080\u0081\u0005_\u0000\u0000\u0081\u0082\u0005E\u0000\u0000\u0082"+
		"\u0083\u0005X\u0000\u0000\u0083\u0084\u0005I\u0000\u0000\u0084\u0085\u0005"+
		"S\u0000\u0000\u0085\u0086\u0005T\u0000\u0000\u0086&\u0001\u0000\u0000"+
		"\u0000\u0087\u008b\u0007\u0000\u0000\u0000\u0088\u008a\u0007\u0001\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u009b\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0007\u0002\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0097\u0007\u0000\u0000\u0000\u0094\u0096\u0007\u0001\u0000"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u0087\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000"+
		"\u0000\u009b(\u0001\u0000\u0000\u0000\u009c\u00a1\u0005\"\u0000\u0000"+
		"\u009d\u00a0\u0003-\u0016\u0000\u009e\u00a0\b\u0003\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\"\u0000\u0000\u00a5*"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0002\u0000\u0000\u00a7\u00a8"+
		"\u0007\u0002\u0000\u0000\u00a8\u00a9\u0007\u0002\u0000\u0000\u00a9\u00aa"+
		"\u0007\u0002\u0000\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00ac\u0007"+
		"\u0002\u0000\u0000\u00ac\u00ad\u0007\u0002\u0000\u0000\u00ad\u00ae\u0005"+
		"-\u0000\u0000\u00ae\u00af\u0007\u0002\u0000\u0000\u00af\u00b0\u0007\u0002"+
		"\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0007\u0002\u0000"+
		"\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3\u00b4\u0005:\u0000\u0000"+
		"\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u00b6\u0007\u0002\u0000\u0000"+
		"\u00b6\u00b7\u0005:\u0000\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000\u00b8"+
		"\u00b9\u0007\u0002\u0000\u0000\u00b9\u00ba\u0005.\u0000\u0000\u00ba\u00bb"+
		"\u0007\u0002\u0000\u0000\u00bb\u00bc\u0007\u0002\u0000\u0000\u00bc\u00bd"+
		"\u0007\u0002\u0000\u0000\u00bd,\u0001\u0000\u0000\u0000\u00be\u00c1\u0005"+
		"\\\u0000\u0000\u00bf\u00c2\u0007\u0004\u0000\u0000\u00c0\u00c2\u0003/"+
		"\u0017\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2.\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005u\u0000\u0000"+
		"\u00c4\u00c5\u00031\u0018\u0000\u00c5\u00c6\u00031\u0018\u0000\u00c6\u00c7"+
		"\u00031\u0018\u0000\u00c7\u00c8\u00031\u0018\u0000\u00c80\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0007\u0005\u0000\u0000\u00ca2\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cd\u0005-\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u00035\u001a\u0000\u00cf\u00d0\u0005.\u0000\u0000\u00d0\u00d2"+
		"\u00035\u001a\u0000\u00d1\u00d3\u00037\u001b\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00df\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0005-\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u00035\u001a\u0000\u00d8\u00d9\u00037\u001b\u0000\u00d9"+
		"\u00df\u0001\u0000\u0000\u0000\u00da\u00dc\u0005-\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u00035\u001a\u0000\u00de\u00cc\u0001"+
		"\u0000\u0000\u0000\u00de\u00d5\u0001\u0000\u0000\u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00df4\u0001\u0000\u0000\u0000\u00e0\u00e9\u00050\u0000"+
		"\u0000\u00e1\u00e5\u000219\u0000\u00e2\u00e4\u000209\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e96\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u0007\u0006\u0000\u0000\u00eb\u00ed\u0007"+
		"\u0007\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003"+
		"5\u001a\u0000\u00ef8\u0001\u0000\u0000\u0000\u00f0\u00f2\u0007\b\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u001c\u0000"+
		"\u0000\u00f6:\u0001\u0000\u0000\u0000\u0011\u0000\u008b\u0091\u0097\u009a"+
		"\u009f\u00a1\u00c1\u00cc\u00d2\u00d5\u00db\u00de\u00e5\u00e8\u00ec\u00f3"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}