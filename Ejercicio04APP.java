package code;

import javax.swing.JOptionPane;

public class Ejercicio04APP {
	public static void main(String[] args) {

		// Le pedimos un n�mero al usuario para procesarlo.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero."));

		// Estamos ejecutando el m�todo factorial.
		factorial(num);
	}

	// Este m�todo nos calcular� el factorial de un n�mero gracias al bucle que
	// tiene en el interior, la variable fi nos la podr�amos ahorrar, pero he
	// decidido crearla para poder recuperar "num" luego.
	private static void factorial(int num) {

		int fi = num;

		for (int i = num - 1; i > 0; i--) {
			fi = fi * i;
		}

		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + fi);

	}

}
