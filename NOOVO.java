package PacoteJava;

import java.util.Scanner;

public class NOOVO {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n1, n2, n3, aux;
		
		System.out.print("Escreva o primeiro número: ");
		n1 = kb.nextInt();
		System.out.print("Escreva o segundo número: ");
		n2 = kb.nextInt();
		System.out.print("Escreva o terceiro número: ");
		n3 = kb.nextInt();
				if (n1>n2)
				{
					aux = n1;
					n1=n2;
					n2=aux;
				}
				if (n2>n3)
				{
					aux = n2;
				    n2=n3;
				    n3=aux;
				}
				System.out.printf("A ordem crescente é: %d,%d,%d", n1, n2, n3);
	}

}
