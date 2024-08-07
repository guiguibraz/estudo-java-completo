package fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nota = "";
		
		double resultado = 0;
		
		do {
			System.out.println("Digite a nota do aluno");
			
			nota = entrada.nextLine();
			
			double notanumero = Double.parseDouble(nota);
			
			resultado = resultado + notanumero;
			
			System.out.printf("O resultado é: " + resultado);
			
			
		} while(!nota.equals("-1"));
		
//		Double totalvalido =
		
//		Double media =
		
		
		entrada.close();
	}
}
