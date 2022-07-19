// Generated from D:/File/File/JAVA/AIQL-ES/src/main/java/com/power/es/g4\EsInit.g4 by ANTLR 4.10.1
package com.power.es.gen.boolquery;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EsInitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IPv4=10, IPv6=11, STRING=12, REGEX=13, AND=14, OR=15, EQ=16, NE=17, LT=18, 
		GT=19, LE=20, GE=21, REG=22, LIKE=23, IN=24, NOT_IN=25, EXIST=26, NOT_EXIST=27, 
		NOT=28, DOT=29, CONTAIN=30, NOTCONTAIN=31, MAX=32, MIN=33, SUM=34, AVG=35, 
		GROUP=36, IDENTIFIER=37, TIME=38, NUMBER=39, SEGMENTv6=40, SEGMENT=41, 
		WS=42;
	public static final int
		RULE_parse = 0, RULE_expression = 1, RULE_expr = 2, RULE_array = 3, RULE_aggexpr = 4, 
		RULE_parenValve = 5, RULE_param = 6, RULE_value = 7, RULE_regex = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "expression", "expr", "array", "aggexpr", "parenValve", "param", 
			"value", "regex"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'('", "')'", "'['", "']'", "','", "'true'", "'false'", 
			"'null'", null, null, null, null, "'AND'", "'OR'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'=~'", "'LIKE'", "'IN'", "'NOT_IN'", "'EXIST'", 
			"'NOT_EXIST'", "'NOT'", "'.'", "'CONTAIN'", "'NOTCONTAIN'", "'max'", 
			"'min'", "'sum'", "'agv'", "'group'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IPv4", "IPv6", 
			"STRING", "REGEX", "AND", "OR", "EQ", "NE", "LT", "GT", "LE", "GE", "REG", 
			"LIKE", "IN", "NOT_IN", "EXIST", "NOT_EXIST", "NOT", "DOT", "CONTAIN", 
			"NOTCONTAIN", "MAX", "MIN", "SUM", "AVG", "GROUP", "IDENTIFIER", "TIME", 
			"NUMBER", "SEGMENTv6", "SEGMENT", "WS"
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
	public String getGrammarFileName() { return "EsInit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EsInitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EsInitParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			expression(0);
			setState(19);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(EsInitParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(EsInitParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggreExpressionContext extends ExpressionContext {
		public AggexprContext aggexpr() {
			return getRuleContext(AggexprContext.class,0);
		}
		public AggreExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterAggreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitAggreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitAggreExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommonExpressionContext extends ExpressionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterCommonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitCommonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitCommonExpression(this);
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(T__0);
				setState(23);
				expression(6);
				}
				break;
			case 2:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__1);
				setState(25);
				expression(0);
				setState(26);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new AggreExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				aggexpr();
				}
				break;
			case 4:
				{
				_localctx = new CommonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(AND);
						setState(34);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(OR);
						setState(37);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class ExistExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(EsInitParser.EXIST, 0); }
		public ExistExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterExistExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitExistExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitExistExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode REG() { return getToken(EsInitParser.REG, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public RegexExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterRegexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitRegexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitRegexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NE() { return getToken(EsInitParser.NE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExistExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NOT_EXIST() { return getToken(EsInitParser.NOT_EXIST, 0); }
		public NotExistExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNotExistExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNotExistExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNotExistExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LT() { return getToken(EsInitParser.LT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode GT() { return getToken(EsInitParser.GT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode GE() { return getToken(EsInitParser.GE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitGeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitGeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContainExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NOTCONTAIN() { return getToken(EsInitParser.NOTCONTAIN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NotContainExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNotContainExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNotContainExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNotContainExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode LE() { return getToken(EsInitParser.LE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitLeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitLeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode CONTAIN() { return getToken(EsInitParser.CONTAIN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ContainExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterContainExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitContainExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitContainExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EsInitParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode IN() { return getToken(EsInitParser.IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotInExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode NOT_IN() { return getToken(EsInitParser.NOT_IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public NotInExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNotInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNotInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNotInExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				param();
				setState(44);
				match(LT);
				setState(45);
				value();
				}
				break;
			case 2:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				param();
				setState(48);
				match(GT);
				setState(49);
				value();
				}
				break;
			case 3:
				_localctx = new LeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				param();
				setState(52);
				match(LE);
				setState(53);
				value();
				}
				break;
			case 4:
				_localctx = new GeExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				param();
				setState(56);
				match(GE);
				setState(57);
				value();
				}
				break;
			case 5:
				_localctx = new NeExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				param();
				setState(60);
				match(NE);
				setState(61);
				value();
				}
				break;
			case 6:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				param();
				setState(64);
				match(EQ);
				setState(65);
				value();
				}
				break;
			case 7:
				_localctx = new ContainExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				param();
				setState(68);
				match(CONTAIN);
				setState(69);
				value();
				}
				break;
			case 8:
				_localctx = new NotContainExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				param();
				setState(72);
				match(NOTCONTAIN);
				setState(73);
				value();
				}
				break;
			case 9:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				param();
				setState(76);
				match(IN);
				setState(77);
				array();
				}
				break;
			case 10:
				_localctx = new NotInExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				param();
				setState(80);
				match(NOT_IN);
				setState(81);
				array();
				}
				break;
			case 11:
				_localctx = new ExistExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
				param();
				setState(84);
				match(EXIST);
				}
				break;
			case 12:
				_localctx = new NotExistExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(86);
				param();
				setState(87);
				match(NOT_EXIST);
				}
				break;
			case 13:
				_localctx = new RegexExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(89);
				param();
				setState(90);
				match(REG);
				setState(91);
				regex();
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
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__3);
				setState(96);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__3);
				setState(98);
				value();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(99);
					match(T__5);
					setState(100);
					value();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__4);
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

	public static class AggexprContext extends ParserRuleContext {
		public AggexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggexpr; }
	 
		public AggexprContext() { }
		public void copyFrom(AggexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MaxAggExprContext extends AggexprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EsInitParser.DOT, 0); }
		public TerminalNode MAX() { return getToken(EsInitParser.MAX, 0); }
		public ParenValveContext parenValve() {
			return getRuleContext(ParenValveContext.class,0);
		}
		public MaxAggExprContext(AggexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterMaxAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitMaxAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitMaxAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupAggExprContext extends AggexprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EsInitParser.DOT, 0); }
		public TerminalNode GROUP() { return getToken(EsInitParser.GROUP, 0); }
		public ParenValveContext parenValve() {
			return getRuleContext(ParenValveContext.class,0);
		}
		public GroupAggExprContext(AggexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterGroupAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitGroupAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitGroupAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinAggExprContext extends AggexprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EsInitParser.DOT, 0); }
		public TerminalNode MIN() { return getToken(EsInitParser.MIN, 0); }
		public ParenValveContext parenValve() {
			return getRuleContext(ParenValveContext.class,0);
		}
		public MinAggExprContext(AggexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterMinAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitMinAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitMinAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgAggExprContext extends AggexprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EsInitParser.DOT, 0); }
		public TerminalNode AVG() { return getToken(EsInitParser.AVG, 0); }
		public ParenValveContext parenValve() {
			return getRuleContext(ParenValveContext.class,0);
		}
		public AvgAggExprContext(AggexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterAvgAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitAvgAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitAvgAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggexprContext aggexpr() throws RecognitionException {
		AggexprContext _localctx = new AggexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aggexpr);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MaxAggExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				param();
				setState(111);
				match(DOT);
				setState(112);
				match(MAX);
				setState(113);
				parenValve();
				}
				break;
			case 2:
				_localctx = new MinAggExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				param();
				setState(116);
				match(DOT);
				setState(117);
				match(MIN);
				setState(118);
				parenValve();
				}
				break;
			case 3:
				_localctx = new AvgAggExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				param();
				setState(121);
				match(DOT);
				setState(122);
				match(AVG);
				setState(123);
				parenValve();
				}
				break;
			case 4:
				_localctx = new GroupAggExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				param();
				setState(126);
				match(DOT);
				setState(127);
				match(GROUP);
				setState(128);
				parenValve();
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

	public static class ParenValveContext extends ParserRuleContext {
		public AggexprContext aggexpr() {
			return getRuleContext(AggexprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenValveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenValve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterParenValve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitParenValve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitParenValve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenValveContext parenValve() throws RecognitionException {
		ParenValveContext _localctx = new ParenValveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parenValve);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__1);
				setState(133);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__1);
				setState(135);
				aggexpr();
				setState(136);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__1);
				setState(139);
				expression(0);
				setState(140);
				match(T__2);
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
		public TerminalNode IDENTIFIER() { return getToken(EsInitParser.IDENTIFIER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
	public static class NullValueContext extends ValueContext {
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValueContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(EsInitParser.NUMBER, 0); }
		public NumberValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueValueContext extends ValueContext {
		public TrueValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitTrueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitTrueValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IpV6ValveContext extends ValueContext {
		public TerminalNode IPv6() { return getToken(EsInitParser.IPv6, 0); }
		public IpV6ValveContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterIpV6Valve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitIpV6Valve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitIpV6Valve(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IpV4ValueContext extends ValueContext {
		public TerminalNode IPv4() { return getToken(EsInitParser.IPv4, 0); }
		public IpV4ValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterIpV4Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitIpV4Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitIpV4Value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(EsInitParser.STRING, 0); }
		public StringValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeValueContext extends ValueContext {
		public TerminalNode TIME() { return getToken(EsInitParser.TIME, 0); }
		public TimeValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterTimeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitTimeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitTimeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseValueContext extends ValueContext {
		public FalseValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitFalseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitFalseValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IPv4:
				_localctx = new IpV4ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(IPv4);
				}
				break;
			case IPv6:
				_localctx = new IpV6ValveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(IPv6);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(NUMBER);
				}
				break;
			case TIME:
				_localctx = new TimeValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(TIME);
				}
				break;
			case T__6:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				match(T__8);
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(EsInitParser.REGEX, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsInitListener ) ((EsInitListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsInitVisitor ) return ((EsInitVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(REGEX);
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
		"\u0004\u0001*\u009f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001"+
		"*\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"m\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008f\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0000\u0001\u0002\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0000\u00b4\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u001e"+
		"\u0001\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006l\u0001\u0000"+
		"\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000"+
		"\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000\u0000"+
		"\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000"+
		"\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0006\u0001\uffff\uffff\u0000\u0016\u0017\u0005\u0001\u0000"+
		"\u0000\u0017\u001f\u0003\u0002\u0001\u0006\u0018\u0019\u0005\u0002\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0003\u0000"+
		"\u0000\u001b\u001f\u0001\u0000\u0000\u0000\u001c\u001f\u0003\b\u0004\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u0015\u0001\u0000\u0000\u0000"+
		"\u001e\u0018\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f(\u0001\u0000\u0000\u0000 !"+
		"\n\u0003\u0000\u0000!\"\u0005\u000e\u0000\u0000\"\'\u0003\u0002\u0001"+
		"\u0004#$\n\u0002\u0000\u0000$%\u0005\u000f\u0000\u0000%\'\u0003\u0002"+
		"\u0001\u0003& \u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0003\f\u0006"+
		"\u0000,-\u0005\u0012\u0000\u0000-.\u0003\u000e\u0007\u0000.^\u0001\u0000"+
		"\u0000\u0000/0\u0003\f\u0006\u000001\u0005\u0013\u0000\u000012\u0003\u000e"+
		"\u0007\u00002^\u0001\u0000\u0000\u000034\u0003\f\u0006\u000045\u0005\u0014"+
		"\u0000\u000056\u0003\u000e\u0007\u00006^\u0001\u0000\u0000\u000078\u0003"+
		"\f\u0006\u000089\u0005\u0015\u0000\u00009:\u0003\u000e\u0007\u0000:^\u0001"+
		"\u0000\u0000\u0000;<\u0003\f\u0006\u0000<=\u0005\u0011\u0000\u0000=>\u0003"+
		"\u000e\u0007\u0000>^\u0001\u0000\u0000\u0000?@\u0003\f\u0006\u0000@A\u0005"+
		"\u0010\u0000\u0000AB\u0003\u000e\u0007\u0000B^\u0001\u0000\u0000\u0000"+
		"CD\u0003\f\u0006\u0000DE\u0005\u001e\u0000\u0000EF\u0003\u000e\u0007\u0000"+
		"F^\u0001\u0000\u0000\u0000GH\u0003\f\u0006\u0000HI\u0005\u001f\u0000\u0000"+
		"IJ\u0003\u000e\u0007\u0000J^\u0001\u0000\u0000\u0000KL\u0003\f\u0006\u0000"+
		"LM\u0005\u0018\u0000\u0000MN\u0003\u0006\u0003\u0000N^\u0001\u0000\u0000"+
		"\u0000OP\u0003\f\u0006\u0000PQ\u0005\u0019\u0000\u0000QR\u0003\u0006\u0003"+
		"\u0000R^\u0001\u0000\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005\u001a\u0000"+
		"\u0000U^\u0001\u0000\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005\u001b\u0000"+
		"\u0000X^\u0001\u0000\u0000\u0000YZ\u0003\f\u0006\u0000Z[\u0005\u0016\u0000"+
		"\u0000[\\\u0003\u0010\b\u0000\\^\u0001\u0000\u0000\u0000]+\u0001\u0000"+
		"\u0000\u0000]/\u0001\u0000\u0000\u0000]3\u0001\u0000\u0000\u0000]7\u0001"+
		"\u0000\u0000\u0000];\u0001\u0000\u0000\u0000]?\u0001\u0000\u0000\u0000"+
		"]C\u0001\u0000\u0000\u0000]G\u0001\u0000\u0000\u0000]K\u0001\u0000\u0000"+
		"\u0000]O\u0001\u0000\u0000\u0000]S\u0001\u0000\u0000\u0000]V\u0001\u0000"+
		"\u0000\u0000]Y\u0001\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0004\u0000\u0000`m\u0005\u0005\u0000\u0000ab\u0005\u0004\u0000"+
		"\u0000bg\u0003\u000e\u0007\u0000cd\u0005\u0006\u0000\u0000df\u0003\u000e"+
		"\u0007\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0005\u0005\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000l_\u0001\u0000\u0000\u0000la\u0001\u0000\u0000\u0000m\u0007\u0001"+
		"\u0000\u0000\u0000no\u0003\f\u0006\u0000op\u0005\u001d\u0000\u0000pq\u0005"+
		" \u0000\u0000qr\u0003\n\u0005\u0000r\u0083\u0001\u0000\u0000\u0000st\u0003"+
		"\f\u0006\u0000tu\u0005\u001d\u0000\u0000uv\u0005!\u0000\u0000vw\u0003"+
		"\n\u0005\u0000w\u0083\u0001\u0000\u0000\u0000xy\u0003\f\u0006\u0000yz"+
		"\u0005\u001d\u0000\u0000z{\u0005#\u0000\u0000{|\u0003\n\u0005\u0000|\u0083"+
		"\u0001\u0000\u0000\u0000}~\u0003\f\u0006\u0000~\u007f\u0005\u001d\u0000"+
		"\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000"+
		"\u0081\u0083\u0001\u0000\u0000\u0000\u0082n\u0001\u0000\u0000\u0000\u0082"+
		"s\u0001\u0000\u0000\u0000\u0082x\u0001\u0000\u0000\u0000\u0082}\u0001"+
		"\u0000\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0002"+
		"\u0000\u0000\u0085\u008f\u0005\u0003\u0000\u0000\u0086\u0087\u0005\u0002"+
		"\u0000\u0000\u0087\u0088\u0003\b\u0004\u0000\u0088\u0089\u0005\u0003\u0000"+
		"\u0000\u0089\u008f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0002\u0000"+
		"\u0000\u008b\u008c\u0003\u0002\u0001\u0000\u008c\u008d\u0005\u0003\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0084\u0001\u0000\u0000"+
		"\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000"+
		"\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u0091\u0005%\u0000\u0000"+
		"\u0091\r\u0001\u0000\u0000\u0000\u0092\u009b\u0005\n\u0000\u0000\u0093"+
		"\u009b\u0005\u000b\u0000\u0000\u0094\u009b\u0005\f\u0000\u0000\u0095\u009b"+
		"\u0005\'\u0000\u0000\u0096\u009b\u0005&\u0000\u0000\u0097\u009b\u0005"+
		"\u0007\u0000\u0000\u0098\u009b\u0005\b\u0000\u0000\u0099\u009b\u0005\t"+
		"\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000"+
		"\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000"+
		"\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0005\r\u0000"+
		"\u0000\u009d\u0011\u0001\u0000\u0000\u0000\t\u001e&(]gl\u0082\u008e\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}