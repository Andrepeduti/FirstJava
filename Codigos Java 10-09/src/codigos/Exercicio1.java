package codigos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int idade, sexo, temperamento;
		int individuos = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		final int LIMITE = 5;
		
		
		while (individuos < LIMITE) {
			System.out.println("Idade do individuo:");
			idade = kb.nextInt();
			System.out.println("Sexo: \n 1 - Masculino\n2-Feminino :");
			sexo = kb.nextInt();
			
			System.out.println("Temperamento da pessoa: \n 1 - Calmo \n 2 - Nervoso \n 3 - Agressivo");
			temperamento = kb.nextInt();
			if(temperamento == 1) {
				calma++;
				if (idade<18) {
					pessoaCalma++;
				}
			}
			else if(sexo ==1 && temperamento == 3) {
				homemAgressivo++;
				
			}
			else if (idade > 40 && temperamento ==2) {
				pessoaNervosa++;
				if (sexo==2) {
					mulherNervosa++;
				}
			}
			individuos++;
			
		}
		System.out.printf("\nTotal de pessoas pesquisadas: %d", individuos);
		System.out.printf("\nNumero de pessoas calma: %d", calma);
		System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
		System.out.printf("\nNumeros de homens agressivos: %d",  homemAgressivo);
		System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
		System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
		
		kb.close();
	}


}


