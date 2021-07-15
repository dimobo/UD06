package code;

import javax.swing.JOptionPane;

public class Ejercicio03APP {
	public static void main(String[] args) {

		// Primero le pedimos al usuario que nos introduzca un número para procesar.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número."));

		// En este if ejecutaremos el método esPrimo que nos retornara un true o false
		// dependiendo de si el número introducido era primo o no.
		if (esPrimo(num) == true) {
			JOptionPane.showMessageDialog(null, "El numero " + num + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + num + " no es primo.");
		}

	}

	// El siguiente método será el responsable de averiguar si un número es primo o
	// no, normalmente el 2 tendríamos que tratarlo aparte, pero tal y como hemos
	// formulado el método con el 2 no se ejecuta el bucle por lo que nos manda
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
