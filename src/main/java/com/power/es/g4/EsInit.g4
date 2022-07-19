grammar EsInit;

parse : expression EOF;

expression
    :   '!' expression      #notExpression
    |   '('expression')'    #parenExpression
    |   aggexpr             #aggreExpression
    |   expression AND expression   #andExpression
    |   expression OR expression    #orExpression
    |   expr                #commonExpression
    ;

expr
    :   param LT value  #LtExpr
    |   param GT value  #GtExpr
    |   param LE value  #LeExpr
    |   param GE value  #GeExpr
    |   param NE value  #NeExpr
    |   param EQ value  #EqExpr
    |   param CONTAIN value  #ContainExpr
    |   param NOTCONTAIN value  #NotContainExpr
    |   param IN array  #InExpr
    |   param NOT_IN array  #NotInExpr
    |   param EXIST #ExistExpr
    |   param NOT_EXIST #NotExistExpr
    |   param REG regex #RegexExpr
    ;

array
    :'['']'
    |'[' value (','value)* ']'
    ;

aggexpr
    :   param DOT MAX parenValve #MaxAggExpr
    |   param DOT MIN parenValve #MinAggExpr
    |   param DOT AVG parenValve #AvgAggExpr
    |   param DOT GROUP parenValve  #GroupAggExpr
    ;

parenValve
    :   '('')'
    |   '(' aggexpr ')'
    |   '(' expression ')'
    ;

param
    :   IDENTIFIER
    ;

value
    :   IPv4    #IpV4Value
    |   IPv6    #IpV6Valve
    |   STRING  #StringValue
    |   NUMBER  #NumberValue
    |   TIME    #TimeValue
    |   'true'  #TrueValue
    |   'false' #FalseValue
    |   'null'  #NullValue
    ;

regex
    :REGEX
    ;

IPv4
    :   '"'SEGMENT DOT SEGMENT DOT SEGMENT DOT SEGMENT '"'
    |   '"'SEGMENT DOT SEGMENT DOT SEGMENT DOT SEGMENT '/' NUMBER '"'
    ;


IPv6
    :   '"' SEGMENTv6 (':' SEGMENTv6)+ '"'
    |   '"' (SEGMENTv6 ':' )+ ':' SEGMENTv6 (':' SEGMENTv6)*'"'
    ;

STRING
    :   '"' (ESC | ~["\\] )*  '"'
    ;
REGEX   :   '/' (ESC | ~["\\] )* '/';

AND :   'AND';
OR  :   'OR';
EQ  :   '==';
NE  :   '!=';
LT  :   '<';
GT  :   '>';
LE  :   '<=';
GE  :   '>=';
REG :   '=~';
LIKE:   'LIKE';
IN  :   'IN';
NOT_IN  :   'NOT_IN';
EXIST   :   'EXIST';
NOT_EXIST   :   'NOT_EXIST';
NOT :   'NOT';
DOT :   '.';
CONTAIN :   'CONTAIN';
NOTCONTAIN  :   'NOTCONTAIN';

MAX :   'max';
MIN :   'min';
SUM :   'sum';
AVG :   'agv';
GROUP   :   'group';

IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* | [0-9]+ [a-zA-Z_] [a-zA-Z_0-9]*;

TIME
    :   [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9]' '[0-9][0-9]':'[0-9][0-9]':'[0-9][0-9]'.'[0-9][0-9][0-9]
    |   [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9]' '[0-9][0-9]':'[0-9][0-9]':'[0-9][0-9]
    ;
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;


NUMBER
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;

SEGMENTv6
    :   (([0-9] | [a-f] | [A-F])+) ([0-9] | [a-f] | [A-F])*
    |   '*'
    ;

SEGMENT
    :   ([0-9] | [1-9][0-9] | '1'[0-9][0-9] | '2'[0-4]'5' | [1-2]'5'[0-4] )
    |   '*'
    ;


fragment INT :   '0' | '1'..'9' '0'..'9'* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\n\r]+ -> skip ;
