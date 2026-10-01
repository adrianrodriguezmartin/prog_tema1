package unidad01;

import java.util.Scanner;

public class BoletinRelacionales {

	public static void main(String[] args) {
		/*
		 * Ejercicio 19: Diseñar un algoritmo que reciba la edad de un usuario y
		 * un valor booleano o entero que indique si tiene pase VIP. Mostrar el mensaje
		 * "Acceso permitido" si es mayor o igual a 18 años o si cuenta con pase VIP, y "Acceso denegado" en caso contrario.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Introduce tu edad: ");
//		int edad = sc.nextInt();
//		
//		System.out.println("¿Tienes pase VIP? (true/false): ");
//		boolean vip = sc.nextBoolean();
//		boolean permiso = (edad >= 18) || vip;
//		
////		System.out.println("¿Tienes pase VIP? (0 (no) / 1 (si)): ");
////		int vipI = sc.nextInt();
////		boolean permisoI = (edad >= 18) || (vipI == 1);
//		
////		System.out.println("¿Tienes pase VIP? (si/no): ");
////		String vipS = sc.next();
////		boolean permisoS = (edad >= 18) || vipS.equals("si");
//		
//		System.out.println(permiso ? "Acceso permitido. " : "Acceso denegado. ");

		/*
		 * Ejercicio 20: Escribir un programa que pida una edad y determine si la persona
		 * puede acceder al descuento de transporte. El programa mostrará por la consola "Descuento aplicable"
		 * (si tiene menos de 18 años o más de 65 años) o "Tarifa normal" (en caso contrario).
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Introduce tu edad: ");
//		int edad = sc.nextInt();
//		
//		boolean tarifa = (edad < 18) || (edad > 65);
//		System.out.println(tarifa ? "Descuento aplicable. " : "Tarifa normal. ");
		
		/*
		 * Ejercicio 21: Diseñar un algoritmo que reciba tres calificaciones parciales de un estudiante y
		 * muestre "Aprobado" si su promedio es mayor o igual a 5 y ninguna de las tres notas individuales
		 * es menor que 3, o "Suspenso" en caso contrario.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Introduce la segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Introduce la tercera nota: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3.0;
		
		boolean resultado = (media >= 5) && (nota1>=3 && nota2>=3 && nota3>=3);
		System.out.printf("La media es de %.2f. Tu resultado es ", media);
		System.out.println(resultado ? "Aprobado." : "Suspenso.");
		
	}

}
