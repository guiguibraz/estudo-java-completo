package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numero = entrada.nextDouble();
		if (0 <= numero && numero <= 10) {

			if(numero % 2 == 0)
				System.out.println("Seu numero é " + numero + "\n" + "Seu numero é par");
			else 
				System.out.println("Seu numero é " + numero + "\n" + "Seu numero é impar");
		}
	
		
		
		
		entrada.close();
	}

}
