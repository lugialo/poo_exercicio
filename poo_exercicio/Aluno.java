/*
 * Gabriel Antonin e Arthur Mendes 3-53
 */
package poo_exercicio;

public class Aluno {
	
String nome;
int idade;
double nota1, nota2, nota3, nota4, media;
	
	public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
		
		double media;
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}


}
