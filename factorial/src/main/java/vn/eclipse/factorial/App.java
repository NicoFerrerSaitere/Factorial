package vn.eclipse.factorial;

import java.util.Scanner;

public class App 
{
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		double factorial;
		int num;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt(); 
		factorial=1;
		for (int i = num;i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
				}
}
