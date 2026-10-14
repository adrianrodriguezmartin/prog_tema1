package unidad01;

import java.util.Scanner;

public class EjerciciosFinal {

	public static void main(String[] args) {

		/*
		 * 2.11 Escribe una aplicacion que solicite al usuario un numero comprendido
		 * entre 0 y 9999. La aplicacion tendra que indicar si el numero introducido es
		 * capicua.
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce un número entre 0 y 9999: ");
//		int numero = sc.nextInt();
//
//		if (numero < 0) {
//			System.out.println("El número no es válido.");
//		} else if (numero <= 9) {
//			System.out.println("El número es capicúa. ");
//		} else if (numero <= 99) {
//			int decenas = numero / 10;
//			int unidades = numero % 10;
//			boolean esCapicua = decenas == unidades;
//			System.out.println(esCapicua ? "El número es capicúa." : "El número no es capicúa.");
//		} else if (numero <= 999) {
//			int centenas = numero / 100;
//			int unidades = numero % 10;
//			boolean esCapicua = centenas == unidades;
//			System.out.println(esCapicua ? "El número es capicúa." : "El número no es capicúa.");
//		} else if (numero <= 9999) {
//			int millares = numero / 1000;
//			int centenas = (numero % 1000) / 100;
//			int decenas = (numero % 100) / 10;
//			int unidades = numero % 10;
//			boolean esCapicua = (millares == unidades) && (centenas == decenas);
//			System.out.println(esCapicua ? "El número es capicúa." : "El número no es capicúa.");
//		} else {
//			System.out.println("El número no es válido. ");
//		}

		/*
		 * 2.12
		 */

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Introduce un número de 8 dígitos: ");
//		int numero = sc.nextInt();
//		String letra = "";
//		if (numero < 10000000 || numero > 99999999) {
//			System.out.println("El número no tiene 8 dígitos. ");
//		} else {
//			int modulo = numero % 23;
//
//			switch (modulo) {
//			case 0 -> letra = "T";
//			case 1 -> letra = "R";
//			case 2 -> letra = "W";
//			case 3 -> letra = "A";
//			case 4 -> letra = "G";
//			case 5 -> letra = "M";
//			case 6 -> letra = "Y";
//			case 7 -> letra = "F";
//			case 8 -> letra = "P";
//			case 9 -> letra = "D";
//			case 10 -> letra = "X";
//			case 11 -> letra = "B";
//			case 12 -> letra = "N";
//			case 13 -> letra = "J";
//			case 14 -> letra = "Z";
//			case 15 -> letra = "S";
//			case 16 -> letra = "Q";
//			case 17 -> letra = "V";
//			case 18 -> letra = "H";
//			case 19 -> letra = "L";
//			case 20 -> letra = "c";
//			case 21 -> letra = "K";
//			case 22 -> letra = "E";
//			default -> System.out.println("El número no es válido. ");
//			}
//
//			System.out.println("La letra que corresponde es " + letra);
//			
//		}

		/*
		 * 2.13
		 */

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Introduce la cantidad de comida en kg: ");
//		double comidaDiaria = sc.nextDouble();
//		System.out.println("Introduce el número de animales: ");
//		int numAnimales = sc.nextInt();
//		if (numAnimales<0) {
//			System.out.println();
//		}
//		System.out.println("Introduce la media de kg que come cada animal: ");
//		double kilosPorAnimal = sc.nextDouble();
//
//		double comidaNecesaria = numAnimales * kilosPorAnimal;
//		if (comidaDiaria >= comidaNecesaria) {
//			System.out.println("Tienes comida suficiente para todos los animales. ");
//		} else {
//			double racion = (comidaDiaria * 1.0) / numAnimales;
//			System.out.printf("No tienes suficiente. La ración que corresponde a cada animal es de %.3f kg.", racion);
//		}

		/*
		 * 2.14
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce un número entre 1 y 99: ");
//		int numero = sc.nextInt();
//
//		String numeroLetra = "";
//		String unidadesLetra = "";
//		String decenasLetra = "";
//		int unidades = numero % 10;
//		int decenas = numero / 10;
//		switch (numero) {
//		case 1 -> unidadesLetra = "uno";
//		case 2 -> unidadesLetra = "dos";
//		case 3 -> unidadesLetra = "tres";
//		case 4 -> unidadesLetra = "cuatro";
//		case 5 -> unidadesLetra = "cinco";
//		case 6 -> unidadesLetra = "seis";
//		case 7 -> unidadesLetra = "siete";
//		case 8 -> unidadesLetra = "ocho";
//		case 9 -> unidadesLetra = "nueve";
//		}

	}

}
