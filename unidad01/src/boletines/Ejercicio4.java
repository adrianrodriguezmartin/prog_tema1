package boletines;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * La asociación de vinicultores tiene como política fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
		 * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se
		 * requiere determinar cuánto recibirá un productor por la uva que entrega en un
		 * embarque, considerando lo siguiente: Si es de tipo A, se le cargan 20
		 * céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de
		 * tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50
		 * céntimos cuando es de tamaño 2.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de kilos: ");
		double kilos = sc.nextDouble();
		System.out.println("Introduce el precio inicial: ");
		double precio = sc.nextDouble();
		System.out.println("Introduce el tipo de uva (A o B): ");
		String tipo = sc.next();
		System.out.println("Introduce el tamaño de la uva (1 ó 2): ");
		int tamanio = sc.nextInt();

		if (tipo.equals("A")) {
			if (tamanio == 1) {
				precio = precio + 0.2;
			} else if (tamanio == 2) {
				precio = precio + 0.3;
			} else {
				System.out.println("Tamaño no válido.");
			}
		} else if (tipo.equals("B")) {
			if (tamanio == 1) {
				precio = precio - 0.3;
			} else if (tamanio == 2) {
				precio = precio - 0.5;
			} else {
				System.out.println("Tamaño no válido.");
			}
		} else {
			System.out.println("Tipo no válido.");
		}
		double total = precio * kilos;
		System.out.printf("El total obtenido es de %.2f€. \n", total);
	}
}
