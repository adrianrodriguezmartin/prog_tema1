package unidad01;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entero: ");
//		int numero1 = sc.nextInt();
//		System.out.println("Dime otro número entero: ");
//		int numero2 = sc.nextInt();
//		boolean resultado = numero1 != numero2 || numero1 == 0 || numero2 == 0;
//		
//		System.out.printf("El resultado es %b\n",resultado);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entero: ");
//		int numero1 = sc.nextInt();
//		System.out.println("Dime otro número entero: ");
//		int numero2 = sc.nextInt();
//		
//		boolean resultado = (numero1%numero2) == 0;
//		
//		System.out.printf("%d es múltiplo de %d: %b\n", numero1, numero2, resultado);

		/* Diapositiva 96
		 * Diseñar una aplicación que solicite al usuario un número e indique si es par o impar. 
		 * Haciendo uso del if podemos mostrar como resultado final: “Es par” o “Es impar”

		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Dime un número entero: ");
//		int numero = sc.nextInt();
//		String esPar = "Es impar. ";
//		if (numero%2==0) {
//			esPar = "Es par. ";
//		}
//		System.out.println(esPar);
		
		/*
		 * Diapositiva 99
		 * Pedir dos números enteros y decir si son iguales o no.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entero: ");
//		int numero1 = sc.nextInt();
//		System.out.println("Dime otro número entero: ");
//		int numero2 = sc.nextInt();
//		if (numero1==numero2) {
//			System.out.println("Los números son iguales. ");
//		} else {
//			System.out.println("Los números son distintos. ");
//		}
		
		/*
		 * Solicitar dos números enteros y mostrar cuál es el mayor.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entero: ");
//		int numero1 = sc.nextInt();
//		System.out.println("Dime otro número entero: ");
//		int numero2 = sc.nextInt();
//		if (numero1>numero2) {
//			System.out.printf("El mayor es %d.\n", numero1);
//		} else {
//			System.out.printf("El mayor es %d.\n", numero2);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entero: ");
//		int numero1 = sc.nextInt();
//		System.out.println("Dime otro número entero: ");
//		int numero2 = sc.nextInt();
//		int numeroMayor;
//		
//		if (numero1>numero2) {
//			numeroMayor = numero1;
//		} else {
//			numeroMayor = numero2;
//		}
//		System.out.println("El numero mayor es "+numeroMayor);
		
		/* Diapositiva 103
		 * Escribir una aplicación que indique cuántas cifras tiene un 
		 * número entero introducido por teclado que estará comprendido entre 0 y 99999.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un número entre 0 y 99999: ");
//		int numero = sc.nextInt();
//		
//		if(numero<0) {
//			System.out.println("El número no puede ser menor que 0.");
//		} else if (numero<=9) {
//			System.out.println("El número tiene 1 cifra. ");
//		} else if (numero <=99) {
//			System.out.println("El número tiene 2 cifras. ");
//		} else if (numero <=999) {
//			System.out.println("El número tiene 3 cifras. ");
//		} else if (numero <=9999) {
//			System.out.println("El número tiene 4 cifras. ");
//		} else if (numero <=99999) {
//			System.out.println("El número tiene 5 cifras. ");
//		} else {
//			System.out.println("El número no está entre 0 y 99999. ");
//		}
		
		
		/* Diapositiva 104
		 * Pedir tres números y mostrarlos ordenados de mayor a menor
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime el primer número: ");
//		int numeroA = sc.nextInt();
//		System.out.println("Dime el segundo número: ");
//		int numeroB = sc.nextInt();
//		System.out.println("Dime el tercer número: ");
//		int numeroC = sc.nextInt();
//		
//		//A > B > C
//		//A > C > B
//		//B > A > C
//		//B > C > A
//		//C > A > B
//		//C > B > A
//		
//		if (numeroA > numeroB && numeroB > numeroC) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroA, numeroB, numeroC);
//		} else if (numeroA > numeroC && numeroC > numeroB) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroA, numeroC, numeroB);
//		} else if (numeroB > numeroA && numeroA > numeroC) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroB, numeroA, numeroC);
//		} else if (numeroB > numeroC && numeroC > numeroA) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroB, numeroC, numeroA);
//		} else if (numeroC > numeroA && numeroA > numeroB) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroC, numeroA, numeroB);
//		} else if (numeroC > numeroB && numeroB > numeroA) {
//			System.out.printf("El orden es %d > %d > %d. \n", numeroC, numeroB, numeroA);
//		} else {
//			System.out.println("Alguno de los números es igual a otro. ");
//		}
		
		/*
		 * Diapositiva 113
		 * Ingresar 2 números y luego un carácter indicando la operación a realizar (+,-,*,/) y reportar el resultado de la operación.

                         System.out.print(“Ingresar operador(-,+,*,/): “);
                         String operador = sc.next();
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Dime el segundo número: ");
		double numero2 = sc.nextDouble();
		System.out.print("Ingresar operador(-,+,*,/): ");
		
	
        String operador = sc.next();
		switch (operador) {
		case "-":
			System.out.printf("El resultado es %f", (numero1 - numero2));
			break;
		case "+":
			System.out.printf("El resultado es %f", (numero1 + numero2));
			break;
		case "*":
			System.out.printf("El resultado es %.3f", (numero1*numero2));
			break;
		case "/":
			System.out.printf("El resultado es %.3f", ((numero1*1.0)/numero2));
			break;
		default :
			System.out.println("El operador introducido no es válido.");
//			break; (opcional)
		}
		
		
		
	}

}
