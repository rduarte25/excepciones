package excepciones_1;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		
		int[] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		
		mi_matriz[1] = 18;
		
		mi_matriz[2] = -15;
		
		mi_matriz[3] = 92;
		
		mi_matriz[4] = 71;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Posición " + i + " = " + mi_matriz[i]);
			
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años" + " El programa termino su ejecución ");
		
	}
	
}
