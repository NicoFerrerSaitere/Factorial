package calculadora;

import exception.CalculadoraFactorialException;

public class Main {

		public static void main(String[] args) {
			int num = 9;
			try {

				System.out.println("El factorial de " + num + " es: " + Calculadora.factorial(num));
			} catch (CalculadoraFactorialException exceptcionfactorial1) {
				System.out.println("No se puede hallar el factorial de un número negativo");
			}
		}

	}


