package excepciones_1;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_Datos1 {

	public static void main ( String [] args ) {
		
		String email = JOptionPane.showInputDialog("email");
		
		try {
			
			examina_email( email );
			
		} catch (Exception e) {
			
			System.out.println("El correo es incorrecto");
		
			e.printStackTrace();
			
		}
		
	}
	
	public static void examina_email ( String email ) /*throws EOFException*/ throws LongitudEmailErronea {
		
		int arroba = 0;
		
		boolean punto = false;
		
		if ( email.length() <= 3 ) {
			
			//throw new EOFException();
			throw new LongitudEmailErronea("El correo demaciado corto");
			
		} else {
			
			for ( int i = 0; i < email.length(); i++ ) {
				
				if ( email.charAt(i) == '@' ) {
					
					arroba++;
					
				}
				
				if ( email.charAt(i) == '.' ) {
					
					punto = true;
					
				}
				
			}
			
			if ( arroba == 1 && punto) {
				
				System.out.println("Correcto");
				
			} else {
				
				System.out.println("Incorrecto");
				
			}
			
		}
		
	}
	
	
}

class LongitudEmailErronea extends Exception {
	
	public LongitudEmailErronea() {
		
		
		
	}
	
	public LongitudEmailErronea( String msj_error ) {
		
		super(msj_error);
		
		
		
	}
	
}

