package PacoteJava;

import java.util.Scanner;

public class NOOVO {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n1, n2, n3, aux;
		
		System.out.print("Escreva o primeiro n�mero: ");
		n1 = kb.nextInt();
		System.out.print("Escreva o segundo n�mero: ");
		n2 = kb.nextInt();
		System.out.print("Escreva o terceiro n�mero: ");
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
				System.out.printf("A ordem crescente �: %d,%d,%d", n1, n2, n3);
	}

}
