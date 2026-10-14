package boletines;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida una fecha (día, mes y año) y diga si es
		 * correcta.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un día: ");
		int dia = sc.nextInt();
		System.out.println("Dime un mes (en número): ");
		int mes = sc.nextInt();
		System.out.println("Dime un año: ");
		int anyo = sc.nextInt();

		boolean esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);

		if (dia > 0 && dia <= 31) {

			switch (mes) {
			case 2:
				if (dia <= 28 || dia <= 29 && esBisiesto) {
					System.out.println("Fecha válida.");
				} else {
					System.out.println("Fecha NO válida.");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia <= 30) {
					System.out.println("Fecha válida.");
				} else {
					System.out.println("Fecha NO válida.");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia <= 31) {
					System.out.println("Fecha válida.");
				} else {
					System.out.println("Fecha NO válida.");
				}
				break;
			default:
				System.out.println("Fecha NO válida.");
				break;
			}
		} else {
			System.out.println("Fecha NO válida.");
		}
	}
}
