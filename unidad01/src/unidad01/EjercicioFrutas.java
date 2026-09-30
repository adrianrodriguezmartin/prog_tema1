package unidad01;

import java.util.Scanner;

public class EjercicioFrutas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precioManzana = 2.35;
		double precioPera = 1.95;
		
		System.out.println("Introduce los kg de manzanas del primer semestre: ");
		double manzanasPrimerSemestre = sc.nextDouble();
		
		System.out.println("Introduce los kg de manzanas del segundo semestre: ");
		double manzanasSegundoSemestre = sc.nextDouble();
		
		System.out.println("Introduce los kg de peras del primer semestre: ");
		double perasPrimerSemestre = sc.nextDouble();
		
		System.out.println("Introduce los kg de peras del segundo semestre: ");
		double perasSegundoSemestre = sc.nextDouble();
		
		double total = (manzanasPrimerSemestre + manzanasSegundoSemestre)*precioManzana + (perasPrimerSemestre + perasSegundoSemestre)*precioPera;
		System.out.printf("El total de beneficio obtenido es de %.2f€. ", total);
		
	}

}
