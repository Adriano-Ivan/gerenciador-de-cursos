package br.com.adriano;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(
			String[] args) {
		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out
				.println(aulas);
		
		aulas.remove(0);
		
		aulas.forEach((aula)->System.out
				.println(aula+"\n"));
		
		String primeiraAula = aulas.get(0);
		System.out
				.println("Primeira aula: "+primeiraAula);
		
		aulas.add("Acrescentando elemento");
		
		for(int i = 0; i<aulas.size();i++) {
			System.out
					.println(aulas.get(i));
		}
		
	
		Collections.sort(aulas);
		System.out
				.println("Após ordenação: "+aulas);
	}
}
