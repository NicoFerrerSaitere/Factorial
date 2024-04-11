package com.viewnext.calculadora.tests;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import calculadora.Calculadora;
import calculadora.Main;
import calculadora.Validaciones;
import exception.CalculadoraFactorialException;
public class Calculadora1Tests {
	
	@Test
    public void testmain() {
        final Main main = new Main();
        main.main(null);
        Assertions.assertNotNull(main);
    }
	
	@Test
    public void testcalculadora() {
        final Calculadora calculadoraApi = new Calculadora();
        Assertions.assertNotNull(calculadoraApi);
    }
	@Test
    public void testvalidaciones() {
        final Validaciones validacion = new Validaciones();
        Assertions.assertNotNull(validacion);
    }
	
	
	
	@Test
	public void factorial0() throws Exception {
		long nfactorial = Calculadora.factorial(0);
		Assertions.assertEquals(1, nfactorial);
	}
	@Test
	public void factorial1() throws Exception {
		long nfactorial = Calculadora.factorial(1);
		Assertions.assertEquals(1, nfactorial);
	}
	@Test
	public void factorialmas() throws Exception {
		long nfactorial = Calculadora.factorial(5);
		Assertions.assertEquals(120, nfactorial);
	}
	@Test
	public void factorialmenos() throws Exception {
		
		assertThrows(CalculadoraFactorialException.class, () ->
		Calculadora.factorial(-1)
		);
        
	}
}
