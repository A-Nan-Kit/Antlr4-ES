package com.power.es.gen.impl;

import com.power.es.base.OpEnum;
import com.power.es.gen.EsInitListener;
import com.power.es.gen.EsInitParser;
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
public class EsInitListenerImpl implements EsInitListener {

    private Stack<Object> stack = new Stack<>();

    @Override
    public void enterRegexExpr(EsInitParser.RegexExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String regex = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .must(QueryBuilders.regexpQuery(param, regex));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void exitRegexExpr(EsInitParser.RegexExprContext ctx) {

    }

    @Override
    public void enterValue(EsInitParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(EsInitParser.ValueContext ctx) {

    }

    @Override
    public void enterRegex(EsInitParser.RegexContext ctx) {

    }

    @Override
    public void exitRegex(EsInitParser.RegexContext ctx) {

    }

    @Override
    public void enterExistExpr(EsInitParser.ExistExprContext ctx) {

    }

    @Override
    public void enterRankExpr(EsInitParser.RankExprContext ctx) {

    }

    @Override
    public void exitRankExpr(EsInitParser.RankExprContext ctx) {

    }

    @Override
    public void enterRank(EsInitParser.RankContext ctx) {

    }

    @Override
    public void exitRank(EsInitParser.RankContext ctx) {

    }

    @Override
    public void exitExistExpr(EsInitParser.ExistExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        param = param.substring(1,param.length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .must(QueryBuilders.existsQuery(param));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterNotExistExpr(EsInitParser.NotExistExprContext ctx) {

    }

    @Override
    public void exitNotExistExpr(EsInitParser.NotExistExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        param = param.substring(1,param.length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .mustNot(QueryBuilders.existsQuery(param));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterLtExpr(EsInitParser.LtExprContext ctx) {

    }

    @Override
    public void exitLtExpr(EsInitParser.LtExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).lt(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterGtExpr(EsInitParser.GtExprContext ctx) {

    }

    @Override
    public void exitGtExpr(EsInitParser.GtExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).gt(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterLeExpr(EsInitParser.LeExprContext ctx) {

    }

    @Override
    public void exitLeExpr(EsInitParser.LeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).lte(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterGeExpr(EsInitParser.GeExprContext ctx) {

    }

    @Override
    public void exitGeExpr(EsInitParser.GeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder().must(QueryBuilders.rangeQuery(param).gte(value));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterNeExpr(EsInitParser.NeExprContext ctx) {

    }

    @Override
    public void exitNeExpr(EsInitParser.NeExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText();
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(param, value));
        stack.push(queryBuilder);
    }

    @Override
    public void enterEqExpr(EsInitParser.EqExprContext ctx) {

    }

    @Override
    public void exitEqExpr(EsInitParser.EqExprContext ctx) {
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
    public void enterNotContainExpr(EsInitParser.NotContainExprContext ctx) {

    }

    @Override
    public void exitNotContainExpr(EsInitParser.NotContainExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText().substring(1,children.get(2).getText().length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .mustNot(QueryBuilders.wildcardQuery(param, "*" + value + "*"));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterContainExpr(EsInitParser.ContainExprContext ctx) {

    }

    @Override
    public void exitContainExpr(EsInitParser.ContainExprContext ctx) {
        List<ParseTree> children = ctx.children;
        String param = children.get(0).getText();
        String value = children.get(2).getText().substring(1,children.get(2).getText().length() - 1);
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder()
                .must(QueryBuilders.wildcardQuery(param, "*" + value + "*"));
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterInExpr(EsInitParser.InExprContext ctx) {

    }

    @Override
    public void exitInExpr(EsInitParser.InExprContext ctx) {
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
    public void enterNotInExpr(EsInitParser.NotInExprContext ctx) {

    }

    @Override
    public void exitNotInExpr(EsInitParser.NotInExprContext ctx) {

    }

    @Override
    public void enterArray(EsInitParser.ArrayContext ctx) {

    }

    @Override
    public void exitArray(EsInitParser.ArrayContext ctx) {

    }

    @Override
    public void enterParse(EsInitParser.ParseContext ctx) {

    }

    @Override
    public void exitParse(EsInitParser.ParseContext ctx) {

    }

    @Override
    public void enterParam(EsInitParser.ParamContext ctx) {

    }

    @Override
    public void exitParam(EsInitParser.ParamContext ctx) {
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
    public void enterOrExpression(EsInitParser.OrExpressionContext ctx) {

    }

    @Override
    public void exitOrExpression(EsInitParser.OrExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        String logic = children.get(1).getText();
        Object top1 = stack.peek();
        Object top2 = stack.elementAt(stack.size() - 2);
        MergeOr((BoolQueryBuilder) top1, (BoolQueryBuilder) top2);
    }

    @Override
    public void enterAndExpression(EsInitParser.AndExpressionContext ctx) {

    }

    @Override
    public void exitAndExpression(EsInitParser.AndExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        String logic = children.get(1).getText();
        Object top1 = stack.peek();
        Object top2 = stack.elementAt(stack.size() - 2);
        MergeAnd((BoolQueryBuilder) top1, (BoolQueryBuilder) top2);
    }

    @Override
    public void enterNotExpression(EsInitParser.NotExpressionContext ctx) {

    }

    @Override
    public void exitNotExpression(EsInitParser.NotExpressionContext ctx) {
        Object pop = stack.pop();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        boolQueryBuilder.mustNot((BoolQueryBuilder)pop);
        stack.push(boolQueryBuilder);
    }

    @Override
    public void enterParenExpression(EsInitParser.ParenExpressionContext ctx) {

    }

    @Override
    public void exitParenExpression(EsInitParser.ParenExpressionContext ctx) {

    }

    @Override
    public void enterCommonExpression(EsInitParser.CommonExpressionContext ctx) {

    }

    @Override
    public void exitCommonExpression(EsInitParser.CommonExpressionContext ctx) {

    }

    public Stack<Object> getStack() {
        return stack;
    }

    public void MergeOr(BoolQueryBuilder top1, BoolQueryBuilder top2) {
        if (Objects.equals(top1.getClass().getName(), BoolQueryBuilder.class.getName())) {
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
            if (!top1.must().isEmpty()) {
                if (top1.must().size() > 1) {
                    boolQueryBuilder.should(top1);
                } else {
                    boolQueryBuilder.should(top1.must().get(0));
                }
            }
            if (!top2.must().isEmpty()) {
                if (top2.must().size() > 1) {
                    boolQueryBuilder.should(top2);
                } else {
                    boolQueryBuilder.should(top2.must().get(0));
                }
            }
            //合并should
            if (!top1.should().isEmpty()) {
                for (QueryBuilder queryBuilder : top1.should()) {
                    boolQueryBuilder.should(queryBuilder);
                }
            }
            if (!top2.should().isEmpty()) {
                for (QueryBuilder queryBuilder : top2.should()) {
                    boolQueryBuilder.should(queryBuilder);
                }
            }
            if (!top1.mustNot().isEmpty()) {
                boolQueryBuilder.should((new BoolQueryBuilder()).mustNot(top1.mustNot().get(0)));
            }
            if (!top2.mustNot().isEmpty()) {
                boolQueryBuilder.should((new BoolQueryBuilder()).mustNot(top2.mustNot().get(0)));
            }
            stack.pop();
            stack.pop();
            stack.push(boolQueryBuilder);
        }

    }

    public void MergeAnd(BoolQueryBuilder top1, BoolQueryBuilder top2) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        //合并条件中的must
        for (QueryBuilder queryBuilder : top1.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        for (QueryBuilder queryBuilder : top2.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        //合并条件中的must_not
        for (QueryBuilder queryBuilder : top1.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        for (QueryBuilder queryBuilder : top2.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        //合并条件中的should，需另外组合bool should
        if (!top1.should().isEmpty()){
            BoolQueryBuilder boolQueryBuilder1 = new BoolQueryBuilder();
            for (QueryBuilder queryBuilder : top1.should()) {
                boolQueryBuilder1.should(queryBuilder);
            }
            boolQueryBuilder.must(boolQueryBuilder1.minimumShouldMatch(1));
        }
        if (!top2.should().isEmpty()) {
            BoolQueryBuilder boolQueryBuilder2 = new BoolQueryBuilder();
            for (QueryBuilder queryBuilder : top2.should()) {
                boolQueryBuilder2.should(queryBuilder);
            }
            boolQueryBuilder.must(boolQueryBuilder2.minimumShouldMatch(1));
        }
        stack.pop();
        stack.pop();
        stack.push(boolQueryBuilder);

    }

}
