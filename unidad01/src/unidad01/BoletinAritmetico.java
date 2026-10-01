package unidad01;

import java.util.Scanner;

public class BoletinAritmetico {

	public static void main(String[] args) {
		
		/* Ejercicio 1 Calcular el perí­metro y área de un rectángulo dada su base y su altura.
		Tenemos que leer la base y la altura del rectángulo y calcular el perí­metro y el área.
		*/
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Introduce la base del rectángulo: ");
//		double base = sc.nextDouble();
//		System.out.println("Introduce la altura del rectángulo: ");
//		double altura = sc.nextDouble();
//		double area = base * altura;
//		double perimetro = (base + altura) * 2;
//		System.out.printf("El área del rectángulo es %.2f y el perímetro es %.2f\n", area, perimetro);
		
		/*
		 * Ejercicio 2: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		 * Nota: la hipotenusa es igual a la raíz cuadrada de la suma de los cuadrados de los catetos.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce la medida de un cateto: ");
//		double cateto1 = sc.nextDouble();
//		System.out.println("Introduce la medida del otro cateto: ");
//		double cateto2 = sc.nextDouble();
//		double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
//		System.out.printf("La hipotenusa mide %.3f. ", hipotenusa);
		
		/*
		 * Ejercicio 8: Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia,
		 * de modo que el resultado sea siempre positivo). Pista: Math.abs() para calcular el valor absoluto.
		 */
		
	 	Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		int distancia = Math.abs(numero1 - numero2);
		System.out.println("La distancia entre los números es " + distancia);
	}

}
