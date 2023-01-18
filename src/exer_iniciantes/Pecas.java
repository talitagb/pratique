package exer_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod1, cod2, qnt1, qnt2;
		double valor1, valor2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total =  (valor1 * qnt1) + (valor2 * qnt2);
		
		System.out.printf("VALOR A PAGAR = %.2f", total);
		
		
		
		
		sc.close();		

	}

}
