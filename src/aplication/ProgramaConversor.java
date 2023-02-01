package aplication;

import java.util.Locale;
import java.util.Scanner;

import utils.ConversorDeMoeda;

//Exercício sobre membros estáticos

public class ProgramaConversor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dollar hoje?");
		double dollar = sc.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar?");
		double reais = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f ", ConversorDeMoeda.resultado(dollar, reais));
		
		sc.close();
	}

}
