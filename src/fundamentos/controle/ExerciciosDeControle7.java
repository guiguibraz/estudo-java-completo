package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao progama de somatória");
		
		double numeroDigitado = 0;
		
		double resultado = 0;
		
		do {
			System.out.println("Digite um numero positivo para somar,"
					+ " ou um numero negativo para encerrar:");
			
			numeroDigitado = entrada.nextDouble();
			
			resultado = numeroDigitado + resultado;
			
			System.out.println("A soma de todos os numeros digitados é " + resultado);
			
		}while (numeroDigitado > 0);
		
		System.out.println("Você encerrou o programa!!! ");
		
		entrada.close();
	}

}
