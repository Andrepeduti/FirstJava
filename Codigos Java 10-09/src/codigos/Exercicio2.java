package codigos;



import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
 		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
*/
		
	Scanner kb = new Scanner (System.in);
	int vetor [] = new int [6];
	int coluna;
	
	int pares=0, impares=0, cont=0, soma=0, cont1=0;
	
	for (coluna=0;coluna<6;coluna++)
			{
		     System.out.printf("Insira o elemento V[%d]: \n",coluna+1);
		     vetor[coluna] = kb.nextInt();

		     if ((vetor[coluna] % 2) == 0)
				{
				cont++;	
		    	soma+=vetor[coluna];
		    	vetor[coluna]+=pares;
				}
				else 
				{
					cont1++;
					vetor[coluna]+=impares;
					
				}	
		     
			}

	System.out.printf("\nA soma dos numeros pares �: %d", soma);
	System.out.printf("\nQuantidade de n�mero impar: %d", cont1);
	
	}

}
