package codigos;

import java.util.Scanner;

public class Tenario {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner (System.in);
		
		int numero ; //valor entre 1 e 30
		
		
		System.out.println("Entre com um n�mero de 1 � 3: ");
		numero = kb.nextInt();
		System.out.printf((numero == 1) ? "Masculino" :(numero == 2) ? "Feminino": (numero == 3)? "N�o especificado": "Op��o inv�lida, tente novamente");
		
		
		
		
		kb.close();
	}

}
