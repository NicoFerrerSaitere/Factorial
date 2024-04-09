package com.viewnext.calculadora;

import com.viewnext.exception.CalculadoraException;

public class Validaciones {

public static void validadorFactorial(int num) throws CalculadoraException {
		
		
		int MIN_VALOR_FACTORIAL = 0;

		
		if (num < MIN_VALOR_FACTORIAL) { // Especificamos lo que tiene que hacer el método si el número es menor que 0

			throw new CalculadoraException(); // Le decimos al método que si se da la condición anterior, debe
														// lanzar una excepción
		}

	}
}
