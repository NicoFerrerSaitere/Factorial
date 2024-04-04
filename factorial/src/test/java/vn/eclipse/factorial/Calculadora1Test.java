package vn.eclipse.factorial;



import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Calculadora1Test {

	@Test
public void factorial0() throws Exception {
		
		Calculadora C = new Calculadora();
		double nfactorial = C.factorial(0);
		assertEquals(1,nfactorial);
	}
	@Test
	public void factorial1() throws Exception {
			
			Calculadora C = new Calculadora();
			double nfactorial = C.factorial(1);
			assertEquals(0,nfactorial);
		}
	@Test
public void factorialmas() throws Exception {
		
		Calculadora C = new Calculadora();
		double nfactorial = C.factorial(5);
		assertEquals(120,nfactorial);
			
		}
	@Test
public void factorialmenos() throws Exception {
		Calculadora C = new Calculadora();
		Calculadora e = assertThrows(Calculadora.class, () -> {
			C.factorial(-1);
		});
		
		Assertions.assertEquals("No se puede hallar el factorial de un número negativo", e.toString());
	}
	

}
