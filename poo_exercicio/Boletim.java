/*
 * Gabriel Antonin e Arthur Mendes 3-53
 */

package poo_exercicio;

public class Boletim {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno ();
		a1.nome = "Gabriel";
	    a1.nota1 = 7;
	    a1.nota2 = 8;
	    a1.nota3 = 7;
	    a1.nota4 = 9;
	    a1.media = calcularMedia(a1.nota1,a1.nota2,a1.nota3,a1.nota4);
	 
	    
	    
	    

	
	
	
	Professor p1 = new Professor ();
	p1.nomeprofessor = "Alex";
	p1.idade = 25;
	p1.disciplina = "Matemática";
	
	System.out.println("O aluno " + a1.nome + " teve a média de " + a1.media + " "
    		+ "na disciplina de " + p1.disciplina + ", do professor " + p1.nomeprofessor + ".");
	
	
	
}
public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
		
		double media;
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}

}
