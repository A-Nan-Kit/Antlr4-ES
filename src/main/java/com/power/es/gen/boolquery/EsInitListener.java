// Generated from D:/File/File/JAVA/AIQL-ES/src/main/java/com/power/es/g4\EsInit.g4 by ANTLR 4.10.1
package com.power.es.gen.boolquery;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EsInitParser}.
 */
public interface EsInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EsInitParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(EsInitParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsInitParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(EsInitParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(EsInitParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(EsInitParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(EsInitParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(EsInitParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggreExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterAggreExpression(EsInitParser.AggreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggreExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitAggreExpression(EsInitParser.AggreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(EsInitParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(EsInitParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(EsInitParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(EsInitParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void enterCommonExpression(EsInitParser.CommonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 */
	void exitCommonExpression(EsInitParser.CommonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(EsInitParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(EsInitParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(EsInitParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(EsInitParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeExpr(EsInitParser.LeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeExpr(EsInitParser.LeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeExpr(EsInitParser.GeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeExpr(EsInitParser.GeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeExpr(EsInitParser.NeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeExpr(EsInitParser.NeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(EsInitParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(EsInitParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterContainExpr(EsInitParser.ContainExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitContainExpr(EsInitParser.ContainExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotContainExpr(EsInitParser.NotContainExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotContainExpr(EsInitParser.NotContainExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(EsInitParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(EsInitParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpr(EsInitParser.NotInExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpr(EsInitParser.NotInExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExistExpr(EsInitParser.ExistExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExistExpr(EsInitParser.ExistExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExistExpr(EsInitParser.NotExistExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExistExpr(EsInitParser.NotExistExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegexExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRegexExpr(EsInitParser.RegexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegexExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRegexExpr(EsInitParser.RegexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsInitParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(EsInitParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsInitParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(EsInitParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void enterMaxAggExpr(EsInitParser.MaxAggExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void exitMaxAggExpr(EsInitParser.MaxAggExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void enterMinAggExpr(EsInitParser.MinAggExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void exitMinAggExpr(EsInitParser.MinAggExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AvgAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void enterAvgAggExpr(EsInitParser.AvgAggExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AvgAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void exitAvgAggExpr(EsInitParser.AvgAggExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void enterGroupAggExpr(EsInitParser.GroupAggExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 */
	void exitGroupAggExpr(EsInitParser.GroupAggExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsInitParser#parenValve}.
	 * @param ctx the parse tree
	 */
	void enterParenValve(EsInitParser.ParenValveContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsInitParser#parenValve}.
	 * @param ctx the parse tree
	 */
	void exitParenValve(EsInitParser.ParenValveContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsInitParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(EsInitParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsInitParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(EsInitParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IpV4Value}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIpV4Value(EsInitParser.IpV4ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IpV4Value}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIpV4Value(EsInitParser.IpV4ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IpV6Valve}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIpV6Valve(EsInitParser.IpV6ValveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IpV6Valve}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIpV6Valve(EsInitParser.IpV6ValveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(EsInitParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(EsInitParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(EsInitParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(EsInitParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTimeValue(EsInitParser.TimeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTimeValue(EsInitParser.TimeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(EsInitParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(EsInitParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(EsInitParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(EsInitParser.FalseValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(EsInitParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(EsInitParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsInitParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(EsInitParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsInitParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(EsInitParser.RegexContext ctx);
}