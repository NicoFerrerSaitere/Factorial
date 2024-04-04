package vn.eclipse.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Calculadora1Test {

	@Test
	public void factorial0() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		double nfactorial = apiCalculadora.factorial(0);
		assertEquals(1, nfactorial);
	}

	@Test
	public void factorial1() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		double nfactorial = apiCalculadora.factorial(1);
		assertEquals(1, nfactorial);
	}

	@Test
	public void factorialmas() throws Exception {

		Calculadora apiCalculadora = new Calculadora();
		double nfactorial = apiCalculadora.factorial(5);
		assertEquals(120, nfactorial);

	}
//	@Test
//public void factorialmenos() throws Exception {
//		Calculadora apiCalculadora= new Calculadora();
//		Calculadora e = assertThrows(Calculadora.class, () -> {
//			apiCalculadora.factorial(-1);
//		});
//
//		Assertions.assertEquals("No se puede hallar el factorial de un número negativo", e.toString());
//	}
}
