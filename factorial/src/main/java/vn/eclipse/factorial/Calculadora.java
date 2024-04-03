package vn.eclipse.factorial;


public class Calculadora {
	
	
	double factorial;
	int num;
	
	
	
	public void CalcFactorial(int num) {
		factorial=1;
		for (int i = num;i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println("El factorial de: " + num + " es: "+ factorial);
		
	}
	
}
