package excepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Qué deseas hacer?");
		
		System.out.println("1. Introducir datos");
		
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if (decision == 1) {
			
			try {
			
				pedirDatos();
			
			} catch( Exception e ) {
				
				System.out.println("El valor no es lógico.");
				
			}
			
		} else if (decision == 2) {
			
			System.out.println("Adios");
			
			System.exit(0);
			
		}
	
		entrada.close();
		
	}
	
	public static void pedirDatos() throws InputMismatchException {
		
		//try {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre");
			
			String nombre = entrada.nextLine();
			
			System.out.println("Introduce tu edad");
			
			int edad = entrada.nextInt();
			
			System.out.println("Hola " + nombre + " El año que viene tendras " + (edad + 1 ) + " años");
			
		//} catch (Exception e) {
			//System.out.println("El valor de la edad no es correcta");
		//}
		
	}
	

}
