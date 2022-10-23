package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
	 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
	 * y seis”.
	 * 
	 * PRUEBAS He probado los siguientes número y han aparecido todos con la
	 * sintaxis correcta: 9,15,20,25,33,44,65,99.
	 * En caso de imprimir 100 indica que no está dentro del rango.
	 */

	public static void main(String[] args) {
		// Creamos variables num para pedirsela al usuario
		int num, decena, unidad;
		String primeraPalabra = "";
		String segundaPalabra = "";

		// Creamos escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos datos al usuario
		System.out.println("Deme un número entre el 1 y el 99: ");
		num = key.nextInt();

		// Creamos estas dos operaciones para comprobar la posición de cada número
		decena = num / 10;
		unidad = num % 10;

		// Creamos una condición para comprobar el número que entra por pantalla
		if (num < 1 || num > 99) { // Con esto controlaremos que el número introducido por pantalla está dentro del
									// rango.
			System.out.println("El número no está dentro del rango");
		} else {
			switch (unidad) { // Al meter la unidad aquí estaremos controlando que sea el segundo número el
								// que saque por pantalla del 1 al 9
			case 1:
				segundaPalabra += "uno";
				break;
			case 2:
				segundaPalabra += "dos";
				break;
			case 3:
				segundaPalabra += "tres";
				break;
			case 4:
				segundaPalabra += "cuatro";
				break;
			case 5:
				segundaPalabra += "cinco";
				break;
			case 6:
				segundaPalabra += "seis";
				break;
			case 7:
				segundaPalabra += "siete";
				break;
			case 8:
				segundaPalabra += "ocho";
				break;
			case 9:
				segundaPalabra += "nueve";
				break;
			}
			if (num < 10) { // Aquí comprobamos que el número está dentro del rango e imprimimos sólo la
							// segundaPalabra
				System.out.println(segundaPalabra);

			} else if (num < 16 || num == 20) { // Comprobamos que el número sea menor que 16 ya que del 10 al 15 son
												// palabras
												// reservadas que tenemos que imprimir tal cual, este valor se lo
												// añadimos a la
												// variable primeraPalabra. Tambíen añadiré como palabra reservada el 20
												// aquí para mayor comodidad en el switch de abajo.
				switch (num) { // Aquí introducimos el num en el switch ya que vamos a pasarle el número
								// entero.
				case 10:
					primeraPalabra += "diez";
					break;
				case 11:
					primeraPalabra += "once";
					break;
				case 12:
					primeraPalabra += "doce";
					break;
				case 13:
					primeraPalabra += "trece";
					break;
				case 14:
					primeraPalabra += "catorce";
					break;
				case 15:
					primeraPalabra += "quince";
					break;
				case 20:
					primeraPalabra += "veinte";
				}
				System.out.println(primeraPalabra); // Imprimimos por pantalla la primeraPalabra.

			} else if (num > 20 && num < 30) { // Como en el rango del 20 el la primera palabra empieza por veinti en
												// vez de 20 añadiré este switch en el que esta vez en las unidades no
												// se le sume a la variable la cadena, ya que sino imprimiria dos veces
												// el mismo valor, así que lo sustituimos directamente y al final
												// imprimos veinti + primeraPalabra.
				switch (unidad) {
				case 1:
					segundaPalabra = "uno";
					break;
				case 2:
					segundaPalabra = "dos";
					break;
				case 3:
					segundaPalabra = "tres";
					break;
				case 4:
					segundaPalabra = "cuatro";
					break;
				case 5:
					segundaPalabra = "cinco";
					break;
				case 6:
					segundaPalabra = "seis";
					break;
				case 7:
					segundaPalabra = "siete";
					break;
				case 8:
					segundaPalabra = "ocho";
					break;
				case 9:
					segundaPalabra = "nueve";
					break;
				}
				System.out.println("veinti" + segundaPalabra);

			} else {
				switch (decena) { // Al meter la decena aquí estaremos controlando que lo que varie sea la
									// primeraPalabra, ya que aquí va los números del 10 al 90.
				case 1:
					primeraPalabra += "dieci";
					break;
				case 3:
					primeraPalabra += "treinta";
					break;
				case 4:
					primeraPalabra += "cuarenta";
					break;
				case 5:
					primeraPalabra += "cincuenta";
					break;
				case 6:
					primeraPalabra += "sesenta";
					break;
				case 7:
					primeraPalabra += "setenta";
					break;
				case 8:
					primeraPalabra += "ochenta";
					break;
				case 9:
					primeraPalabra += "noventa";
					break;
				default:
					System.out.println("No has introducido bien el número");
					break;
				}
				if (unidad == 0) { // Si el número es 20, 30, 40...
					System.out.println(primeraPalabra); // Imprimimos sólo la primera palabra
				} else {
					System.out.println(primeraPalabra + " y " + segundaPalabra); // En el caso que sea otro número
																					// imprimimos un compuesto, la
																					// primeraPalabra y la
																					// segundaPalabra.
				}

			}

		}
		// Cerramos el escaner
		key.close();
	}

}
