package cajaBlanca;

import java.util.Scanner;
/**
 * Codigo de ejemplo de un ejercicio de caja blanca
 * @author dam111
 * @version 1.0
 * 
 */

public class EjemploCajaBlanca {
	/**
	 * 
	 * @hiddens
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	static String CompruebaNumeroPerfecto(int num) {
		int divisor = 1, sumadivisores = 0;
		String Cadena = "";
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				sumadivisores += divisor;
			}
			divisor++;
		}
		if (num == sumadivisores) {
			Cadena = "El numero " + num + " es un numero perfecto";

		} else {
			Cadena = "El numero " + num + " no es un numero perfecto";
		}
		return Cadena;
	}
}