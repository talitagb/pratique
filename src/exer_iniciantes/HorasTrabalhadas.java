package exer_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class HorasTrabalhadas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc;
		double numHoras, valorHora, salario;
		
		numFunc =sc.nextInt();
		numHoras = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		salario = numHoras*valorHora;
		
		System.out.printf("NUMERO = %d%n", numFunc);
		System.out.printf("SALÁRIO = R$ %.2f", salario);
		
		
		sc.close();
	}
}
