grammar EsInit;

parse : expression EOF;

expression
    :   '!' expression  #notExpression
    |   '('expression')'    #parenExpression
    |   expression AND expression   #andExpression
    |   expression OR expression    #orExpression
    |   expr    #commonExpression
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
    |   param DOT rank NUMBER   #RankExpr
    ;

array
    :'['']'
    |'[' value (','value)* ']'
    ;

param
    :   IDENTIFIER
    ;

value
    :   STRING
    |   NUMBER
    |   TIME
    |   'true'
    |   'false'
    |   'null'
    ;

regex
    :REGEX
    ;

rank
    :   TOP
    |   BOT
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
TOP :   'top';
BOT :   'bot';


IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* | [0-9]+ [a-zA-Z_] [a-zA-Z_0-9]*;
STRING :  '"' (ESC | ~["\\] )*  '"';
TIME : [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9]' '[0-9][0-9]':'[0-9][0-9]':'[0-9][0-9]'.'[0-9][0-9][0-9];
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;


NUMBER
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;

fragment INT :   '0' | '1'..'9' '0'..'9'* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\n\r]+ -> skip ;
