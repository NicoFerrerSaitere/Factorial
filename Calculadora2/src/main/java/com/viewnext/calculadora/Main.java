package com.viewnext.calculadora;

import com.viewnext.exception.CalculadoraException;

public class Main {

	public static void main(String[] args) {

		int num = -2;
		Calculadora C = new Calculadora();
		try {
			System.out.println("El factorial de " + num + " es: " + Calculadora.factorial(num));
		} catch (CalculadoraException ExceptionFactorial) {
			System.out.println("No se puede hallar el factorial de un número negativo");
		} catch (Exception e) {
		}
	}

}
