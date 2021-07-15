package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio02APP {
	public static void main(String[] args) {

		// Aqu� le estamos pidiendo al usuario que nos introduzca los datos necesarios
		// para poder ejecutar el programa.
		int numGenera = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de n�meros a generar.")),
				min = Integer
						.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero m�s peque�o del rango deseado.")),
				max = Integer
						.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero m�s grande del rango deseado."));

		// En este for estamos ejecutando e imprimiendo por pantalla el resultado de
		// randomNum, he decidido imprimirlo por pantalla en lugar de por jpanel porque
		// podr�a ser muy molesto si pides muchos n�meros.
		for (int i = 0; i < numGenera; i++) {
			System.out.println(randomNum(min, max));

		}

	}

	// Este m�todo (randomNum) recibe 2 n�meros y retorna un n�mero dentro del rango
	// de los n�meros introducidos ambos incluidos.
	public static int randomNum(int min, int max) {

		Random r = new Random();
		int randomNum = r.nextInt(max + 1 - min) + min;

		return (randomNum);
	}

}
