package br.com.adriano;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaPerformance {

	public static void main(
			String[] args) {
		long inicio=System.currentTimeMillis();
		
		List<Integer> numArray =(ArrayList<Integer>) retornaCollection(new ArrayList<Integer>(),50000);
		
		long fim=System.currentTimeMillis();
		
		System.out
				.println("Tempo para inserçao de 50000 elementos: "+(fim-inicio));
		
		pesquisarTodosOsElementosDeArrayList(numArray, 50000);
		
		System.out
				.println("\nSET:");
		long inicio2=System.currentTimeMillis();
		
		Set<Integer> numSet =(HashSet<Integer>) retornaCollection(new HashSet<Integer>(),50000);
		
		long fim2=System.currentTimeMillis();
		
		System.out
				.println("Tempo para inserçao de 50000 elementos: "+(fim2-inicio2));
	
		pesquisarTodosOsElementosDeHashSet(numSet, 50000);
		
	}
	
	public static Collection<Integer> retornaCollection(Collection<Integer> collection,int vezes){
		Collection<Integer> c = collection;
		for(int i = 0 ; i < vezes;i++) {
			c.add(i);
		}
		return c;
	}
	
	public static void pesquisarTodosOsElementosDeArrayList(List<Integer> al,int vezes) {
		long inicio = System.currentTimeMillis();
		
		for(int i  =0;i<vezes;i++) {
			al.contains(i);
		}
		
		long fim= System.currentTimeMillis();
		System.out
				.println("Tempo de pesquisa: "+(fim-inicio));
	}
	
	public static void pesquisarTodosOsElementosDeHashSet(Set<Integer> al,int vezes) {
		long inicio = System.currentTimeMillis();
		
		for(Integer n:al) {
			al.contains(n);
		}
		
		long fim= System.currentTimeMillis();
		System.out
				.println("Tempo de pesquisa: "+(fim-inicio));
	}
}
