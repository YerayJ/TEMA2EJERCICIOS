package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * En una granja se compra diariamente una cantidad de comida para los animales.
	 * Los animales son todos de la misma especie y sabemos que cada animal come los
	 * mismos kilos de comida de media diariamente.
	 */

	/*
	 * PRUEBAS 
	 * Cantidad de comida = 200 / Cantidad de animales = 40 / Total ingerida
	 * = 150 : Hay alimento suficiente para cada animal Cantidad de comida = 12 /
	 * Cantidad de animales = 0 / Total ingerida = 3 : Ni los animales ni la comida
	 * total puede ser valor 0
	 * 
	 */

	public static void main(String[] args) {
		// Creamos variables. Las tres de tipo int son las que pediremos al usuario. Y
		// la de raciondiaria será para calcular la racion de cada animal.
		int comida, animales, kgcomida;
		double raciondiaria;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables al usuario
		System.out.println("Deme la cantidad de comida comprada: ");
		comida = key.nextInt();
		System.out.println("Deme la cantidad de animales: ");
		animales = key.nextInt();
		System.out.println("Deme la cantidad de comida total digerida por los animales: ");
		kgcomida = key.nextInt();

		// Para saber a cuantos animales corresponde por kg de comida
		if (comida >= kgcomida && animales > 1) { // Si la comida comprada es mayor a la comida ingerida y los animales
													// sean más que uno, imprimimos que hay alimento suficiente.
			System.out.println("Hay alimento suficiente para cada animal");
		} else { // Si la comida o los animales es mayor que cero, no podremos hacer una
					// operación y lo imprimimos.
			if (animales <= 0 || kgcomida <= 0) {
				System.out.println("Ni los animales ni la comida total puede ser valor 0");
			} else { // Al no ser ninguna de las dos calculamos la ración diaria de cada animal
						// pasando una variable con cast a double por si son impares los animales y
						// dividimos los kilos de comida entre animales.
				raciondiaria = (double) kgcomida / animales;
				System.out.printf("La ración diaria para cada animal es %.2f kg", raciondiaria);
			}
		}
		// Cerramos el escaner
		key.close();
	}

}
