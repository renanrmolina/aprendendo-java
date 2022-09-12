public class Main {
	public static void main(String[] args) {
		
		double a = 5.0;
		double b = 9.0;
		double c = 64.0;
		double x, y, z;
		
		x = Math.sqrt(a);
		y = Math.sqrt(b);
		z = Math.sqrt(c);
		
		System.out.println("A raiz quadrade de " + a + " = " + x);
		System.out.println("A raiz quadrade de " + b + " = " + y);
		System.out.println("A raiz quadrade de " + c + " = " + z);
		System.out.println();
		
		x = Math.pow(a, b);
		y = Math.pow(b, 2.0);
		z = Math.pow(2.0, 2.0);
		
		System.out.println(a+" elevado a " + b + " é igual à " + x);
		System.out.println(b + " elevado ao quadrado é igual à " + y);
		System.out.println("2 elevado ao quadrado é igual à " + z);
		System.out.println();
		
		z = Math.abs(c);
		System.out.println("O valor absoluto de " + c + " é " + z );
		
	
	
	
	
	
	
	
	
	
	}
}