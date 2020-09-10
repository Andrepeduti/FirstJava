package PacoteJava;

import java.util.Scanner;

/*1-	Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Exercicio1data0909 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int n, contador = 0, x;
		double maiorValor = 0;
		
		for (x=0;x<3;x++) 
		{
			System.out.print("Entre com o valor 1: ");
			n = kb.nextInt();
			
			
			if (maiorValor<n)
			{
				maiorValor=n;
			}
		}
		System.out.printf("Maior valor é: %.1f", maiorValor);
		
	}

}
