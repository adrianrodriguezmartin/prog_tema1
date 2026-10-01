package unidad01;

import java.util.Scanner;

public class BoletinModulo {

	public static void main(String[] args) {
		/*
		 *  Ejercicio 14: Realiza un programa que reciba una cantidad de minutos y muestre por pantalla
		 *  a cuantas horas y minutos corresponde.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Introduce el número de minutos: ");
//		int minutos = sc.nextInt();
//		
//		int horas = minutos / 60;
//		int minutosResto = minutos % 60;
//		System.out.printf("Corresponde a %d horas y %d minutos.\n", horas, minutosResto);
		
		/*
		 * Ejercicio 15: Realiza un programa que reciba una cantidad de segundos y
		 * muestre por pantalla a cuantas horas, minutos y segundos corresponde.
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Introduce el número de segundos: ");
//		int segundos = sc.nextInt();
//		
//		int minutos = segundos % 60;
//		int horas = segundos / 3600;
//		int segundosResto = segundos % 60;
//		System.out.printf("Corresponde a %d horas, %d minutos y %d segundos.\n", horas, minutos, segundosResto);
		
		/*
		 * Ejercicio 18: Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
		 * después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de monedas de 2€: ");
		int monedas2e = sc.nextInt();
		System.out.println("Introduce el número de monedas de 1€: ");
		int monedas1e = sc.nextInt();
		System.out.println("Introduce el número de monedas de 50 céntimos: ");
		int monedas50cts = sc.nextInt();
		System.out.println("Introduce el número de monedas de 20 céntimos: ");
		int monedas20cts = sc.nextInt();
		System.out.println("Introduce el número de monedas de 10 céntimos: ");
		int monedas10cts = sc.nextInt();
		
		int total = monedas2e * 200 + monedas1e * 100 + monedas50cts * 50 + monedas20cts * 20 + monedas10cts * 10;
		int euros = total / 100;
		int centimos = total % 100;
		System.out.printf("La cantidad total es de %d euros y %d céntimos.\n", euros, centimos);
		
	}

}
