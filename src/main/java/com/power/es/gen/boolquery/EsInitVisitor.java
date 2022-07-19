// Generated from D:/File/File/JAVA/AIQL-ES/src/main/java/com/power/es/g4\EsInit.g4 by ANTLR 4.10.1
package com.power.es.gen.boolquery;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EsInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EsInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EsInitParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(EsInitParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(EsInitParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(EsInitParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggreExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggreExpression(EsInitParser.AggreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(EsInitParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(EsInitParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonExpression}
	 * labeled alternative in {@link EsInitParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonExpression(EsInitParser.CommonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(EsInitParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(EsInitParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpr(EsInitParser.LeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpr(EsInitParser.GeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeExpr(EsInitParser.NeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(EsInitParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainExpr(EsInitParser.ContainExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotContainExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotContainExpr(EsInitParser.NotContainExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(EsInitParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInExpr(EsInitParser.NotInExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistExpr(EsInitParser.ExistExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExistExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExistExpr(EsInitParser.NotExistExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegexExpr}
	 * labeled alternative in {@link EsInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexExpr(EsInitParser.RegexExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsInitParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EsInitParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxAggExpr(EsInitParser.MaxAggExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinAggExpr(EsInitParser.MinAggExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AvgAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgAggExpr(EsInitParser.AvgAggExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupAggExpr}
	 * labeled alternative in {@link EsInitParser#aggexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupAggExpr(EsInitParser.GroupAggExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsInitParser#parenValve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenValve(EsInitParser.ParenValveContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsInitParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(EsInitParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IpV4Value}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpV4Value(EsInitParser.IpV4ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IpV6Valve}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpV6Valve(EsInitParser.IpV6ValveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(EsInitParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(EsInitParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeValue(EsInitParser.TimeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(EsInitParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(EsInitParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link EsInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(EsInitParser.NullValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsInitParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(EsInitParser.RegexContext ctx);
}