package com.viewnext.calculadora;

import com.viewnext.exception.CalculadoraFactorialException;

public class App {
	public static void main(String[] args) {
		int num = 9;
		Calculadora C = new Calculadora();
		try {
			System.out.println("El factorial de " + num + " es: " + Calculadora.factorial(num));
		} catch (CalculadoraFactorialException ExceptionFactorial) {
			System.out.println("No se puede hallar el factorial de un número negativo");
		} catch (Exception e) {
		}
	}
}
