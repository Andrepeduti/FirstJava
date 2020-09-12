package codigos;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int[][] matriz = new int[3][3];
		Scanner kb = new Scanner (System.in);
	 int cont = 0, coluna, linha;
	 
	 
	 for (linha=0;linha<3;linha++){
		 for (coluna=0;coluna<3;coluna++)
		 {
			 System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
			 matriz[linha][coluna] = kb.nextInt();
			 if(matriz[linha][coluna]>10)
			 {
				 cont++;
			 }
		 }
		
		}
	 System.out.println("\nA matriz ficou: \n");
	 for( linha=0; linha <3; linha++)
	 {
		 for( coluna=0; coluna<3; coluna++)
		 {
			 System.out.printf("\t %d \t", matriz[linha][coluna]);
			 
			
		 }
		 
		 
		 System.out.println();
		 
	}
	 System.out.printf("\nNúmeros maior que 10: %d", cont);
		 
  }

}
