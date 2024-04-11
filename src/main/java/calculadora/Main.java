package calculadora;

import exception.CalculadoraFactorialException;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {

		final Logger logger = LogManager.getLogger(Main.class);
		String textoexception = "No se puede hallar el factorial de un número negativo";

		try {
			int num = 5;
			logger.info("El factorial de {} es: {}", num, Calculadora.factorial(num));
		} catch (CalculadoraFactorialException exceptcionfactorial1) {
			logger.info(textoexception);
		}

	}

}


