import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Codigo     Especificação        Preço");
		System.out.println("1          Cachorro Quente      R$ 4.00");
		System.out.println("2          X-Salada    	  	R$ 4.50");
		System.out.println("3          X-Bacon    	  	R$ 5.00");
		System.out.println("4          Torrada simples      R$ 2.00");
		System.out.println("5          Refrigerante      	R$ 1.50");
		System.out.println("Digite o código e a quantidade desejada: ");
		
		double codigo, qntd, preco;
		
		codigo = sc.nextDouble();
		qntd = sc.nextDouble();
		
		if (codigo == 1) {
			preco = 4.00 * qntd;
		} 
		else if(codigo == 2) {
			preco = 4.50 * qntd;
		}
		else if(codigo == 3) {
			preco = 5.00 * qntd;
		}
		else if(codigo == 4) {
			preco = 2.00 * qntd;
		}
		else {
			preco = 1.50 * qntd;
		}
		
		System.out.printf("TOTAL: R$ %.2f", preco);
		
		
		
		
		sc.close();
	}

}
