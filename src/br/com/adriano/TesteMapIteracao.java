package br.com.adriano;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TesteMapIteracao {

	public static void main(
			String[] args) {
		Map<Integer, String> pessoas =new HashMap<>();
	
		pessoas.put(21,"Flavius Sengous");
		pessoas.put(87, "Metilío Bracius");
		pessoas.put(12,"Aurílio Mencapto");
		pessoas.put(10, "Chingim Machado");
		
		Set<Integer> chavesMap = pessoas.keySet();
		
		chavesMap.forEach(chave->System.out.println(pessoas.get(chave)));
		
		System.out
				.println("\nCHAVES");
		pessoas.keySet().forEach(key->System.out.println(key));
	
		System.out
				.println("\nVALORES");
		pessoas.values().forEach(value->System.out.println(value));
		
		System.out
				.println("\nASSOCIAÇÕES:");
		pessoas.entrySet().forEach(es->System.out.println(es));
	}
}
