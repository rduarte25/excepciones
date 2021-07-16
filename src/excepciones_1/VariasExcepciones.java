package excepciones_1;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		division();	
		
		} catch (ArithmeticException e) {
			
			System.out.println("Esta divisindo entre 0");
			
		} catch (NumberFormatException e) {
			
			System.out.println("No haz introducido un número");
			
			System.out.println(e.getMessage());
			
			System.out.println("se a generado un error de tipo " + e.getClass().getName());
		
			
		}
	}
		
	
	public static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es: " + num1 / num2);
		
	}

}
