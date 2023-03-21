package practica4;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in); {
			System.out.println("Ingrese su nombre: ");
			String nombre = lectura.next();
			
			System.out.println("Ingrese su apellido: ");
			String apellido = lectura.next();
			
			System.out.println("Ingrese su edad: ");
			int edad = lectura.nextInt();
			
			System.out.println("El Usuario registrado como " + nombre + " " + apellido);
			
			if(edad>=18) {
				System.out.println("es mayor de edad.");}
			else{	
				System.out.println("es menor de edad.");}
			
		}
	}

}
	
