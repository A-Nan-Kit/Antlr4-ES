grammar ESInit;

parse : expression EOF;

expression
    :   expression AND expression
    |   expression OR expression
    |   expr
    ;

expr
    :   param LT value  #LtExpr
    |   param GT value  #GtExpr
    |   param LE value  #LeExpr
    |   param GE value  #GeExpr
    |   param NE value  #NeExpr
    |   param EQ value  #EqExpr
    |   param LIKE value  #LikeExpr
    |   param IN array  #InExpr
    |   param NOT_IN array  #NotInExpr
    |   param EXIST  #Exist
    |   param NOT_EXIST  #NotExist
    ;
    /*
    |   param op=(LT|GT|LE|GE) value
    |   param op=LIKE value
    ;*/

array
    :'['']'
    |'[' value (','value)* ']'
    ;

param
    :   IDENTIFIER
    ;

value
    :   STRING  #String
    |   NUMBER  #Number
    |   TIME    #Time
    |   'true'  #True
    |   'false' #False
    |   'null'  #Null
    ;

AND :   'AND';
OR  :   'OR';
EQ  :   '==';
NE  :   '!=';
LT  :   '<';
GT  :   '>';
LE  :   '<=';
GE  :   '>=';
LIKE:   'LIKE';
IN  :   'IN';
NOT_IN  :   'NOT_IN';
EXIST   :   'EXIST';
NOT_EXIST   :   'NOT_EXIST';


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
