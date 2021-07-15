package code;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio12APP {
	public static void main(String[] args) {

		// En estas líneas generamos las variables que necesitemos al igual que las
		// arrays.
		int tam = pedirNumero("Introduzca el tamaño de las arrays.", false),
				num = pedirNumero("Introduzca el último dígito de los números.", true);
		int ar1[] = new int[tam], ar2[] = new int[tam];

		// En estas líneas estamos llamando a los métodos que se ocuparan de llenar
		// nuestras arrays.
		ar1 = generarArray(tam);
		ar2 = controlaArray(ar1, num);

		// Estas dos líneas serán las que imprimiremos por pantalla con la array ya
		// procesada.
		System.out.println("Números que coinciden con el criterio de búsqueda: ");
		mostrarArray(ar2);

	}

	// Este método es reciclado de otro ejercicio, lo que hace es que se asegura que
	// se introduzca un número válido, es decir un entero positivo
	public static int pedirNumero(String text, boolean unidad) {

		int num = 0;

		while (true) {
			String dato = JOptionPane.showInputDialog(text);
			if (!dato.equals(null)) {
				try {
					num = Integer.parseInt(dato);
					if (unidad == true && num >= 0 && num <= 9) {
						return num;
					} else if (unidad == false && num > 0) {
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

	// Este método es el encargado de general el array aleatorio, como podemos ver
	// es bastante simple.
	public static int[] generarArray(int num1) {

		int num2[] = new int[num1];
		Random r = new Random();

		for (int i = 0; i < num1; i++) {
			num2[i] = r.nextInt(301 - 1) + 1;
		}

		return num2;
	}

	// Este método es el encargado de mostrar el array.
	public static void mostrarArray(int[] num) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				System.out.print(num[i] + " ");
			}

		}

	}

	// Este método obtendrá las unidades de los números de la array y los comprará
	// con la unidad introducida por el usuario, en caso de que coincidan se añadirá
	// a la segunda array.
	public static int[] controlaArray(int[] num1, int num2) {

		int num3[] = new int[num1.length];

		for (int i = 0; i < num1.length; i++) {
			if ((num1[i] % 10) == num2) {
				num3[i] = num1[i];
			}
		}
		return num3;
	}
}
