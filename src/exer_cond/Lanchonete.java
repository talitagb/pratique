package exer_cond;

import java.util.Locale;
import java.util.Scanner;


public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod, qnt;
		double total;
		
		cod = sc.nextInt();
		qnt = sc.nextInt();
		
		if(cod == 1) {
			total = qnt * 4.00;
		}
		else if (cod == 2) {
			total = qnt * 4.50;
		}
		else  {
			total = qnt * 5.00;
		}
		
		System.out.printf("Total: %.2f", total);
		
		
		sc.close();		
	}

}
