package PacoteJava;

import java.util.Scanner;

public class RaizImparPar {
/*4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double numero, raiz, quadrado;
		System.out.print("Escreva um n�mero: ");
		numero=kb.nextInt();
				
		if (numero%2 == 0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero %.1f � par e sua raiz � %.2f", numero, raiz);
		}
		else
		{
			quadrado=Math.pow(numero, 2);
			System.out.printf("O n�mero %.2f � impar e elevado ao quadrado fica %.2f", numero, quadrado);
		}
		
		kb.close();
	}

}
