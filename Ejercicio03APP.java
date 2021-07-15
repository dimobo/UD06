package code;

import javax.swing.JOptionPane;

public class Ejercicio03APP {
	public static void main(String[] args) {

		// Primero le pedimos al usuario que nos introduzca un n�mero para procesar.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero."));

		// En este if ejecutaremos el m�todo esPrimo que nos retornara un true o false
		// dependiendo de si el n�mero introducido era primo o no.
		if (esPrimo(num) == true) {
			JOptionPane.showMessageDialog(null, "El numero " + num + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + num + " no es primo.");
		}

	}

	// El siguiente m�todo ser� el responsable de averiguar si un n�mero es primo o
	// no, normalmente el 2 tendr�amos que tratarlo aparte, pero tal y como hemos
	// formulado el m�todo con el 2 no se ejecuta el bucle por lo que nos manda
	// directamente al return true.
	public static boolean esPrimo(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}

		return true;
	}

}
