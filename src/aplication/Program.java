package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area Triangulo X = %.4f%n", areaX);
		System.out.printf("Area Triangulo Y = %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("O Triangulo X é maior");
		}
		else {
			System.out.println("O Triangulo Y é maior");
		}
		
		sc.close();
	}

}
