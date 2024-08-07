package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		double ano = entrada.nextDouble();
		if (ano % 4 == 0)
			System.out.println("O ano é Bissexto");
		else 
			System.out.println("O ano não é Bissexto");
		
		entrada.close();
	}

}
