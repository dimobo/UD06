package code;

import javax.swing.JOptionPane;

public class Ejercicio08APP {
	// En este main lo que tenemos es un método que llama a otro método, nada más.
	public static void main(String[] args) {

		mostrarArray(llenarArray());

	}

	// Este método se encargará solo de pedir al usuario números para rellenar el
	// array de 10 posiciones que hemos creado.
	public static int[] llenarArray() {

		int num[] = new int[10];

		for (int i = 0; i < 10; i++) {

			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para la posicion " + (i + 1)));

		}

		return num;

	}

	// Este método recorrerá el array imprimiendo por pantalla todos los valores del
	// array, he decidido imprimirlo por consola para evitar 10 pop ups.
	public static void mostrarArray(int[] num) {

		for (int i = 0; i < 10; i++) {
			System.out.println("En la posicion " + (i + 1) + " tenemos " + num[i]);

		}

	}
}
