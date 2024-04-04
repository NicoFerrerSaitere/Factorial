package vn.eclipse.factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculadora1Test {

	@Test
public void factorial0() {
		
		Calculadora C = new Calculadora();
		C.CalcFactorial(0);	
		double factorial = C.factorial;
		assertEquals(1,factorial);
	}
	@Test
public void factorialmas() {
		Calculadora C = new Calculadora();
		C.CalcFactorial(5);
		double factorial = C.factorial;
		assertEquals(120,factorial);
			
		}
	@Test
public void factorialmenos() {
		Calculadora C = new Calculadora();
		C.CalcFactorial(-50);
		assertTrue(true);
	}
	

}
