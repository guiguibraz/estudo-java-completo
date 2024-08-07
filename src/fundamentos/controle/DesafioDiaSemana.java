package fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o dia da Semana!!!");
		String resposta = entrada.nextLine();
		resposta = resposta.toLowerCase();
		resposta = resposta.replace("ç", "c");
		
		if (resposta.equals("domingo")) {
			System.out.println(1);
		} else if (resposta.equals("segunda")) {
			System.out.println(2);
		} else if (resposta.equals("terca")) {
			System.out.println(3);
		} else if (resposta.equals("quarta")) {
			System.out.println(4);
		} else if (resposta.equals("quinta")) {
			System.out.println(5);
		} else if (resposta.equals("sexta")) {
			System.out.println(6);
		}else if (resposta.equals("sabado")) {
			System.out.println(7);
		}
		
		
		entrada.close();
		
	}

}
