package eje1;
import static eje1.Tokens.*;

%%
//Nombre de la Clase JFLEX
%class Lexer1
%type Tokens

//Variables de Expresion regular
charater=[A-Za-z_]
number = [0-9]

//Expresion Regular
analizador1= {charater}+({number}|{charater})+({number}|{charater})


%{
	public String lexeme;
%}

%%

//Valor del Token
{analizador1} {lexeme = yytext(); return Tokens.Verdadero}

