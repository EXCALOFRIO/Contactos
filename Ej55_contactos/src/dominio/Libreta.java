package dominio;
import java.util.ArrayList;

public class Libreta {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	
	public String toString() {
		StringBuilder datos = new StringBuilder();
		for(Contacto con : contactos) {
			datos.append("\n"+con);
		}
		return contactos.toString();
	}
	
	public void addContactos(ArrayList<Contacto>contactos) {
		contactos.addAll(contactos);
	
	}

}
