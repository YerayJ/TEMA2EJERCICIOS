package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
	 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
	 */
	
	/*
	 * PRUEBAS
	 * Con los de una cifra: 1 (Aquí siempre es capicúa)
	 * Con los de dos cifras: 11 (Capicúa) / 12 (No capicúa)
	 * Con los de tres cifras: 111 (Capicúa) / 133 (No capicúa)
	 * Con los de cuatro cifras: 1221 (Capicúa) / 1242 (No capicúa)
	 */

	public static void main(String[] args) {

		// Creamos variables. El número que pediremos al usuario, millares, centenas,
		// decenas y unidades para diferenciar la posición de las cifras.
		int num, millar, centena, decena, unidad;

		// Creamos un escaner para leer datos del usuario.
		Scanner key = new Scanner(System.in);

		// Pedimos las variables al usuario. En este caso solo num.
		System.out.println("Deme un número entre el 0 y 9999");
		num = key.nextInt();

		// Ahora empezamos la parte condicional.
		if (num < 0 || num > 9999) { // Aquí comprobaremos si el número pasado está dentro del rango.
			System.out.println("El número no está dentro del rango");
		} else {
			// A continuación creamos unas operaciones para saber la posición de cada una de
			// las cifras de la variable num.
			unidad = num % 10; // Lo calculamos sacando el resto de num y en la demás dividimos entre 10, 100 o
								// 1000 para cambiar a una posición a la izquierda.
			decena = (num / 10) % 10;
			centena = (num / 100) % 10;
			millar = (num / 1000) % 10;

			if (num <= 9) { // Si el número es menor-igual que nueve sabremos si el número es de una cifra.
				System.out.println("El número es capicúa");
			} else if (num <= 99) { // Aquí comprobamos que el número es de dos cifras.
				if (unidad == decena) { // Con esta condición sabremos si es capicúa ya que los dos
										// números son iguales tanto el primero como el último.
					System.out.println("El número es capicúa");
				} else {
					System.out.println("El número no es capicúa");
				}
			} else if (num <= 999) { // Aquí comprobamos que el número es de tres cifras.
				if (unidad == centena) { // Con esta condición sabremos si es capicúa ya que los dos
											// números son iguales tanto el primero como el último.
					System.out.println("El número es capicúa");
				} else {
					System.out.println("El número no es capicúa");
				}
			} else if (num <= 9999) { // Aquí comprobamos que el número es de cuatro cifras.
				if (unidad == millar) { // Con esta condición sabremos si es capicúa ya que los dos
										// números son iguales tanto el primero como el último.
					System.out.println("El número es capicúa");
				} else {
					System.out.println("El número no es capicúa");
				}
			}

		}
		// Cerramos el escaner
		key.close();
	}

}
