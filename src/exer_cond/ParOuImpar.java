package exer_cond;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		sc.close();
	}

}
