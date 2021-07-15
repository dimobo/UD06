package code;

import javax.swing.JOptionPane;

public class Ejercicio08APP {
	// En este main lo que tenemos es un m�todo que llama a otro m�todo, nada m�s.
	public static void main(String[] args) {

		mostrarArray(llenarArray());

	}

	// Este m�todo se encargar� solo de pedir al usuario n�meros para rellenar el
	// array de 10 posiciones que hemos creado.
	public static int[] llenarArray() {

		int num[] = new int[10];

		for (int i = 0; i < 10; i++) {

			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero para la posicion " + (i + 1)));

		}

		return num;

	}

	// Este m�todo recorrer� el array imprimiendo por pantalla todos los valores del
	// array, he decidido imprimirlo por consola para evitar 10 pop ups.
	public static void mostrarArray(int[] num) {

		for (int i = 0; i < 10; i++) {
			System.out.println("En la posicion " + (i + 1) + " tenemos " + num[i]);

		}

	}
}
