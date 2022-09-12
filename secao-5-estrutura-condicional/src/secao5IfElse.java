import java.util.Scanner;

public class secao5IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hora;
		System.out.println("Que horas é agora?");
		hora = sc.nextInt();
		
		if (hora <= 11) {
			System.out.println("Bom dia");
		}
		else if(hora <= 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
			
		}
	
		sc.close();
	}

}
