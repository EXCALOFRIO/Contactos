package interfaz;
import dominio.*;
import java.util.Scanner;
import aplicacion.*;
import java.util.ArrayList;
public class Interfaz {
	
	
	public String nombre;
	Scanner sc = new Scanner(System.in);
	try { 
		String nom = sc.nextLine();
		nombre = nom;
	}catch(Exception e){
		System.out.println(" no has introducido un nombre correcto");
		sc.next();
	}
}
