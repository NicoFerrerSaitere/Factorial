package vn.eclipse.factorial;

public class App 
{
	public static void main(String[]args) {
		int num = 1;
		Calculadora C = new Calculadora();
		try {
			System.out.println("El factorial de " + num + " es: " + C.factorial(num));
		} catch (Exception NumOutOfRange) {
			System.out.println("No se puede hallar el factorial de un número negativo");
		}
}
}
