package dominio;
import java.util.ArrayList;

public class Contacto {
		private String nombre;
		private int numeroDeTelefono;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getNumeroDeTelefono() {
			return numeroDeTelefono;
		}
		public void setNumeroDeTelefono(int numeroDeTelefono) {
			this.numeroDeTelefono = numeroDeTelefono;
		}
		
		public Contacto(String nombre, int numeroDeTelefono){
			this.nombre = nombre;
			this.numeroDeTelefono = numeroDeTelefono;
		}
		
		public Contacto(){
			
		}
		public String toString() {
			StringBuilder datos = new StringBuilder("Nombre: "+nombre+" con el numero de telefono: "+numeroDeTelefono);
			return datos.toString();
			
			}
		public void addContacto(ArrayList<Contacto>contactos) {
			contactos.addAll(contactos);
		
		}
		public void addContactos(ArrayList<Contacto>contactos) {
			contactos.addAll(contactos);
		
		}

}
