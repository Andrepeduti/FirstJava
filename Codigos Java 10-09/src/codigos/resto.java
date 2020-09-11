package codigos;

public class resto {

	public static void main(String[] args) {
//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		int x;
		
		for (x=1000;x<=1999;x++)
		{
			System.out.print("");	
		
		if (x % 11 == 5)
		{
			System.out.printf("\nOs números são: %d", x);
		}
		}

	}

}
