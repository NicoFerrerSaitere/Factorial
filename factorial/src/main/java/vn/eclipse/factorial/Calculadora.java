package vn.eclipse.factorial;


public class Calculadora {
	
	
	double factorial;
	int num;
	
	
	
	public void CalcFactorial(int num) {
		
		if (num >0)
		{
			factorial=1;
		for (int i = num;i>0;i--) {
			factorial=factorial*i;
		}
			System.out.println("El factorial de " + num + " es: "+ factorial);
		}else if (num == 0) {
			factorial=1;
			for (int i = num;i>0;i--) {
				factorial=factorial*i;
			}
			System.out.println("El factorial de " + num + " es: 1");
		}else {
			System.out.println("No existe el factorial de un número menor que 0");
		}
		
		
		
		
	}
	
}
