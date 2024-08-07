package fundamentos;

import java.util.Scanner;

public class Kwanza {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite a quantidade de Real para ser transferido para Kwanza:");
		double reais = entrada.nextDouble();
		
		double a = 155.84;
		
		double resultado = reais * a;
		
		System.out.printf("A conversão é Reais para Kwanza é aproximadamente: " + "%.2f", resultado );
		
		entrada.close();
		
	}
}
