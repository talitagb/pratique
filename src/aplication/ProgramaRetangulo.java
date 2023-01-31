package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retang = new Retangulo();
		
		System.out.println("Insira a largura e depois a altura de um retângulo");
		retang.largura = sc.nextDouble();
		retang.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", retang.area());
		System.out.printf("PERIMETRO = %.2f %n", retang.perimetro());
		System.out.printf("DIAGONAL = %.2f %n", retang.diagonal());
		sc.close();
	}

}
