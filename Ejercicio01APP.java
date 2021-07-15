package code;

import javax.swing.JOptionPane;

public class Ejercicio01APP {

	// En este programa el m�todo main solo nos pedir� un input de texto y se lo
	// mandar� a otro m�todo que ser� el responsable de seguir con el programa.
	public static void main(String[] args) {

		menu(JOptionPane.showInputDialog("Introduce la figura a calcular: \nCirculo, Triangulo, Cuadrado.")
				.toLowerCase());

	}

	// Este es el m�todo que contendr� la "inteligencia" del programa, gracias al
	// switch que se ha programado nos pedir� unos datos y luego se los mandara al
	// m�todo para que los procese.
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
			JOptionPane.showMessageDialog(null, "Has introducido un valor no v�lido.");
			break;
		}

	}

	// Los siguientes m�todos ser�n los responsables de calcular las �reas de las
	// figuras, se ejecutar�n si son llamados por el m�todo Menu

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
