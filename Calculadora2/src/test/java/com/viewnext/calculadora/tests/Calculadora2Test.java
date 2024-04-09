package com.viewnext.calculadora.tests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.viewnext.calculadora.Calculadora;
import com.viewnext.exception.CalculadoraException;

class Calculadora2Test {

	@Test
	public void factorial0() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		long nfactorial = Calculadora.factorial(0);
		Assertions.assertEquals(1, nfactorial);
	}

	@Test
	public void factorial1() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		long nfactorial = Calculadora.factorial(1);
		Assertions.assertEquals(1, nfactorial);
	}

	@Test
	public void factorialmas() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		long nfactorial = Calculadora.factorial(5);
		Assertions.assertEquals(120, nfactorial);

	}


	@Test
	public void factorialmenos() throws Exception {
		
		Calculadora apiCalculadora = new Calculadora();

		Exception exception = assertThrows(CalculadoraException.class, () ->
		Calculadora.factorial(-1)
		);
        
	}
}


