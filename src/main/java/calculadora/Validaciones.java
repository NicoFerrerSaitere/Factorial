package calculadora;

import exception.CalculadoraFactorialException;



public class Validaciones {
	

public static void validadorFactorial(int num) throws CalculadoraFactorialException {
		
		
		int minvalorfactorial = 0;
		
		if (num < minvalorfactorial) { // Especificamos lo que tiene que hacer el método si el número es menor que 0
			throw new CalculadoraFactorialException(""); // Le decimos al método que si se da la condición anterior, debe
														// lanzar una excepción
		}
	}
}
