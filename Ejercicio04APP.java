package code;

import javax.swing.JOptionPane;

public class Ejercicio04APP {
	public static void main(String[] args) {

		// Le pedimos un número al usuario para procesarlo.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número."));

		// Estamos ejecutando el método factorial.
		factorial(num);
	}

	// Este método nos calculará el factorial de un número gracias al bucle que
	// tiene en el interior, la variable fi nos la podríamos ahorrar, pero he
	// decidido crearla para poder recuperar "num" luego.
	private static void factorial(int num) {

		int fi = num;

		for (int i = num - 1; i > 0; i--) {
			fi = fi * i;
		}

		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + fi);

	}

}
