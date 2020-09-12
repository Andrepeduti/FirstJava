package codigos;

import java.util.Random;

public class Diagonal {

	public static void main(String[] args) {
        Random gerador = new Random ();		
		int matriz[][] = new int [3][3];
		
		final int LINHA=3;
		final int COLUNA=3; //linha e colunas constantes
		
		
		
		int linha,coluna, valorDigitado = 0, soma = 0, total = 0;
		for(linha=0; linha<LINHA; linha++)
		{
			System.out.printf(" | ");
			
			for (coluna=0; coluna<COLUNA; coluna++)
			{
				valorDigitado = gerador.nextInt(6)+1;
				matriz[linha][coluna] = valorDigitado;
				 
				// escreva("Matriz [",l,"][",c,"] :", matriz[l][c])
			
				System.out.print(matriz[linha][coluna]);
				System.out.print(" | ");
				//somatorio
				total = total + matriz[linha][coluna];
								//calcula a diagonal
				if (linha==coluna)
				{
					soma = soma + matriz[linha][coluna];
				}
				
			}
			System.out.print("\n");
		}
		System.out.printf("Soma da diagonal principal é : %d", soma);
		
	}
}