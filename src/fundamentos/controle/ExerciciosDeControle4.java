package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle4 {
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero: ");
		
		Scanner entrada = new Scanner(System.in);
		
		double numero = entrada.nextDouble();
		
		if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
			System.out.println("Esse número é primo");
		}
		else if (numero % 2 == 0 
				|| numero % 3 == 0 
				|| numero % 4 == 0
				|| numero % 5 == 0
				|| numero % 6 == 0
				|| numero % 7 == 0
				|| numero % 8 == 0
				|| numero % 9 == 0
				|| numero % 10 == 0)
			System.out.println("Esse número não é primo");
		else 
			System.out.println("Esse numero é primo");
		
		
		
		entrada.close();
	}

}
