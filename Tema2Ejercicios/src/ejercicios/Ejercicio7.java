package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
	 * que muestre la hora después de incrementarle un segundo.
	 * 
	 * PRUEBAS 
	 * Al poner 23 59 59 se traduce a 0 0 0 
	 * Al poner 1 59 59 se traduce a 2 0 0
	 */

	public static void main(String[] args) {
		// Creamos las variables. Pedimos la hora minutos y segundos
		int hora, min, seg;

		// Creamos escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos datos al usuario
		System.out.println("Deme la hora separando horas minutos segundos ");
		hora = key.nextInt();
		min = key.nextInt();
		seg = key.nextInt();

		// Creamos las condiciones no pongo else if porque en este caso quiero que todos
		// los if vayan por separado y las variables entren en todas las condiciones.
		seg += 1; // Le sumamos 1 a segundos, ya que es lo que nos pide el ejercicio.
		if (seg == 60) { // Si los segundos igualan a 60 le sumamos 1 a minuto y dejamos el contador de
							// segundos a 0.
			min += 1;
			seg = 0;
		}
		if (min == 60) {// Si los minutos igualan a 60 le sumamos 1 a hora y dejamos el contador de
			// minutos a 0.
			hora += 1;
			min = 0;
		}
		if (hora == 24) { // Por último al estar en formato 24 h la hora habrá que pasarla a 0 cuando
							// llegue a 24, así que si hora es igual a 24, dejamos la hora en 0.
			hora = 0;
		}// Imprimos todas las variables por pantalla.
		System.out.println(hora + " Horas " + min + " Minutos " + seg + " Segundos");
		
		//Cerramos el escaner
		key.close();
	}

}
