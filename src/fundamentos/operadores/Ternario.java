package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado1 = media >= 7.0 ? 
				"aprovado" : "em recuperação";
		System.out.println("O aluno está " + resultado1);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean TemDesconto = bomComportamento && passouPorMedia;
		String resultado = TemDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
