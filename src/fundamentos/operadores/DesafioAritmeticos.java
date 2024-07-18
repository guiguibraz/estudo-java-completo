package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
//		int a = 2 + 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
	
	int a = (6 * (3 + 2));
	int b = (int) Math.pow(a, 2);
	int c = b / (3 * 2);
	
	int d = ((1 - 5) * (2 - 7)) / 2;
	int e = (int) Math.pow(d, 2);
	
	int f = c - e;
	int g = (int) Math.pow(f, 3);
	
	int h = (int) Math.pow(10, 3);
	
	int i = g / h;
	System.out.println(i);

			
	}
}
