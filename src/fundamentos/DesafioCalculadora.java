package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	// Ler num1
	// Ler num2
	// + - * / %	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite um dos operadores + - * / %: ");
		String operador = entrada.next();
		
		System.out.println("Digite o segundo numero: ");
		double numero2 = entrada.nextDouble();
		
		double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
		resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
		resultado = "%".equals(operador) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				numero1, operador, numero2, resultado);
		
		entrada.close();
	}
	

}
