package fundamentos.operadores;
/**
 * 
 * 2 trabalhos = 50 polegadas
 * 1 trablho = 32 polegadas
 * se for ao shopping comprar umas das tvs ira ter sorvete
 * 
 * nenhum dos dois deram certo = sem TV e sem sorvete
 * 
 */
public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		System.out.println("A tv de 50 polegadas será comprada? " +(trabalho1 && trabalho2));
		
		System.out.println("A tv de 32 polegadas será comprada? " + (trabalho1 ^ trabalho2));
		
		System.out.println("O sorvete será comprado? " + (trabalho1 || trabalho2));
		
		System.out.println("Vamos ficar em casa? " + (!trabalho1 && !trabalho2));
		
	}
}
