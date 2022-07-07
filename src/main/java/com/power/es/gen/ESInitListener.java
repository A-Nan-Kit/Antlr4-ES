// Generated from D:/File/File/JAVA/JSON2ES/src/main/java/com/power/es\ESInit.g4 by ANTLR 4.10.1
package com.power.es.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ESInitParser}.
 */
public interface ESInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ESInitParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ESInitParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ESInitParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ESInitParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ESInitParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ESInitParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ESInitParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ESInitParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(ESInitParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(ESInitParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(ESInitParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(ESInitParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeExpr(ESInitParser.LeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeExpr(ESInitParser.LeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeExpr(ESInitParser.GeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeExpr(ESInitParser.GeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeExpr(ESInitParser.NeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeExpr(ESInitParser.NeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(ESInitParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(ESInitParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLikeExpr(ESInitParser.LikeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLikeExpr(ESInitParser.LikeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(ESInitParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(ESInitParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpr(ESInitParser.NotInExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpr(ESInitParser.NotInExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExist(ESInitParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExist(ESInitParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExist(ESInitParser.NotExistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExist}
	 * labeled alternative in {@link ESInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExist(ESInitParser.NotExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ESInitParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ESInitParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ESInitParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ESInitParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ESInitParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ESInitParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ESInitParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ESInitParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(ESInitParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(ESInitParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ESInitParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ESInitParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Time}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTime(ESInitParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Time}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTime(ESInitParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ESInitParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ESInitParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ESInitParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ESInitParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNull(ESInitParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ESInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNull(ESInitParser.NullContext ctx);
}