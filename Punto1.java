package practica4;

import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in); {
			System.out.println("Ingrese su nombre: ");
			String nombre = lectura.next();
			
			System.out.println("Ingrese su apellido: ");
			String apellido = lectura.next();
			
			System.out.println("Ingrese su edad: ");
			int edad = lectura.nextInt();
			
			System.out.println("El Usuario se llama " + nombre + " " + apellido + " y tiene " + edad + " años.");
			
		}

	}

}
