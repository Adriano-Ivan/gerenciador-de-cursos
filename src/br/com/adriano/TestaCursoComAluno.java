package br.com.adriano;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(
			String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",22));
		
		Aluno a1 = new Aluno("Roberto Torelo",232312);
		Aluno a2= new Aluno("Ving Calton",232381);
		Aluno a3 = new Aluno("Verg Almiro",232781);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out
				.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
//		Iterator<Aluno> iterador = alunos.iterator();
//		
//		while(iterador.hasNext()) {
//			Aluno proximo=iterador.next();
//			System.out
//					.println(proximo);
//		}
		javaColecoes.getAlunos().forEach(aluno->System.out.println(aluno));
	
		System.out
				.println("O aluno "+a1+" está matriculado ?");
		System.out
				.println(javaColecoes.estaMatriculado(a1));
	
		Aluno verg = new Aluno("Verg Almiro",232781);
		
		System.out
				.println("Verg está matriculado ?");
		System.out
				.println(javaColecoes.estaMatriculado(verg));
		
		System.out
				.println("A3 É IGUAL A VERG ?");
		System.out
				.println(a3.equals(verg));
		
		System.out
				.println("HASHS DE OBJECTS:");
		System.out
				.println(a3.hashCode()==verg.hashCode());
	}
}
