grammar RosIdl;

specification: definition+;
definition: simple_definition | array_definition;

simple_definition: TYPE NAME  WS? EOL*;
array_definition: TYPE '[' ']' NAME  WS? EOL*;

// lexer
TYPE: 'bool' | 'byte' | 'char' | 'float32' | 'float64' | 'int8' | 'uint8' | 'int16' |
    'uint16' | 'int32' | 'uint32' | 'int64' | 'uint64' | 'string';
NAME: LETTER (LETTER|DIGIT)*;
fragment LETTER : [a-zA-Z];
fragment DIGIT: [0-9];
COMMENT : ('/' '/' .*? '\n' | '/*' .*? '*/') -> skip;
WS  :   [ \t]+ -> skip; // toss out whitespace
EOL  :   [\r\n];