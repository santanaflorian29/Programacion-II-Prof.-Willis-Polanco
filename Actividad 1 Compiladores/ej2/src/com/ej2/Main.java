package com.ej2;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.JOptionPane;


public class Main {

	
	public static void main (String []args) throws IOException
	
	{
		//String imput1 = "C:/Users/Meliodas/eclipse-workspace/ej2/src/com/ej2/lexer2.flex";
		//mygenerador(imput1);
		try 
		{
			
			//Generate JFlex 
			
				
			
			
			
			//Input the text
			String input2 = (JOptionPane.showInputDialog("Ingrese el idicador"));
			//Instanciar la clase
			Lexer2 lexer1 = new Lexer2(new StringReader(input2));
			//Evaluar e imprimir resultado
			System.out.println("Expresion regular = " + lexer1.yylex());	
			
			
			
			
		}
		
		catch(Error | IOException ex)
		{
			System.out.println("ERROR LEXICO"+"  "+"INTENTELO DE NUEVO MI LIDER");
		}
		
	}
	
	//Method for generate JFLEX Class
		public static void mygenerador(String imput1) 
		{
			File file = new File(imput1);
			jflex.Main.generate(file);
		}
	
	
}
