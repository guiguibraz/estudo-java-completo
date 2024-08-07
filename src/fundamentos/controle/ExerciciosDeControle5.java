package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = entrada.nextInt();
		
		switch (numero1) {
		case numero1 == 2:
			System.out.println("O número é primo");
		break;
		case numero1 % 2 == 0:
			System.out.println("O numero não é primo");
		break;
		default:
			System.out.println("numero é primo");
		}
		
		
		entrada.close();
	}

}
