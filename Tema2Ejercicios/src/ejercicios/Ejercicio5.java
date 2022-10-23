package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Utiliza un operador ternario para calcular el valor absoluto de un número que
	 * se solicita al usuario por teclado
	 * PRUEBAS
	 * -120 y lo convierte en positivo
	 * 0 que lo deja igual
	 */

	public static void main(String[] args) {
		// Creamos variables. En este caso un número que le pediremos al usuario.
		int num;

		// Creamos escaner para leer datos.
		Scanner key = new Scanner(System.in);

		// Pedimos datos al usuario
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el operador ternario. En el que solo tenemos que comprobar que el
		// número es mayor que 0 para que nos devuelva el valor siempre como positivo.
		System.out.println(num > 0 ? num : -num);

		// Cerramos el escaner
		key.close();
	}

}
