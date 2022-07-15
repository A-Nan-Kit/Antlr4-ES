# Antlr4-ES
ElasticSearch query statement translator based on antlr4<br>
表达式一： 变量 运算符 值<br>
  变量: 非数字开头的数字、字母、下划线组合<br>
  运算符：

    "=="  ：等于
    "!="  ：不等于
    ">"   :大于
    "<"   ：小于
    "<="  ：小于等于
    ">="  ：大于等于
    "=~"  : 正则
    "!~"  : 正则取反
    "IN"  ：包含在
    "NOT_IN"  ：不包含在
    "CONTAINS"
    "NOTCONTAINS"
  值: 数字（INT类型）、字符串、数组、时间<br>
常规查询：a == 123 AND b == 456 AND name == "张三"<br>
```JSON
{
  "bool" : {
    "must" : [
      {
        "term" : {
          "name" : {
            "value" : "张三",
            "boost" : 1.0
          }
        }
      },
      {
        "term" : {
          "b" : {
            "value" : "456",
            "boost" : 1.0
          }
        }
      },
      {
        "term" : {
          "a" : {
            "value" : "123",
            "boost" : 1.0
          }
        }
      }
    ],
    "adjust_pure_negative" : true,
    "boost" : 1.0
  }
}
```
a>=2022-07-11 16:00:00.000 AND b<=2022-07-11 17:00:00.000 （待优化）
```JSON
{
  "bool" : {
    "must" : [
      {
        "range" : {
          "b" : {
            "from" : null,
            "to" : "2022-07-11 17:00:00.000",
            "include_lower" : true,
            "include_upper" : true,
            "boost" : 1.0
          }
        }
      },
      {
        "range" : {
          "a" : {
            "from" : "2022-07-11 16:00:00.000",
            "to" : null,
            "include_lower" : true,
            "include_upper" : true,
            "boost" : 1.0
          }
        }
      }
    ],
    "adjust_pure_negative" : true,
    "boost" : 1.0
  }
}
```
包含关系 name IN ["法外狂徒","张三","罗laoshi"]
```JSON
{
  "bool" : {
    "must" : [
      {
        "terms" : {
          "name" : [
            "法外狂徒",
            "张三",
            "罗laoshi"
          ],
          "boost" : 1.0
        }
      }
    ],
    "adjust_pure_negative" : true,
    "boost" : 1.0
  }
}
```
运算符<br>

    "EXIST"   ：存在
    "NOT_EXIST" ：不存在
   
以及逻辑连接词AND(与)、OR(或) !(非)<br>

