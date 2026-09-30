package unidad01;

import java.util.Scanner;

public class OperacionesLogicas {

	public static void main(String[] args) {
//	
//		//Ejercicio 1
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Introduce tu edad: ");
//		int edad = scanner.nextInt();
//		boolean resultado = edad >= 18;
//		System.out.println(resultado);

		// Ejercicio 2

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Introduce un número entero: ");
//		int numero = scanner.nextInt();
//		
//		boolean esPar = (numero % 2) == 0;
//		System.out.println("Resultado de si es par: " + esPar);

		// Ejercicio 3

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Introduce tu edad: ");
//		int edad = scanner.nextInt();
//		boolean edadLaboral = (edad >= 16) && (edad < 67);
//		System.out.println("Resultado de si estás en edad laboral: " + edadLaboral);

		// Ejercicio 4

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Has terminado las tareas?");
		boolean tareas = scanner.nextBoolean();
		System.out.println("¿Está lloviendo?");
		boolean lluvia = scanner.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");

		boolean biblioteca = scanner.nextBoolean();
		boolean resultado = biblioteca || (tareas && !lluvia);
		System.out.println(resultado ? "Puedes salir a la calle. " : "No puedes salir a la calle. ");

		// Ejercicio 4 alternativo

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("¿Tienes que ir a la biblioteca?");
//		boolean biblioteca = scanner.nextBoolean();
//		if (biblioteca==true) {
//			System.out.println("Puedes salir a la calle. ");
//		} else {
//			System.out.println("¿Has terminado las tareas?");
//			boolean tareas = scanner.nextBoolean();
//			System.out.println("¿Está lloviendo?");
//			boolean lluvia = scanner.nextBoolean();
//			if (tareas && !lluvia) {
//				System.out.println("Puedes salir. ");
//			} else {
//				System.out.println("No puedes salir. ");
//
//				}
//			}

	}

}
