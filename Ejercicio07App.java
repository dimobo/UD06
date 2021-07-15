package code;

import javax.swing.JOptionPane;

public class Ejercicio07App {
	public static void main(String[] args) {

		// Estas líneas le pedirán al usuario que introduzca la cantidad de monedas que
		// quiere traducir y a que devisa quiere hacerlo.
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad a calcular."));
		String nom = JOptionPane.showInputDialog("Introduzca la divisa a la que traducir:  \nlibras, dólares, yenes")
				.toLowerCase();

		// Esta línea está llamando al método camioMoneda y le envía los datos
		// introducidos por el usuario.
		cambioMoneda(num, nom);

	}

	public static void cambioMoneda(double num, String nom) {

		// Este switch diferenciara entra la divisa introducida por el usuario y luego
		// calculara el cambio de euros a la moneda.
		switch (nom) {
		case "libras":
			JOptionPane.showMessageDialog(null, num + "€ son " + (0.86 * num) + " libras");
			break;
		case "dólares":
			JOptionPane.showMessageDialog(null, num + "€ son " + (1.28611 * num) + " dólares");
			break;
		case "yenes":
			JOptionPane.showMessageDialog(null, num + "€ son " + (129.852 * num) + " yenes");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No has introducido una divisa correcta.");
			break;
		}

	}
}
