package Exe1;
import java.util.Scanner;

public class CalculaMensalidade {

	public static void main(String[] args) {
		
		double valor_mensalidade;
		int numero_irmaos;

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira o valor da mensalidade:");
		valor_mensalidade = entrada.nextDouble();
		
		System.out.println("Insira o número de irmãos:");
		numero_irmaos = entrada.nextInt();
		
		
		if (numero_irmaos == 1) {
			System.out.println("O valor final da mensalidade é R$" + valor_mensalidade*0.95);
			
		} else if (numero_irmaos == 2) {
			System.out.println("O valor final da mensalidade é R$" + valor_mensalidade*0.90);
			
		} else if (numero_irmaos > 2) {
			System.out.println("O valor final da mensalidade é R$" + valor_mensalidade*0.85);
			
		} else {
			System.out.println("O valor final da mensalidade é R$" + valor_mensalidade*1.00);
			
		entrada.close();
		}
	}

}
