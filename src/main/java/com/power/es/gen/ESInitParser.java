// Generated from D:/File/File/JAVA/JSON2ES/src/main/java/com/power/es\ESInit.g4 by ANTLR 4.10.1
package com.power.es.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ESInitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AND=7, OR=8, EQ=9, NE=10, 
		LT=11, GT=12, LE=13, GE=14, LIKE=15, IN=16, NOT_IN=17, EXIST=18, NOT_EXIST=19, 
		IDENTIFIER=20, STRING=21, TIME=22, NUMBER=23, WS=24;
	public static final int
		RULE_parse = 0, RULE_expression = 1, RULE_expr = 2, RULE_array = 3, RULE_param = 4, 
		RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "expression", "expr", "array", "param", "value"
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

	@Override
	public String getGrammarFileName() { return "ESInit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ESInitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ESInitParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			expression(0);
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ESInitParser.AND, 0); }
		public TerminalNode OR() { return getToken(ESInitParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(16);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(24);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(18);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(19);
						match(AND);
						setState(20);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(21);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(22);
						match(OR);
						setState(23);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LikeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ESInitParser.LIKE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LikeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterLikeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitLikeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitLikeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExistContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NOT_EXIST() { return getToken(ESInitParser.NOT_EXIST, 0); }
		public NotExistContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterNotExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitNotExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitNotExist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(ESInitParser.EXIST, 0); }
		public ExistContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitExist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NE() { return getToken(ESInitParser.NE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterNeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitNeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitNeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ESInitParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LT() { return getToken(ESInitParser.LT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode GT() { return getToken(ESInitParser.GT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode GE() { return getToken(ESInitParser.GE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitGeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitGeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode IN() { return getToken(ESInitParser.IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotInExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NOT_IN() { return getToken(ESInitParser.NOT_IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public NotInExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterNotInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitNotInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitNotInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LE() { return getToken(ESInitParser.LE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitLeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitLeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				param();
				setState(30);
				match(LT);
				setState(31);
				value();
				}
				break;
			case 2:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				param();
				setState(34);
				match(GT);
				setState(35);
				value();
				}
				break;
			case 3:
				_localctx = new LeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				param();
				setState(38);
				match(LE);
				setState(39);
				value();
				}
				break;
			case 4:
				_localctx = new GeExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				param();
				setState(42);
				match(GE);
				setState(43);
				value();
				}
				break;
			case 5:
				_localctx = new NeExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				param();
				setState(46);
				match(NE);
				setState(47);
				value();
				}
				break;
			case 6:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				param();
				setState(50);
				match(EQ);
				setState(51);
				value();
				}
				break;
			case 7:
				_localctx = new LikeExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				param();
				setState(54);
				match(LIKE);
				setState(55);
				value();
				}
				break;
			case 8:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				param();
				setState(58);
				match(IN);
				setState(59);
				array();
				}
				break;
			case 9:
				_localctx = new NotInExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				param();
				setState(62);
				match(NOT_IN);
				setState(63);
				array();
				}
				break;
			case 10:
				_localctx = new ExistContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				param();
				setState(66);
				match(EXIST);
				}
				break;
			case 11:
				_localctx = new NotExistContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				param();
				setState(69);
				match(NOT_EXIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__0);
				setState(74);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__0);
				setState(76);
				value();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(77);
					match(T__2);
					setState(78);
					value();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ESInitParser.IDENTIFIER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullContext extends ValueContext {
		public NullContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(ESInitParser.NUMBER, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ValueContext {
		public TrueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeContext extends ValueContext {
		public TerminalNode TIME() { return getToken(ESInitParser.TIME, 0); }
		public TimeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(ESInitParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ValueContext {
		public FalseContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ESInitListener ) ((ESInitListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESInitVisitor ) return ((ESInitVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUMBER);
				}
				break;
			case TIME:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(TIME);
				}
				break;
			case T__3:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003S\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005a\b\u0005\u0001\u0005\u0000\u0001\u0002\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0000o\u0000\f\u0001\u0000\u0000\u0000\u0002\u000f"+
		"\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006V\u0001\u0000"+
		"\u0000\u0000\bX\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\f\r"+
		"\u0003\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0011"+
		"\u0003\u0004\u0002\u0000\u0011\u001a\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\n\u0003\u0000\u0000\u0013\u0014\u0005\u0007\u0000\u0000\u0014\u0019\u0003"+
		"\u0002\u0001\u0004\u0015\u0016\n\u0002\u0000\u0000\u0016\u0017\u0005\b"+
		"\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0003\u0018\u0012\u0001\u0000"+
		"\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f\u0005\u000b\u0000"+
		"\u0000\u001f \u0003\n\u0005\u0000 H\u0001\u0000\u0000\u0000!\"\u0003\b"+
		"\u0004\u0000\"#\u0005\f\u0000\u0000#$\u0003\n\u0005\u0000$H\u0001\u0000"+
		"\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0005\r\u0000\u0000\'(\u0003\n\u0005"+
		"\u0000(H\u0001\u0000\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005\u000e\u0000"+
		"\u0000+,\u0003\n\u0005\u0000,H\u0001\u0000\u0000\u0000-.\u0003\b\u0004"+
		"\u0000./\u0005\n\u0000\u0000/0\u0003\n\u0005\u00000H\u0001\u0000\u0000"+
		"\u000012\u0003\b\u0004\u000023\u0005\t\u0000\u000034\u0003\n\u0005\u0000"+
		"4H\u0001\u0000\u0000\u000056\u0003\b\u0004\u000067\u0005\u000f\u0000\u0000"+
		"78\u0003\n\u0005\u00008H\u0001\u0000\u0000\u00009:\u0003\b\u0004\u0000"+
		":;\u0005\u0010\u0000\u0000;<\u0003\u0006\u0003\u0000<H\u0001\u0000\u0000"+
		"\u0000=>\u0003\b\u0004\u0000>?\u0005\u0011\u0000\u0000?@\u0003\u0006\u0003"+
		"\u0000@H\u0001\u0000\u0000\u0000AB\u0003\b\u0004\u0000BC\u0005\u0012\u0000"+
		"\u0000CH\u0001\u0000\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\u0013\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000G\u001d\u0001\u0000\u0000\u0000G!\u0001"+
		"\u0000\u0000\u0000G%\u0001\u0000\u0000\u0000G)\u0001\u0000\u0000\u0000"+
		"G-\u0001\u0000\u0000\u0000G1\u0001\u0000\u0000\u0000G5\u0001\u0000\u0000"+
		"\u0000G9\u0001\u0000\u0000\u0000G=\u0001\u0000\u0000\u0000GA\u0001\u0000"+
		"\u0000\u0000GD\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u0001\u0000\u0000JW\u0005\u0002\u0000\u0000KL\u0005\u0001\u0000"+
		"\u0000LQ\u0003\n\u0005\u0000MN\u0005\u0003\u0000\u0000NP\u0003\n\u0005"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000UW\u0001\u0000\u0000\u0000"+
		"VI\u0001\u0000\u0000\u0000VK\u0001\u0000\u0000\u0000W\u0007\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0014\u0000\u0000Y\t\u0001\u0000\u0000\u0000Za\u0005"+
		"\u0015\u0000\u0000[a\u0005\u0017\u0000\u0000\\a\u0005\u0016\u0000\u0000"+
		"]a\u0005\u0004\u0000\u0000^a\u0005\u0005\u0000\u0000_a\u0005\u0006\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000"+
		"\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000\u0006\u0018\u001aGQ"+
		"V`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}