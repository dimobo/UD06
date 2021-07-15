package code;

import javax.swing.JOptionPane;

public class Ejercicio01APP {

	// En este programa el método main solo nos pedirá un input de texto y se lo
	// mandará a otro método que será el responsable de seguir con el programa.
	public static void main(String[] args) {

		menu(JOptionPane.showInputDialog("Introduce la figura a calcular: \nCirculo, Triangulo, Cuadrado.")
				.toLowerCase());

	}

	// Este es el método que contendrá la "inteligencia" del programa, gracias al
	// switch que se ha programado nos pedirá unos datos y luego se los mandara al
	// método para que los procese.
	private static void menu(String figura) {

		switch (figura) {
		case "circulo":
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo."));
			JOptionPane.showMessageDialog(null, radio + "^2 * PI = " + circulo(radio));
			break;

		case "triangulo":
			double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo."));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo."));
			JOptionPane.showMessageDialog(null, base + " * " + altura + " /2 = " + triangulo(base, altura));
			break;

		case "cuadrado":
			double costado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del cuadrado."));
			JOptionPane.showMessageDialog(null, costado + "*" + costado + " = " + cuadrado(costado));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Has introducido un valor no válido.");
			break;
		}

	}

	// Los siguientes métodos serán los responsables de calcular las áreas de las
	// figuras, se ejecutarán si son llamados por el método Menu

	private static double circulo(double radio) {
		double area = Math.pow(radio, 2) * Math.PI;
		return area;
	}

	private static double triangulo(double base, double altura) {

		double area = (base * altura) / 2;
		return area;

	}

	private static double cuadrado(double costado) {

		double area = costado * costado;
		return area;

	}
}
