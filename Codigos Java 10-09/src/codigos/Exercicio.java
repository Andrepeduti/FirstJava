package codigos;

import java.util.Scanner;

public class Exercicio {
/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída 
 * em qual categoria ela se encontra:
 10-14 infantil
·15-17 juvenil
·18-25 adulto
*/
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Entre com um idade: ");
		idade= kb.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.printf("Classe infatil");
		}
		
		if(idade>=15 && idade<=17)
		{
			System.out.print("Classe Juvenil");
		}
		
		if(idade>=18 && idade<=25)
		{
			System.out.print("Classe Adulta");
		}
		
		kb.close();
	}

}
