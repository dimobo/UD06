package code;

import javax.swing.JOptionPane;

public class Ejercicio05APP {
	public static void main(String[] args) {

		// Estamos pidiendo un n�mero para procesar al usuario.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero."));

		// En esta l�nea estamos ejecutando el m�todo calcBinario que imprimiremos luego
		// en un jpanel.
		JOptionPane.showMessageDialog(null, "El binario de " + num + " es: " + calcBinario(num));

	}

	// Este m�todo es el encargado de traducir un n�mero de base decimal a vinario.
	public static String calcBinario(int num1) {

		String binario1 = "", binario2 = "";

		// Este bucle nos generar� el n�mero binario a partir del introducido por el
		// usuario.
		while (num1 != 0) {
			binario1 = binario1 + (num1 % 2);
			num1 = num1 / 2;

		}

		// El problema es que obtendremos el n�mero binario invertido por lo que
		// tendremos que "girar el n�mero binario" que es exactamente lo que hace este
		// bucle for.
		for (int i = binario1.length() - 1; i >= 0; i--) {
			binario2 = binario2 + binario1.charAt(i);

		}

		return binario2;

	}
}
