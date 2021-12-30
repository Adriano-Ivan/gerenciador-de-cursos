package br.com.adriano;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(
			String[] args) {
		Set<String> alunos = new HashSet<String>();
		alunos.add("Márcio Adido");
		alunos.add("Menus Ataris");
		alunos.add("Ricky Menzus");
		alunos.add("Hans Sterberg");
		alunos.add("Maurício Anísio");
		alunos.add("Hank Will");
		alunos.add("Menus Ataris");
		alunos.add("Paulo Silveira");
		
		System.out
				.println(alunos.size());
		for(String aluno:alunos) {
			System.out
					.println(aluno);
		}
		
		System.out
				.println();
		alunos.forEach(aluno->System.out
				.println(aluno));
		
		System.out
				.println();
		System.out
				.println(alunos);
		
		alunos.remove("Paulo Silveira");
		boolean contemPaulo = alunos.contains("Paulo Silveira");
		System.out
				.println(contemPaulo);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out
				.println(alunosEmLista);
	}
}
