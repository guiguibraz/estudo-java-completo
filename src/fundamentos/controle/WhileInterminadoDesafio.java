package fundamentos.controle;

import java.util.Scanner;

public class WhileInterminadoDesafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String  resposta = "";
		while (!resposta.equalsIgnoreCase("sair")) {
			System.out.print("você diz: ");
			resposta = entrada.nextLine();
			
		}
		
		
		
		entrada.close();
	}

}
