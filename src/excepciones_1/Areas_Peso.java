package excepciones_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1 Cuadrado \n2 Rectagulo \n3 Triangulo \n4 Circulo");
		
		try {
		
			figura = entrada.nextInt();
		
		} catch ( Exception e ) {
			
			System.out.println("Ocurrio un error");
			
		} finally {
			
			entrada.close();
			
		}		
		
		switch ( figura ) {
		
			case 1:
				
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el lado"));
				
				System.out.println(Math.pow(lado, 2));
				
				break;
				
			case 2:
				
				int base = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base"));
				
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura"));
				
				System.out.println("El area del rectangulo es " + base*altura);
				
				break;
				
			case 3:
				
				base = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base"));
				
				altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura"));
				
				System.out.println("El area del triangulo es " + (base*altura)/2);
				
				break;
				
			case 4:
				
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el radio"));
				
				System.out.println("El area del circulo es " + Math.pow(radio, 2));
				
				break;
				
			default:
				System.out.println("La opció no es correcta.");
		}
		
		
		
//-----------------------------------------------------------------
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce tu altura en centimetros"));
		
		System.out.println("Si eres hombre tu pesos ideal es: " + (altura - 110) + "kg.");
		
		System.out.println("Si eres mujer tu pesos ideal es: " + (altura - 120) + "kg.");
		
	}
	
	private static int figura;

}
