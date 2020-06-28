package eje3;
import static ejemplo.Tokens.*;

%%
//Nombre de la Clase JFLEX
%class Lexer3
%type Tokens

//Variables de Expresion regular
mydigic=(10)
numberssss = [0-9]{5}

//Expresion Regular
analizador3={mydigic} {numberssss}


%{
	public String lexeme;
%}

%%

//Valor del Token
{analizador3} {lexeme = yytext(); return Tokens.Trueeee}

