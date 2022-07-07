// Generated from D:/File/File/JAVA/JSON2ES/src/main/java/com/power/es\ESInit.g4 by ANTLR 4.10.1
package com.power.es.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ESInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ESInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ESInitParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ESInitParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESInitParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ESInitParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(ESInitParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(ESInitParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpr(ESInitParser.LeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpr(ESInitParser.GeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeExpr(ESInitParser.NeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(ESInitParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpr(ESInitParser.LikeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(ESInitParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInExpr(ESInitParser.NotInExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist(ESInitParser.ExistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExist(ESInitParser.NotExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESInitParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ESInitParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ESInitParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ESInitParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ESInitParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ESInitParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Time}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(ESInitParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ESInitParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ESInitParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ESInitParser.NullContext ctx);
}