package PacoteJava;

import java.util.Scanner;

public class RaizImparPar {
/*4-	Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double numero, raiz, quadrado;
		System.out.print("Escreva um número: ");
		numero=kb.nextInt();
				
		if (numero%2 == 0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O número %.1f é par e sua raiz é %.2f", numero, raiz);
		}
		else
		{
			quadrado=Math.pow(numero, 2);
			System.out.printf("O número %.2f é impar e elevado ao quadrado fica %.2f", numero, quadrado);
		}
		
		kb.close();
	}

}
