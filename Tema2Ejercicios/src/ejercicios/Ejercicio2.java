package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
	 * partir del número de la siguiente forma:
	 */

	/*
	 * PRUEBAS 
	 * He puesto mi DNI 29566140(P) y me lo ha devuelto correcto.
	 * He puesto 238 y da error, ya que no está dentro del rango.
	 */

	public static void main(String[] args) {

		// Creamos variables. En el DNI guardamos lo que nos pase el usuario, y en la
		// letra la operación para descubrir la letra del DNI.
		int dni, letra;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos datos al usuario
		System.out.println("Deme su DNI sin la letra: ");
		dni = key.nextInt();

		// En este caso crearemos un switch para las diferentes opciones
		if (dni < 10000000 ||  dni > 99999999) { // Como el número es de 8 cifras así compararemos si el número está dentro del
											// rango.
			System.out.println("El número no está dentro del rango");
		} else {
			// Creamos la operación para saber la letra del DNI, donde al tener el módulo
			// entre 23 del número podremos saber a que letra pertenece
			letra = dni % 23;

			switch (letra) {// En el switch mostramos todas las opciones posibles y le pasamos directamente
							// el número para que lo convierta en letra. Lo que haré directamente es
							// imprimir el resultado, es decir, el dni completo.
			case 0:
				System.out.println(dni + "T");
				break;
			case 1:
				System.out.println(dni + "R");
				break;
			case 2:
				System.out.println(dni + "W");
				break;
			case 3:
				System.out.println(dni + "A");
				break;
			case 4:
				System.out.println(dni + "G");
				break;
			case 5:
				System.out.println(dni + "M");
				break;
			case 6:
				System.out.println(dni + "Y");
				break;
			case 7:
				System.out.println(dni + "F");
				break;
			case 8:
				System.out.println(dni + "P");
				break;
			case 9:
				System.out.println(dni + "D");
				break;
			case 10:
				System.out.println(dni + "X");
				break;
			case 11:
				System.out.println(dni + "B");
				break;
			case 12:
				System.out.println(dni + "N");
				break;
			case 13:
				System.out.println(dni + "J");
				break;
			case 14:
				System.out.println(dni + "Z");
				break;
			case 15:
				System.out.println(dni + "S");
				break;
			case 16:
				System.out.println(dni + "Q");
				break;
			case 17:
				System.out.println(dni + "V");
				break;
			case 18:
				System.out.println(dni + "H");
				break;
			case 19:
				System.out.println(dni + "L");
				break;
			case 20:
				System.out.println(dni + "C");
				break;
			case 21:
				System.out.println(dni + "K");
				break;
			case 22:
				System.out.println(dni + "E");
				break;
			}
		}

		// Cerramos el escaner
		key.close();

	}

}
