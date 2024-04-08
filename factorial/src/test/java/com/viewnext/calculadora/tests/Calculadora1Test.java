package com.viewnext.calculadora.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.viewnext.calculadora.Calculadora;
import com.viewnext.exception.CalculadoraFactorialException;

public class Calculadora1Test {

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


			@Test(expected = CalculadoraFactorialException.class)
		public void factorialmenos() throws Exception {
				Calculadora apiCalculadora= new Calculadora();
				long factorial = Calculadora.factorial(-2);
			}
		}





