package entities;

/*Classe com atributos de um aluno e metoto para saber a media do aluno e saber 
se foi aprovado ou reprovado e se reprovado quando falta para ser aprovado
*/
public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double finalGrade() {
		return (grade1 + grade2 + grade3)/3;
		
	}
public double missingPoints() {
	if(finalGrade() <           60.0) {
		return 60.0 - finalGrade();
	}
	else {
		return 0.0;
	}
}
}
