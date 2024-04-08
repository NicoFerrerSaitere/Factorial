package com.viewnext.calculadora;

import com.viewnext.exception.CalculadoraFactorialException;

/**
 * Esta clase realiza las operaciones de una calculadora
 */
public class Calculadora {

	/**
	 * Método que devuelve el factorial de un número dado
	 *
	 * @param num El parámetro num define los números que se multiplican para
	 *            desarrollar la operacion de realizar el factorial de un número
	 * @return El factorial del número ingresado
	 * @throws CalculadoraFactorialException Se produce cuando el numero que se
	 *                                       quiere factorizar no es mayor o igual
	 *                                       que 0
	 */
	public static long factorial(final int num) throws CalculadoraFactorialException {

		long nfactorial = 1; // Inicializamos el parámetro nfactorial que define el número que se quiere
								// factorizar

		Validaciones.validadorFactorial(num); // Llamamos al método validadorFactorial de la clase Validadciones

		if (num == 0 || num == 1) { // Especificamos los que tiene que hacer el método en caso de ser 0 o 1
			nfactorial = 1;
		} else // Especificamos lo que hace el método en caso de que el número sea ma
		{
			for (int i = num; i > 0; i--) // Ejecutamos un bucle, que se ejecutará siempre y cuando el parametro i sea
											// mayor que 0
			{
				nfactorial = nfactorial * i; // Operación para hallar el factorial
			}
		}
		return nfactorial; // Devuelve el resultado de la operación
	}

}
