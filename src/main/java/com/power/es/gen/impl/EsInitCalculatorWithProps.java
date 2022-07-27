package com.power.es.gen.impl;

import com.power.es.AIQL.MergeUtils;
import com.power.es.base.context.ValueContext;
import com.power.es.base.common.ValueTypeEnum;
import com.power.es.gen.boolquery.EsInitListener;
import com.power.es.gen.boolquery.EsInitParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author A_Nan
 */
public class EsInitCalculatorWithProps implements EsInitListener {

    private ParseTreeProperty<SearchSourceBuilder> treeProperty = new ParseTreeProperty<>();

    private ParseTreeProperty<ValueContext> valueProperty = new ParseTreeProperty<>();

    @Override
    public void enterParse(EsInitParser.ParseContext ctx) {

    }

    @Override
    public void exitParse(EsInitParser.ParseContext ctx) {

    }

    @Override
    public void enterEsAllExpression(EsInitParser.EsAllExpressionContext ctx) {

    }

    @Override
    public void exitEsAllExpression(EsInitParser.EsAllExpressionContext ctx) {
        String value = valueProperty.get(ctx.children.get(1)).getValue().toString();
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.queryStringQuery(value));
        treeProperty.put(ctx, sourceBuilder);
    }

    @Override
    public void enterOrExpression(EsInitParser.OrExpressionContext ctx) {

    }

    @Override
    public void exitOrExpression(EsInitParser.OrExpressionContext ctx) {
        ParseTree expression1 = ctx.children.get(0);
        ParseTree expression2 = ctx.children.get(2);
        SearchSourceBuilder sourceBuilder = MergeUtils.MergeOr(treeProperty.get(expression1), treeProperty.get(expression2));
        treeProperty.put(ctx, sourceBuilder);
    }

    @Override
    public void enterAndExpression(EsInitParser.AndExpressionContext ctx) {

    }

    @Override
    public void exitAndExpression(EsInitParser.AndExpressionContext ctx) {
        ParseTree expression1 = ctx.children.get(0);
        ParseTree expression2 = ctx.children.get(2);
        SearchSourceBuilder sourceBuilder = MergeUtils.MergeAnd(treeProperty.get(expression1), treeProperty.get(expression2));
        treeProperty.put(ctx, sourceBuilder);
    }

    @Override
    public void enterAggreExpression(EsInitParser.AggreExpressionContext ctx) {

    }

    @Override
    public void exitAggreExpression(EsInitParser.AggreExpressionContext ctx) {
        treeProperty.put(ctx, treeProperty.get(ctx.getChild(0)));
    }

    @Override
    public void enterNotExpression(EsInitParser.NotExpressionContext ctx) {

    }

    @Override
    public void exitNotExpression(EsInitParser.NotExpressionContext ctx) {
        //获取到括号内得表达式
        //注：“非”逻辑不论包含多少参数都需加上括号，NOT(a==1)、 NOT(a == 1 AND b == 2)
        ParseTree tree = ctx.children.get(1);
        SearchSourceBuilder sourceBuilder = MergeUtils.MergeNot(treeProperty.get(tree));
        treeProperty.put(ctx, sourceBuilder);
    }

    @Override
    public void enterParenExpression(EsInitParser.ParenExpressionContext ctx) {

    }

    @Override
    public void exitParenExpression(EsInitParser.ParenExpressionContext ctx) {
        ParseTree tree = ctx.children.get(1);
        treeProperty.put(ctx, treeProperty.get(tree));
    }

    @Override
    public void enterCommonExpression(EsInitParser.CommonExpressionContext ctx) {

    }

    @Override
    public void exitCommonExpression(EsInitParser.CommonExpressionContext ctx) {
        ParseTree tree = ctx.getChild(0);
        treeProperty.put(ctx, treeProperty.get(tree));
    }

    @Override
    public void enterLtExpr(EsInitParser.LtExprContext ctx) {

    }

    @Override
    public void exitLtExpr(EsInitParser.LtExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ParseTree valueNode = ctx.getChild(2);
        ValueContext value = valueProperty.get(valueNode);
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(new RangeQueryBuilder(param).lt(value.getValue())));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterGtExpr(EsInitParser.GtExprContext ctx) {

    }

    @Override
    public void exitGtExpr(EsInitParser.GtExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(new RangeQueryBuilder(param).gt(value.getValue())));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterLeExpr(EsInitParser.LeExprContext ctx) {

    }

    @Override
    public void exitLeExpr(EsInitParser.LeExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(new RangeQueryBuilder(param).lte(value.getValue())));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterGeExpr(EsInitParser.GeExprContext ctx) {

    }

    @Override
    public void exitGeExpr(EsInitParser.GeExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(new RangeQueryBuilder(param).gte(value.getValue())));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterNeExpr(EsInitParser.NeExprContext ctx) {

    }

    @Override
    public void exitNeExpr(EsInitParser.NeExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().mustNot(QueryBuilders.termQuery(param, value.getValue())));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterEqExpr(EsInitParser.EqExprContext ctx) {

    }

    @Override
    public void exitEqExpr(EsInitParser.EqExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        switch (value.getType()) {
            case IPV4:
            case IPV6: {
                boolQueryBuilder.must(QueryBuilders.prefixQuery(param, value.getValue().toString()));
                break;
            }
            default: {
                boolQueryBuilder.must(QueryBuilders.termQuery(param, value.getValue()));
            }
        }
        SearchSourceBuilder builder = new SearchSourceBuilder().query(boolQueryBuilder);
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterContainExpr(EsInitParser.ContainExprContext ctx) {

    }

    @Override
    public void exitContainExpr(EsInitParser.ContainExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(
                        QueryBuilders.wildcardQuery(param, "*" + value.getValue().toString() + "*")
                ));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterNotContainExpr(EsInitParser.NotContainExprContext ctx) {

    }

    @Override
    public void exitNotContainExpr(EsInitParser.NotContainExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ValueContext value = valueProperty.get(ctx.getChild(2));
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().mustNot(
                        QueryBuilders.wildcardQuery(param, "*" + value.getValue().toString() + "*")
                ));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterInExpr(EsInitParser.InExprContext ctx) {

    }

    @Override
    public void exitInExpr(EsInitParser.InExprContext ctx) {
        String param = ctx.getChild(0).getText();
        ArrayList value = (ArrayList) valueProperty.get(ctx.getChild(2)).getValue();
        SearchSourceBuilder builder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(QueryBuilders.termsQuery(param, value)));
        treeProperty.put(ctx, builder);
    }

    @Override
    public void enterNotInExpr(EsInitParser.NotInExprContext ctx) {

    }

    @Override
    public void exitNotInExpr(EsInitParser.NotInExprContext ctx) {

    }

    @Override
    public void enterExistExpr(EsInitParser.ExistExprContext ctx) {

    }

    @Override
    public void exitExistExpr(EsInitParser.ExistExprContext ctx) {

    }

    @Override
    public void enterNotExistExpr(EsInitParser.NotExistExprContext ctx) {

    }

    @Override
    public void exitNotExistExpr(EsInitParser.NotExistExprContext ctx) {

    }

    @Override
    public void enterRegexExpr(EsInitParser.RegexExprContext ctx) {

    }

    @Override
    public void exitRegexExpr(EsInitParser.RegexExprContext ctx) {
        String param = ctx.getChild(0).getText();
        String value = valueProperty.get(ctx.getChild(2)).getValue().toString();
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder()
                .query(new BoolQueryBuilder().must(QueryBuilders.regexpQuery(param, value)));
        treeProperty.put(ctx, sourceBuilder);
    }

    @Override
    public void enterArray(EsInitParser.ArrayContext ctx) {

    }

    @Override
    public void exitArray(EsInitParser.ArrayContext ctx) {
        List<ParseTree> children = ctx.children;
        //ArrayList<Object> arr = new ArrayList<>();
        List<Object> list = children.stream().filter(x -> x.getChildCount() >= 1).map(x -> valueProperty.get(x).getValue()).collect(Collectors.toList());
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.ARRAY, list));
    }

    @Override
    public void enterMaxAggExpr(EsInitParser.MaxAggExprContext ctx) {

    }

    @Override
    public void exitMaxAggExpr(EsInitParser.MaxAggExprContext ctx) {

    }

    @Override
    public void enterMinAggExpr(EsInitParser.MinAggExprContext ctx) {

    }

    @Override
    public void exitMinAggExpr(EsInitParser.MinAggExprContext ctx) {

    }

    @Override
    public void enterAvgAggExpr(EsInitParser.AvgAggExprContext ctx) {

    }

    @Override
    public void exitAvgAggExpr(EsInitParser.AvgAggExprContext ctx) {

    }

    @Override
    public void enterGroupAggExpr(EsInitParser.GroupAggExprContext ctx) {

    }

    @Override
    public void exitGroupAggExpr(EsInitParser.GroupAggExprContext ctx) {
        String param = ctx.getChild(0).getText();
        if (Objects.isNull(treeProperty.get(ctx.getChild(3)))) {
            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder()
                    .aggregation(AggregationBuilders.terms(param));
            treeProperty.put(ctx, sourceBuilder);
        } else {
            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder()
                    .aggregation(AggregationBuilders.terms(param));
            sourceBuilder.query(treeProperty.get(ctx.getChild(3)).query());
            treeProperty.put(ctx, sourceBuilder);
        }
    }

    @Override
    public void enterParenValve(EsInitParser.ParenValveContext ctx) {

    }

    @Override
    public void exitParenValve(EsInitParser.ParenValveContext ctx) {
        if (ctx.getChildCount() < 2) {
            treeProperty.put(ctx, null);
        }
        valueProperty.put(ctx, valueProperty.get(ctx.getChild(1)));
    }

    @Override
    public void enterParam(EsInitParser.ParamContext ctx) {

    }

    @Override
    public void exitParam(EsInitParser.ParamContext ctx) {

    }

    @Override
    public void enterIpV4Value(EsInitParser.IpV4ValueContext ctx) {

    }

    @Override
    public void exitIpV4Value(EsInitParser.IpV4ValueContext ctx) {
        String ip = ctx.getChild(0).getText();
        ip = ip.substring(1, ip.length() - 1);
        //目前不支持子网掩码形式，去除掩码部分
        if (ip.contains("/")) {
            ip = ip.substring(0, ip.indexOf("/"));
        }
        int index = ip.length();
        //通配符位置获取
        if (ip.contains("*")) {
            index = Math.min(ip.indexOf("*"), index);
        }
        ip = ip.substring(0, index);
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.IPV4, ip));
    }

    @Override
    public void enterIpV6Valve(EsInitParser.IpV6ValveContext ctx) {

    }

    @Override
    public void exitIpV6Valve(EsInitParser.IpV6ValveContext ctx) {
        String ip = ctx.getChild(0).getText();
        ip = ip.substring(1, ip.length() - 1);
        int index = Integer.MAX_VALUE;
        if (ip.contains("*")) {
            index = Math.min(index, ip.indexOf('*'));
            ip = ip.substring(0, index);
        }
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.IPV6, ip));
    }

    @Override
    public void enterStringValue(EsInitParser.StringValueContext ctx) {

    }

    @Override
    public void exitStringValue(EsInitParser.StringValueContext ctx) {
        String str = ctx.getChild(0).getText();
        str = str.substring(1, str.length() - 1);
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.STRING, str));
    }

    @Override
    public void enterNumberValue(EsInitParser.NumberValueContext ctx) {

    }

    @Override
    public void exitNumberValue(EsInitParser.NumberValueContext ctx) {
        int number = Integer.parseInt(ctx.getChild(0).getText());
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.NUMBER, number));
    }

    @Override
    public void enterTimeValue(EsInitParser.TimeValueContext ctx) {

    }

    @Override
    public void exitTimeValue(EsInitParser.TimeValueContext ctx) {
        String time = ctx.getChild(0).getText();
        StringBuilder res = new StringBuilder();
        if (time.length() < 20) {
            for (char c : time.toCharArray()) {
                res.append(c);
            }
            res.append(".000");
        }
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.TIME, res.toString()));
    }

    @Override
    public void enterTrueValue(EsInitParser.TrueValueContext ctx) {

    }

    @Override
    public void exitTrueValue(EsInitParser.TrueValueContext ctx) {
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.TRUE, Boolean.TRUE));
    }

    @Override
    public void enterFalseValue(EsInitParser.FalseValueContext ctx) {

    }

    @Override
    public void exitFalseValue(EsInitParser.FalseValueContext ctx) {
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.FALSE, Boolean.FALSE));
    }

    @Override
    public void enterNullValue(EsInitParser.NullValueContext ctx) {

    }

    @Override
    public void exitNullValue(EsInitParser.NullValueContext ctx) {
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.NULL, null));
    }

    @Override
    public void enterRegex(EsInitParser.RegexContext ctx) {

    }

    @Override
    public void exitRegex(EsInitParser.RegexContext ctx) {
        String value = ctx.getChild(0).getText();
        valueProperty.put(ctx, new ValueContext(ValueTypeEnum.REGEX, value));
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

    public SearchSourceBuilder getBuilder(ParseTree tree) {
        return treeProperty.get(tree);
    }
}
