package eje4;
import static eje4.Tokens.*;

%%
%caseless
//Nombre de la Clase JFLEX
%class Lexer4
%type Tokens
%ignorecase

//Variables de Expresion regular
upperylower = (integer|char|real)


//Expresion Regular
analizador4={upperylower}


%{
	public String lexeme;
%}

%%

//Valor del Token
{analizador4} {lexeme = yytext(); return Tokens.totalmentecierto;}

