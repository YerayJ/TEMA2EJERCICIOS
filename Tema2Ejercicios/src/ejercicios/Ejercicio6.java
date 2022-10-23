package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
	 * aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La
	 * aplicación debe indicar si el resultado de la operación es correcto o
	 * incorrecto. Para calcular números aleatorios debes usar la función
	 * Math.random(), que devuelve un número aleatorio comprendido entre 0 y 1.
	 * 
	 * PRUEBAS 
	 * Me ha dado el número 95 y 4 y he introducido 99 y dice que es correcto.
	 * Me ha dado el 72 y 60 y he introducido 21 y dice que la suma es incorrecta.
	 */

	public static void main(String[] args) {
		// Creamos variables con numero aleatorios. El 99 + 1 es para crear un rango.
		int num1 = (int) (Math.random() * 99 + 1);
		int num2 = (int) (Math.random() * 99 + 1);
		int sumausuario;
		
		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos los datos al usuario
		System.out.println("Deme la suma de los siguientes dos números: " + num1 + " y " + num2);
		sumausuario = key.nextInt();

		// Creamos la condición
		if (sumausuario == (num1 + num2)) { // Comparamos que es igual la variable pasada por el usuario, y sumamos las
											// dos variables para crear la suma correcta entre variables. A continuación
											// imprimimos los resultados.
			System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es correcto.");
		} else {
			System.out.println("La suma es incorrecta");

		}
		
		// Cerramos el escaner
		key.close();
	}
}
