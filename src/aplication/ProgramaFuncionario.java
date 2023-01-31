package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Qual a porcentagem para incrementar ao salário?");
		double porcentagem = sc.nextDouble();
		func.aumentarSalario(porcentagem);
		
		System.out.println("Dados Atualizados: " + func);
		

		sc.close();
	}

}
