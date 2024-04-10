package exception;

public class CalculadoraFactorialException extends Exception {

	public CalculadoraFactorialException() {
	}
	public CalculadoraFactorialException(String MENSAJE_ERROR) {

		super(MENSAJE_ERROR);
	}
}
