package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio02APP {
	public static void main(String[] args) {

		// Aquí le estamos pidiendo al usuario que nos introduzca los datos necesarios
		// para poder ejecutar el programa.
		int numGenera = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números a generar.")),
				min = Integer
						.parseInt(JOptionPane.showInputDialog("Introduzca el número más pequeño del rango deseado.")),
				max = Integer
						.parseInt(JOptionPane.showInputDialog("Introduzca el número más grande del rango deseado."));

		// En este for estamos ejecutando e imprimiendo por pantalla el resultado de
		// randomNum, he decidido imprimirlo por pantalla en lugar de por jpanel porque
		// podría ser muy molesto si pides muchos números.
		for (int i = 0; i < numGenera; i++) {
			System.out.println(randomNum(min, max));

		}

	}

	// Este método (randomNum) recibe 2 números y retorna un número dentro del rango
	// de los números introducidos ambos incluidos.
	public static int randomNum(int min, int max) {

		Random r = new Random();
		int randomNum = r.nextInt(max + 1 - min) + min;

		return (randomNum);
	}

}
