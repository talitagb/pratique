package exer_cond;

import java.util.Locale;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto;
		
		desconto = (preco < 20.00) ?  preco*0.1 : preco*0.05;
		
		System.out.printf("O descoonta é de = %.2f", desconto);
		
		sc.close();
	}

}
