import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a hora inicial e a hora final do jogo: ");
		int horaInicial, horaFinal;
		int duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
		}
		else {
				duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		
		
		
		
		sc.close();
	}

}
