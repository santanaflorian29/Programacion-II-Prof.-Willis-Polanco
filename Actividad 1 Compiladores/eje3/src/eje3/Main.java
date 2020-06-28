package eje3;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.JOptionPane;


public class Main {

	
	public static void main (String []args) throws IOException
	
	{
		//String imput3 = "C:/Users/Meliodas/eclipse-workspace/eje3/src/eje3/lexer3.flex";
		//mygenerador(imput3);
		try 
		{
			
			//Generate JFlex 
			
				
			
			
			
			//Input the text
			String inputt = (JOptionPane.showInputDialog("Ingrese el idicador"));
			//Instanciar la clase
			Lexer3 lexer3 = new Lexer3(new StringReader(inputt));
			//Evaluar e imprimir resultado
			System.out.println("Expresion regular = " + lexer3.yylex());	
			
			
			
			
		}
		
		catch(Error | IOException ex)
		{
			System.out.println("ERROR LEXICO"+"  "+"INTENTELO DE NUEVO MI LIDER");
		}
		
	}
	
	//Method for generate JFLEX Class
		public static void mygenerador(String imput3) 
		{
			File file = new File(imput3);
			jflex.Main.generate(file);
		}
	
	
}
