package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	
	/*Crie um programa para saber as notas de um aluno sua media e se fi aprovado 
	 * ou reprovado se for reprovado quantos prontos faltam para sua aprovação
	 * sabendo que a media tem que ser >= 60 em um total de 100. 
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("enter name, grade1, grade2, grade3:");
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() <60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
			}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
