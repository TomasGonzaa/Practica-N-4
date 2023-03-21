package practica4;

import java.util.Scanner;

public class Punto3 {
	Scanner lectura = new Scanner(System.in); 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); {
			
			String producto ="";
			double precio, total;
			double totalpagar =0;
			int cantidad;
			String nombre ="";
			String apellido="";
			
			System.out.println("Ingrese su Nombre");
			nombre= input.next();
			
			System.out.println("Ingrese su Apellido");
			apellido= input.next();
			
			System.out.println("Ingrese Producto a comprar");
			producto= input.next();
			
			System.out.println("Ingrese el precio del producto");
			precio= input.nextDouble();
			
			System.out.println("Ingrese la cantidad");
			cantidad= input.nextInt();
			total= precio * cantidad;
			
			System.out.println("Usuario: " + nombre + " " + apellido + ".");
			
			System.out.println("Productos: " + producto + " x " + cantidad + " unidades");
			
			System.out.println("Precio Total: $" + total);
			
			if(total>1000) {
				System.out.println("Por superar los $1000 obtuvo %20 de descuento: -$" + total*0.2);
				System.out.println("Total a pagar: $" + total*0.8);}
				
			else{
				System.out.println("(No se efectuaron Descuentos)");	
				System.out.println("Total a pagar: $" + total);}
					
				}
						
			}
}
	
	
