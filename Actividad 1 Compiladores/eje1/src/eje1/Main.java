package eje1;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) 
	{//String entrada1 = "C:/Users/Meliodas/eclipse-workspace/eje1/src/eje1/lexer1.flex";
	//generar(entrada1);
		try {
		//Generate JFlex Class
		
		
		//Input the text
		String input = (JOptionPane.showInputDialog("Ingrese el idicador"));
		//Instanciar la clase
		Lexer1 lexer1 = new Lexer1(new StringReader(input));
		//Evaluar e imprimir resultado
		System.out.println("Expresion regular = " + lexer1.yylex());
		}
		catch (Error | IOException ex) {
			
			//If nothing is correct then...
			System.out.println("ERROR ERROR ERROR ERROR ERROR ERROR ERROR ");
		}
	}
	
	//Method for generate JFLEX Class
	public static void generar(String entrada1) 
	{
		File file = new File(entrada1);
		jflex.Main.generate(file);
	}
}


