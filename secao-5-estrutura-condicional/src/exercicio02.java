import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		System.out.println("Digite um n�mero inteiro para saber se � par ou �mpar:");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero digitado � par");
		}
		else {
			System.out.println("O n�mero digitado � �mpar");
		}
		
		
		
		sc.close();
	}

}
