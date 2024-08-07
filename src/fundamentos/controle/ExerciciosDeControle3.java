package fundamentos.controle;

import java.util.Scanner;

public class ExerciciosDeControle3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema de média, digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);
		
		if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Recuperação");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota inválida");
        }
		
		
		
		entrada.close();
	}

}
