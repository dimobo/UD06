package code;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio09APP {

	// En el main de este ejercicio lo que tenemos es la llamada a un método que
	// llama a otro método para que le dé la información que le falta y a su vez
	// este llama a otro método que le completa.
	public static void main(String[] args) {

		mostrarArray(generarArray(pedirNumero("Introduzca un número entero positivo.")));

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

	// Este método es el encargado de general el array, como podemos ver es bastante
	// simple.
	public static int[] generarArray(int num1) {

		int num2[] = new int[num1];
		int rang = pedirNumero("Introduzca el número máximo del rango deseado\n para los números aleatorios.") + 1;
		Random r = new Random();

		for (int i = 0; i < num1; i++) {
			num2[i] = r.nextInt(rang);
		}

		return num2;
	}

	// Este método es el encargado de mostrar el array y sumar los números del
	// mismo.
	public static void mostrarArray(int[] num) {

		int suma = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("En la posicion " + (i + 1) + " tenemos: " + num[i]);
			suma = suma + num[i];
		}

		System.out.println("La suma de todos los numeros es: " + suma);

	}

}
