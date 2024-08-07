package fundamentos.controle;

import java.util.Scanner;

// resultado 1 = contagem chegar a 10 e dar jogo perdido
// resultado 2 = acertar o numero e dar jogo ganho

public class ExerciciosDeControle6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem-vindo ao Jogo da adivinhação");
		
		int numeroEscolhido = (int)Math.round(Math.random() * 100);
		
		int numeroDigitado = 0;
		
		int contagem = 10;
		
		do{
			System.out.println("Seu numero de tentativas restantes são: " + contagem);
			
			System.out.println("digite um número de 1 a 100");
			
			numeroDigitado = entrada.nextInt();
			
			if(numeroDigitado == numeroEscolhido) {
				System.out.println("Parabéns, você acertou o numero!!! ");
				break;
			}

			if(numeroDigitado > numeroEscolhido) {
				System.out.println("O numero correto é menor que o digitado");
			}else {
				System.out.println("O numero correto é maior que o digitado");
			}
			
			contagem = contagem - 1;
			
			if(contagem == 0) {
				System.out.println("Você perdeu ;-;");
			}
			
		}while (contagem > 0 && numeroDigitado != numeroEscolhido);
		System.out.println("O numero correto era: " + numeroEscolhido);


		entrada.close();
	}

}
