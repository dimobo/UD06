package code;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio10APP {

	public static void main(String[] args) {

		procesarArray(generarArray());

	}

	// Este método es reciclado de otro ejercicio, lo que hace es que se asegura que
	// se introduzca un número válido, es decir un entero positivo
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
						JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				}
			} else {
				return num;
			}
		}

	}

	// Este método generara un número y se asegurara que sea primo, en caso
	// contrario lo descartara.
	public static int generarNumeroPrimo(int rang) {

		int num = 0;
		Random r = new Random();
		boolean esPrimo = false;

		while (esPrimo == false) {
			num = r.nextInt(rang);
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					esPrimo = false;
					i = num;
				} else {
					esPrimo = true;
				}
			}
		}

		return num;

	}

	// Este método será el encargado de generar el array lleno de números primos.
	public static int[] generarArray() {

		int rang = pedirNumero("Introduzca el número máximo del rango deseado\n para los números aleatorios.") + 1;
		int num[] = new int[pedirNumero("Introduzca el tamaño del array")];

		for (int i = 0; i < num.length; i++) {
			num[i] = generarNumeroPrimo(rang);

		}

		return num;

	}

	// Este método será el encargado de procesar los datos del array, es decir
	// mostrar por pantalla todos los valores que contiene y mostrar por un panel el
	// mayor.
	public static void procesarArray(int[] num) {

		int max = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("En la posicion " + (i + 1) + " tenemos: " + num[i]);
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "El número más grande que contiene la array es: "+max);

	}

}
