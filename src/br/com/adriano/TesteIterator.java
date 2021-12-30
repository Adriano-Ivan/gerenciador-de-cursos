package br.com.adriano;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteIterator {

	public static void main(
			String[] args) {
		List<String> letras = new LinkedList<String>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> letrasIterator=letras.iterator();
	
		while(letrasIterator.hasNext()) {
			System.out
					.println(letrasIterator.next());
		}
	}
}
