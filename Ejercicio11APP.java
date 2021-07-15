package code;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio11APP {

	public static void main(String[] args) {

		int tam = pedirNumero("Introduzca el tama�o de las arrays.");
		int ar1[] = new int[tam], ar2[] = new int[tam], ar3[] = new int[tam];

		// En estas l�neas estamos llamando a los m�todos encargados de generar cada una
		// de las l�neas.
		ar1 = generarArray(tam);
		ar2 = mezclaArray(ar1);
		ar3 = multArray(ar1, ar2);

		// Estas l�neas nos muestran por pantalla el contenido de las arrays.
		System.out.println("Primer array: ");
		mostrarArray(ar1);
		System.out.println("\n\nSegundo array: ");
		mostrarArray(ar2);
		System.out.println("\n\nTercer array: ");
		mostrarArray(ar3);

	}

	// Este m�todo es reciclado de otro ejercicio, lo que hace es que se asegura que
	// se introduzca un n�mero v�lido, es decir un entero positivo
	public static int pedirNumero(String text) {

		int num = 0;

		while (true) {
			String dato = JOptionPane.showInputDialog(text);
			if (!dato.equals(null)) {
				try {
					num = Integer.parseInt(dato);
					if (num > 0) {
						return num;
					} else {
						JOptionPane.showMessageDialog(null, "Valor introducido no v�lido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no v�lido.");
				}
			} else {
				return num;
			}
		}

	}

	// Este m�todo es el encargado de general el array aleatorio, como podemos ver
	// es bastante
	// simple.
	public static int[] generarArray(int num1) {

		int num2[] = new int[num1];
		int rang = pedirNumero("Introduzca el n�mero m�ximo del rango deseado\n para los n�meros aleatorios.") + 1;
		Random r = new Random();

		for (int i = 0; i < num1; i++) {
			num2[i] = r.nextInt(rang);
		}

		return num2;
	}

	// Este m�todo es el encargado de mostrar el array.
	public static void mostrarArray(int[] num) {

		for (int i = 0; i < num.length; i++) {
			System.out.println("En la posicion " + (i + 1) + " tenemos: " + num[i]);
		}

	}

	// Este m�todo mezcla el array 1 en el array 2 de forma aleatoria.
	public static int[] mezclaArray(int[] num1) {

		int num2[] = new int[num1.length];
		Random r = new Random();
		int j = 0;

		for (int i = 0; i < num1.length; i++) {
			j = r.nextInt(num1.length);
			if (num2[j] == 0) {
				num2[j] = num1[i];
			} else {
				// Este i-- nos sirve para mantener nuestra posici�n en el bucle for por si
				// hemos entrado en una casilla que ya ten�a un valor, no es la forma m�s
				// optimizada de hacerlo pero si de las m�s r�pidas.
				i--;
			}
		}

		return num2;
	}

	// Este m�todo recorre las 3 arrays multiplicando las 2 primeras y dejando el
	// resultado en la tercera.
	public static int[] multArray(int[] num1, int[] num2) {

		int num3[] = new int[num1.length];

		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i] * num2[i];

		}

		return num3;

	}

}
