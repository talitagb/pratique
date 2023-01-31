package aplication;
			
			import java.util.Locale;
			import java.util.Scanner;
			
			import entities.Estudante;
			
			public class ProgramaEstudante {
			
				public static void main(String[] args) {
					Locale.setDefault(Locale.US);
					Scanner sc = new Scanner (System.in);
					
					Estudante est = new Estudante();
					
					est.nome = sc.nextLine();
					est.nota1 = sc.nextDouble();
					est.nota2 = sc.nextDouble();
					est.nota3 = sc.nextDouble();
					
					System.out.printf("Nota Final: %.2f%n", est.notaFinal());
					
					if(est.notaFinal() >= 60.00) {
						System.out.println("Aprovado!!");
					}else {
						System.out.printf("Reprovado! %nFalta %.2f pontos para ser aprovado'", est.pontosFaltantes());
					}
			
					sc.close();
				}
			
			}
