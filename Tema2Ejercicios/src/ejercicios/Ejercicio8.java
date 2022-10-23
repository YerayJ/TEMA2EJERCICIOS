package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Determinar el precio de un billete de tren, conociendo la distancia a
	 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
	 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
	 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
	 * de estancia los debes solicitar al usuario por teclado. 
	 * PRUEBAS 
	 * Estancia = 8 Distancia = 899 El precio es 1573.25 
	 * Estancia = 1 Distancia = 10 El precio es 25 
	 * Estancia = 0 Distancia = 0 No puede haber valor 0
	 */

	public static void main(String[] args) {
		// Creamos variables. Creamos la distancia, el número de días de estancia y una
		// constante para guardar el precio por kilómetro.
		final double PRECIOKM = 2.5;
		int dias, distancia;
		double billete, descuento;

		// Creamos escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables al usuario
		System.out.println("Deme los días de estancia: ");
		dias = key.nextInt();
		System.out.println("Deme la distancia: ");
		distancia = key.nextInt();

		// Creamos las condiciones
		if (dias == 0 || distancia == 0) { // Con esto comprobaremos que no se pasen valores 0.
			System.out.println("No puede haber valor 0");
		} else {
			if (dias > 7 && distancia > 800) { // Esta son las condiciones del ejercicio, si se cumplen multiplicamos
												// distancia por el PRECIOKM y lo multiplicamos por 0.3 para sacar el
												// descuento.
				descuento = (distancia * PRECIOKM) * 0.3;
				billete = (distancia * PRECIOKM) - descuento; // Le restamos al billete el descuento y nos da el valor
																// total del billete.
				System.out.println("El precio del billete es " + billete);
			} else {
				billete = distancia * PRECIOKM; // En este apartado no hay descuento, así que solo se calcula el precio
												// del billete.
				System.out.println("El precio del billete es " + billete); // Imprimimos resultado.
			}
		}
		// Cerramos el escaner
		key.close();
	}

}
