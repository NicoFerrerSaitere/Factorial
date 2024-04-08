package com.viewnext.calculadora;

import com.viewnext.exception.CalculadoraFactorialException;
/**
 * Clase que realiza las validaciones
 */
public class Validaciones {

	public static void validadorFactorial(int num) throws CalculadoraFactorialException {
		
		
		int MIN_VALOR_FACTORIAL = 0;

		
		if (num < MIN_VALOR_FACTORIAL) { // Especificamos lo que tiene que hacer el método si el número es menor que 0

			throw new CalculadoraFactorialException(); // Le decimos al método que si se da la condición anterior, debe
														// lanzar una excepción
		}

	}
}
