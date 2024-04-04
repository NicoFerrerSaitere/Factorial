package vn.eclipse.factorial;

/**
 * Esta clase realiza las operaciones de una calculadora
 */

public class Calculadora 
{
	/**
	 * Método que devuelve el factorial de un número dado
	 * @param nfactorial El parámetro nfactorial define el número que se quiere factorizar
	 * @param num El parámetro num define los números que se multiplican para desarrollar la operacion de realizar el factorial de un número
	 * @return El factorial del número ingresado
	 * @throws Exception NumOutOfRange Se produce cuando el numero que se quiere factorizar no es mayor o igual que 0
	 */
	
	public double factorial(final int num) throws Exception
	{
		
		double nfactorial;	// Definimos el parámetro nfactorial
		
		if (num<0)	// Especificamos lo que tiene que hacer el método si el número es menor que 0
			{
				throw new Exception();	// Le decimos al método que si se da la condición anterior, debe lanzar una excepción
			}
		else	// En caso de que no se cumpla la condición anterior, se ejecutará esta parte del método
			{
				nfactorial=1;	// Inicializamos la variable
				for (int i = num;i>0;i--)	//Ejecutamos un bucle, que se ejecutará siempre y cuando el parametro i sea mayor que 0
				{
					nfactorial=nfactorial*i;	// Operación para hallar el factorial
				}
			}
		return nfactorial;	// Devuelve el resultado de la operación
	}
	
}
