package exer_cond;

import java.util.Locale;
import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
			
		}
		
			System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
