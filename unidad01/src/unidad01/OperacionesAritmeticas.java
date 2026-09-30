package unidad01;

import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce el primer número entero: ");
//		int primerNumero = scanner.nextInt();
//		System.out.println("Introduce el segundo número entero: ");
//		int segundoNumero = scanner.nextInt();
//		
//		int suma = primerNumero + segundoNumero;
//		int resta = primerNumero - segundoNumero;
//		int multiplicacion = primerNumero * segundoNumero;
//		int cociente = primerNumero / segundoNumero;
//		int resto = primerNumero % segundoNumero;
//		double cocienteDecimales = ( primerNumero * 1.0 ) / segundoNumero;
//		
//		System.out.printf("La suma de los número es %d \nLa resta es %d \nLa multiplicación es %d \nLa división entera es %d, con resto %d. \nLa división con decimales da %f.\n", suma, resta, multiplicacion, cociente, resto, cocienteDecimales);
		

		//Ejercicio 2
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce tu edad: ");
//		int edad = scanner.nextInt();
//		System.out.println("Tu edad dentro de un año será de " + ++edad + " años.");
		
		//Ejercicio 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la primera nota: ");
		int primeraNota = scanner.nextInt();
		System.out.println("Introduce la segunda nota: ");
		int segundaNota = scanner.nextInt();
		double media = (primeraNota + segundaNota)*1.0 / 2;
		System.out.printf("La media de las dos notas es %.3f\n", media);
		
		//Ctrl + shift + o ==> importar todo automaticamente
		
	}

}
