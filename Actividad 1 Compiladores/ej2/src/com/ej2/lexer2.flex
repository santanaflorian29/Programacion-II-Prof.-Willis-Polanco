package com.ej2;
import static com.ej2.Tokens.*;

%%

//me class

%class Lexer2
%type Tokens

//expreciona a usar
repeticiones=(a|b)
myalfabeto = [a-z]*


//my analizador
analyzer2={repeticiones}{myalfabeto}{repeticiones}


%{
	public String gerlexer;
	
%}
%%

 //salida de mi token
 {analyzer2} {gerlexer =yytext(); return Tokens.Ustes_es_un_duro_lider;}
 
 
 