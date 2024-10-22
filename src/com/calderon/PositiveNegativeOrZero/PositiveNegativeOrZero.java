package com.calderon.PositiveNegativeOrZero;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public void showIsPositiveNegativeOrZero() {
		System.out.println("El numero es: " + this.getPositiveNegativeOrZero(

				this.getIntegerNumberFromUserKeyboard()));

	}

	public String getPositiveNegativeOrZero(Integer number) {
		String positiveNegativeOrZero = "";
		if (number > 0) {
			positiveNegativeOrZero = "positive";
		}

		else {
			if (number < 0) {
				positiveNegativeOrZero = "Negative";
			} else {
				positiveNegativeOrZero = "Cero";
			}
		}
		return positiveNegativeOrZero;

	}

	public Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("introduce un numero entero: ");
		numberFromUserKeyboard = scan.nextInt();

		scan.close();

		return numberFromUserKeyboard;

	}

}
