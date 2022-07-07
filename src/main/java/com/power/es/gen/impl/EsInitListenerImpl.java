package com.power.es.gen.impl;

import com.power.es.base.OpEnum;
import com.power.es.gen.ESInitListener;
import com.power.es.gen.ESInitParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.elasticsearch.index.query.*;
import java.util.List;
import java.util.Objects;
import java.util.Stack;


/**
 * @author Aurora
 */
public class EsInitListenerImpl implements ESInitListener {

    private Stack<Object> stack = new Stack<>();

    @Override
    public void enterString(ESInitParser.StringContext ctx) {

    }

    @Override
    public void exitString(ESInitParser.StringContext ctx) {
    }

    @Override
    public void enterNumber(ESInitParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(ESInitParser.NumberContext ctx) {

    }

    @Override
    public void enterTime(ESInitParser.TimeContext ctx) {

    }

    @Override
    public void exitTime(ESInitParser.TimeContext ctx) {

    }

    @Override
    public void enterTrue(ESInitParser.TrueContext ctx) {

    }

    @Override
    public void exitTrue(ESInitParser.TrueContext ctx) {

    }

    @Override
    public void enterFalse(ESInitParser.FalseContext ctx) {

    }

    @Override
    public void exitFalse(ESInitParser.FalseContext ctx) {

    }

    @Override
    public void enterNull(ESInitParser.NullContext ctx) {

    }

    @Override
    public void exitNull(ESInitParser.NullContext ctx) {

    }

    @Override
    public void enterExist(ESInitParser.ExistContext ctx) {

    }

    @Override
    public void exitExist(ESInitParser.ExistContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        param = param.substring(1,param.length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .must(QueryBuilders.existsQuery(param));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterNotExist(ESInitParser.NotExistContext ctx) {

    }

    @Override
    public void exitNotExist(ESInitParser.NotExistContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        param = param.substring(1,param.length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .mustNot(QueryBuilders.existsQuery(param));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterLtExpr(ESInitParser.LtExprContext ctx) {

    }

    @Override
    public void exitLtExpr(ESInitParser.LtExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).lt(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterGtExpr(ESInitParser.GtExprContext ctx) {

    }

    @Override
    public void exitGtExpr(ESInitParser.GtExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).gt(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterLeExpr(ESInitParser.LeExprContext ctx) {

    }

    @Override
    public void exitLeExpr(ESInitParser.LeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).lte(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterGeExpr(ESInitParser.GeExprContext ctx) {

    }

    @Override
    public void exitGeExpr(ESInitParser.GeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).gte(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterNeExpr(ESInitParser.NeExprContext ctx) {

    }

    @Override
    public void exitNeExpr(ESInitParser.NeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(param, value));
        stack.push(queryBuilder);
    }

    @Override
    public void enterEqExpr(ESInitParser.EqExprContext ctx) {

    }

    @Override
    public void exitEqExpr(ESInitParser.EqExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        if (value.startsWith("\"")) {
            value = value.substring(1, value.length() - 1);
        }
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery().must(QueryBuilders.termQuery(param, value));
        stack.push(queryBuilder);
    }

    @Override
    public void enterLikeExpr(ESInitParser.LikeExprContext ctx) {

    }

    @Override
    public void exitLikeExpr(ESInitParser.LikeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText().substring(1,children.get(2).getText().length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .must(QueryBuilders.wildcardQuery(param, "*" + value + "*"));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterInExpr(ESInitParser.InExprContext ctx) {

    }

    @Override
    public void exitInExpr(ESInitParser.InExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String array = children.get(2).getText();
        if (array.contains("\"")) {
            String value_str = array.substring(1,array.length() - 1);
            String[] value_arr = value_str.split(",");
            for (int i = 0; i < value_arr.length; i++) {
                if (value_arr[i].startsWith("\"") && value_arr[i].length() > 2) {
                    value_arr[i] = value_arr[i].substring(1,value_arr[i].length() - 1);
                }
            }
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                    .must(QueryBuilders.termsQuery(param, value_arr));
            stack.push(boolQueryBuilder);
        }else {
            String value_str = array.substring(1,array.length() - 1);
            String[] value_arr = value_str.split(",");
            int[] value_int = new int[value_arr.length];
            for (int i = 0; i < value_arr.length; i++) {
                value_int[i] = Integer.parseInt(value_arr[i]);
            }
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                    .must(QueryBuilders.termsQuery(param, value_int));
            stack.push(boolQueryBuilder);
        }
    }

    @Override
    public void enterNotInExpr(ESInitParser.NotInExprContext ctx) {

    }

    @Override
    public void exitNotInExpr(ESInitParser.NotInExprContext ctx) {

    }

    @Override
    public void enterArray(ESInitParser.ArrayContext ctx) {

    }

    @Override
    public void exitArray(ESInitParser.ArrayContext ctx) {

    }

    @Override
    public void enterParse(ESInitParser.ParseContext ctx) {

    }

    @Override
    public void exitParse(ESInitParser.ParseContext ctx) {

    }

    @Override
    public void enterParam(ESInitParser.ParamContext ctx) {

    }

    @Override
    public void exitParam(ESInitParser.ParamContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void enterExpression(ESInitParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(ESInitParser.ExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() < 2) {
            return;
        }
        String logic = children.get(1).getText();
        Object top1 = stack.peek();
        Object top2 = stack.elementAt(stack.size() - 2);
        if (Objects.equals(logic, OpEnum.OR.getValue())) {
            MergeOr((BoolQueryBuilder) top1, (BoolQueryBuilder) top2);
            return;
        }
        if (top1 instanceof BoolQueryBuilder && top2 instanceof BoolQueryBuilder) {
            MergeAnd((BoolQueryBuilder) top1, (BoolQueryBuilder) top2);
        }
    }

    public Stack<Object> getStack() {
        return stack;
    }

    public void MergeOr(BoolQueryBuilder top1, BoolQueryBuilder top2) {
        if (Objects.equals(top1.getClass().getName(), BoolQueryBuilder.class.getName())) {
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
            if (top1.must().size() > 1) {
                boolQueryBuilder.should(top1);
            } else {
                boolQueryBuilder.should(top1.must().get(0));
            }
            if (top2.must().size() > 1) {
                boolQueryBuilder.should(top2);
            } else {
                boolQueryBuilder.should(top2.must().get(0));
            }
            stack.pop();
            stack.pop();
            stack.push(boolQueryBuilder);
        }

    }

    public void MergeAnd(BoolQueryBuilder top1, BoolQueryBuilder top2) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        for (QueryBuilder queryBuilder : top1.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        for (QueryBuilder queryBuilder : top2.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        for (QueryBuilder queryBuilder : top1.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        for (QueryBuilder queryBuilder : top2.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        stack.pop();
        stack.pop();
        stack.push(boolQueryBuilder);

    }

}
