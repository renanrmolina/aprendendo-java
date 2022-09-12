import java.util.Scanner;

public class exerciciointernet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua nota para saber a situação: ");
		
		int nota;
		
		nota = sc.nextInt();
		
		if (nota >= 7 && nota <= 10) {
			System.out.println("PASSOU DIRETO");
		}
		else if (nota >= 5 && nota < 7){
			System.out.println("TEM DIREITO DE FAZER UMA PROVA DE RECUPERAÇÃO");
		}
		else if (nota >= 0 && nota < 5 ) {
			System.out.println("REPROVADO DIRETO");
		}
		else {
			System.out.println("NOTA INVÁLIDA");
		}
		
		
		
		sc.close();
	}

}
