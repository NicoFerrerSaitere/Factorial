package com.viewnext.calculadora.tests;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import calculadora.Calculadora;
import exception.CalculadoraFactorialException;
public class Calculadora1Tests {
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
		Exception exception = assertThrows(CalculadoraFactorialException.class, () ->
		Calculadora.factorial(-1)
		);
        
	}
}
