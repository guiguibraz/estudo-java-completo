package fundamentos;

import java.util.Scanner;

/**
 * 
 * Usar o Scanner
 * usar 3 Strings com os 3 ultimos salarios
 * O usuário vai ter a flexibilidade de usar "." e ","
 * Pegar a média dos 3 funcionários
 * Pode suar "next" e "nextLine"
 * 
 */
public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro salário");
		String primeiroSalario = entrada.nextLine();
		
		System.out.println("Digite o segundo salário");
		String segundoSalario = entrada.nextLine();
		
		System.out.println("Digite o terceiro salário");
		String terceiroSalario = entrada.nextLine();
		
		primeiroSalario = primeiroSalario.replace(",", ".");
		segundoSalario = segundoSalario.replace(",", ".");
		terceiroSalario = terceiroSalario.replace(",", ".");
		
		double numero1 = Double.parseDouble(primeiroSalario);
		double numero2 = Double.parseDouble(segundoSalario);
		double numero3 = Double.parseDouble(terceiroSalario);
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		String mediaFormatada = String.format("%.2f", media);
		
		System.out.println("A média dos salarios é " + mediaFormatada);
		
				
		entrada.close();
	}
	
	

}
