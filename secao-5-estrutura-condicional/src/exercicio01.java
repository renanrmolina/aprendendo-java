import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero > 0) 
			{System.out.println("N�O NEGATIVO");
		}
		else {
			System.out.println("Negativo");
		}

		sc.close();
		
	}
	

}
