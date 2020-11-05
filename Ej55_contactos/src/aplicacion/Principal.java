package aplicacion;
import dominio.*;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args){

		//tengo que crear un metodo que añada lo introducido desde interfaz al Stringlist
		String[] nombre_contactos = {};
		int[] numero_telefono = {684098823,91587823,45968921};
		
		Libreta lis = new Libreta();
		for(int i = 0; i<nombre_contactos.length; i++) {
			Contacto con = new Contacto(nombre_contactos[i],numero_telefono[i]);
			contactos.addContactos(con);
		}
	
		}
			
	}

}
