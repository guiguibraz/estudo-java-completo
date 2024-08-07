package fundamentos;

import java.util.Scanner;

public class YensRupias {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite a quantidade de Yene Japonês para ser transferido para Rupia indiano:");
		double yen = entrada.nextDouble();
		
		double resultado = yen * 0.53;
		
		System.out.printf("A conversão é Yene Japonês para Rupia Indiano é aproximadamente: " + "%.2f", resultado);
		System.out.print(" Rupias Indianas");
		
		entrada.close();
	}
}
