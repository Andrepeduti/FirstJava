package codigos;

import java.util.Scanner;

public class imparepar {

	public static void main(String[] args) {
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner kb = new Scanner (System.in);
		
		int idade, x, cont=0,cont1=0;
		
		for (x=1;x<=10;x++) 
		{
		System.out.print("Escreva um número: ");
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
		System.out.printf("Quantidade de número par: %d", cont);
		System.out.printf("\nQuantidade de número impar: %d", cont1);
	}

}
