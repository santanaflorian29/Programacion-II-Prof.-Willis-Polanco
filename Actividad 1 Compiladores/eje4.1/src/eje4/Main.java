
package eje4;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.JOptionPane;


public class Main {

	
	public static void main (String []args) throws IOException
	
	{//String imput4 = "C:/Users/Meliodas/eclipse-workspace/eje4.1/src/eje4/lexer4.flex";
		//mygenerador(imput4);
		try 
		{
			
			//Generate JFlex 
			
				
			
			
			
			//Input the text
			String inputt = (JOptionPane.showInputDialog("Ingrese el idicador"));
			//Instanciar la clase
			Lexer4 lexer4 = new Lexer4(new StringReader(inputt));
			//Evaluar e imprimir resultado
			System.out.println("Expresion regular = " + lexer4.yylex());	
			
			
			
			
		}
		
		
		catch(Error | IOException ex)
		{
			System.out.println("ERROR LEXICO"+"  "+"INTENTELO DE NUEVO MI LIDER");
		}
		
	}
	
	//Method for generate JFLEX Class
		public static void mygenerador(String imput4) 
		{
			File file = new File(imput4);
			jflex.Main.generate(file);
		}
	
	
}
