package br.com.adriano;

public class TesteBuscaAlunosNoCurso {

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
				.println("Quem é o aluno com matrícula 232781 ? ");
		Aluno aluno = javaColecoes.buscaMatriculado(232781);
	
		System.out
				.println("Aluno: "+aluno);
	}
}
