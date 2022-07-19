package com.power.es.AIQL;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.AggregatorFactories;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class MergeUtils {
    public static SearchSourceBuilder MergeAnd(SearchSourceBuilder builder1, SearchSourceBuilder builder2) {
        SearchSourceBuilder res = new SearchSourceBuilder();
        BoolQueryBuilder queryBuilder1 = (BoolQueryBuilder) builder1.query();
        BoolQueryBuilder queryBuilder2 = (BoolQueryBuilder) builder2.query();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        //合并条件中的must
        for (QueryBuilder queryBuilder : queryBuilder1.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        for (QueryBuilder queryBuilder : queryBuilder2.must()) {
            boolQueryBuilder.must(queryBuilder);
        }
        //合并条件中的must_not
        for (QueryBuilder queryBuilder : queryBuilder1.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        for (QueryBuilder queryBuilder : queryBuilder2.mustNot()) {
            boolQueryBuilder.mustNot(queryBuilder);
        }
        //合并条件中的should，需另外组合bool should
        if (!queryBuilder1.should().isEmpty()) {
            BoolQueryBuilder boolQueryBuilder1 = new BoolQueryBuilder();
            for (QueryBuilder queryBuilder : queryBuilder1.should()) {
                boolQueryBuilder1.should(queryBuilder);
            }
            boolQueryBuilder.must(boolQueryBuilder1.minimumShouldMatch(1));
        }
        if (!queryBuilder2.should().isEmpty()) {
            BoolQueryBuilder boolQueryBuilder2 = new BoolQueryBuilder();
            for (QueryBuilder queryBuilder : queryBuilder2.should()) {
                boolQueryBuilder2.should(queryBuilder);
            }
            boolQueryBuilder.must(boolQueryBuilder2.minimumShouldMatch(1));
        }
        //合并filter
        for (QueryBuilder builder : queryBuilder1.filter()) {
            boolQueryBuilder.filter(builder);
        }
        for (QueryBuilder builder : queryBuilder2.filter()) {
            boolQueryBuilder.filter(builder);
        }
        res.query(boolQueryBuilder);
        return res;
    }

    public static SearchSourceBuilder MergeOr(SearchSourceBuilder builder1, SearchSourceBuilder builder2) {
        SearchSourceBuilder res = new SearchSourceBuilder();
        BoolQueryBuilder queryBuilder1 = (BoolQueryBuilder) builder1.query();
        BoolQueryBuilder queryBuilder2 = (BoolQueryBuilder) builder2.query();
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        if (!queryBuilder1.must().isEmpty()) {
            if (queryBuilder1.must().size() > 1) {
                boolQueryBuilder.should(queryBuilder1);
            } else {
                boolQueryBuilder.should(queryBuilder1.must().get(0));
            }
        }
        if (!queryBuilder2.must().isEmpty()) {
            if (queryBuilder2.must().size() > 1) {
                boolQueryBuilder.should(queryBuilder2);
            } else {
                boolQueryBuilder.should(queryBuilder2.must().get(0));
            }
        }
        //合并should
        if (!queryBuilder1.should().isEmpty()) {
            for (QueryBuilder queryBuilder : queryBuilder1.should()) {
                boolQueryBuilder.should(queryBuilder);
            }
        }
        if (!queryBuilder2.should().isEmpty()) {
            for (QueryBuilder queryBuilder : queryBuilder2.should()) {
                boolQueryBuilder.should(queryBuilder);
            }
        }
        if (!queryBuilder1.mustNot().isEmpty()) {
            boolQueryBuilder.should((new BoolQueryBuilder()).mustNot(queryBuilder1.mustNot().get(0)));
        }
        if (!queryBuilder2.mustNot().isEmpty()) {
            boolQueryBuilder.should((new BoolQueryBuilder()).mustNot(queryBuilder2.mustNot().get(0)));
        }
        res.query(boolQueryBuilder);
        return res;
    }

    public static SearchSourceBuilder MergeNot(SearchSourceBuilder sourceBuilder) {
        SearchSourceBuilder res = new SearchSourceBuilder();
        BoolQueryBuilder boolQueryBuilder = (BoolQueryBuilder) sourceBuilder.query();
        res.query(new BoolQueryBuilder().mustNot(boolQueryBuilder));
        return res;
    }

    /**
     * 检验value值是否为 .g4文件定义得String，即以双引号开头和结尾
     *
     * @param text string
     * @return boolean
     */
    public static boolean isString(String text) {
        return (text.startsWith("/\"") && text.endsWith("\""));
    }

    public void andMergeMust(BoolQueryBuilder boolQueryBuilder, List<QueryBuilder> mustList) {
        if (!mustList.isEmpty()) {
            mustList.stream().map(boolQueryBuilder::must);
        }
        //return boolQueryBuilder;
    }

    public static void andMergeMustNot(BoolQueryBuilder boolQueryBuilder, List<QueryBuilder> mustNotList) {
        if (!mustNotList.isEmpty()) {
            mustNotList.stream().map(boolQueryBuilder::mustNot);
        }
        //return boolQueryBuilder;
    }

    public BoolQueryBuilder andMergeShould(List<QueryBuilder> shouldList1, List<QueryBuilder> shouldList2) {
        BoolQueryBuilder queryBuilder = new BoolQueryBuilder();
        if (!shouldList1.isEmpty()) {
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
            shouldList1.stream().map(boolQueryBuilder::should);
            queryBuilder.must(boolQueryBuilder);
        }
        if (!shouldList2.isEmpty()) {
            BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
            shouldList2.stream().map(boolQueryBuilder::should);
            queryBuilder.must(boolQueryBuilder);
        }
        return queryBuilder;
    }

    public BoolQueryBuilder andMergeFilter(BoolQueryBuilder boolQueryBuilder, List<QueryBuilder> filterList) {
        if (!filterList.isEmpty()) {
            filterList.stream().map(boolQueryBuilder::filter);
        }
        return boolQueryBuilder;
    }
}

