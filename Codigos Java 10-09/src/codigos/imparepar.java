package codigos;

import java.util.Scanner;

public class imparepar {

	public static void main(String[] args) {
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner kb = new Scanner (System.in);
		
		int idade, x, cont=0,cont1=0;
		
		for (x=1;x<=10;x++) 
		{
		System.out.print("Escreva um n�mero: ");
		idade = kb.nextInt();
		
		if ((idade % 2) == 0)
		{
			idade=cont++;
		}
		else 
		{
			idade = cont1++;
			

		}
		}		
		System.out.printf("Quantidade de n�mero par: %d", cont);
		System.out.printf("\nQuantidade de n�mero impar: %d", cont1);
	}

}
