package fundamentos.controle;

import java.util.Scanner;

public class IfElseTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor");
		String primeiroSalario = entrada.nextLine();
		System.out.println("Digite o segundo valor");
		String segundoSalario = entrada.nextLine();
		
		double primeiroSalarioDouble = Double.parseDouble(primeiroSalario);
		double segundoSalarioDouble = Double.parseDouble(segundoSalario);
		
		if (primeiroSalarioDouble > segundoSalarioDouble) {
			System.out.println("O primeiro salario: " + primeiroSalarioDouble + 
					" é maior que o segundo salario: " + segundoSalarioDouble);
		}else if (primeiroSalarioDouble < segundoSalarioDouble) {
			System.out.println("O primeiro salario: " + primeiroSalarioDouble + 
					" é menor que o segundo salário: " + segundoSalarioDouble);
		}else {
			System.out.println("Os dois salários são iguais");
		}
		
		entrada.close();
	}

}
