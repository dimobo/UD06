package code;

import javax.swing.JOptionPane;

public class Ejercicio06APP {
	public static void main(String[] args) {

		int num = 0;

		// En este bloque estamos controlando que num reciba un número entero positivo
		// (superior a 0).
		while (true) {
			String dato = JOptionPane.showInputDialog("Introduce un número entero positivo.");
			if (!dato.equals(null)) {
				try {
					num = Integer.parseInt(dato);
					if (num > 0) {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				}
			} else {
				break;
			}
		}

		// La siguiente línea ejecuta el método calcCifras que será el encargado de
		// contar las cifras que contenga el número introducido.
		JOptionPane.showMessageDialog(null, "El número de cifras de " + num + " es: " + calcCifras(num));

	}

	// Este método ira dividiendo el número introducido entre 10 e ira sumando 1 a
	// la variable que guarda las cifras.
	public static int calcCifras(int num) {

		int i = 1;

		// El length tiene un -1 porque si no nunca llega a 0 y se genera un bucle
		// infinito.
		while (Integer.toString(num).length() - 1 > 0) {
			num = num / 10;
			i++;

		}

		return i;

	}
}
