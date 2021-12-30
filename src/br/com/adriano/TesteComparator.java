package br.com.adriano;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteComparator {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> it = funcionarios.iterator();
        
        while(it.hasNext()) {
        	System.out
					.println(it.next());
        }
    }
}
class OrdenaPorIdade implements Comparator<Funcionario>{
   public int compare(Funcionario f1, Funcionario f2) {
	   return Integer.compare(f1.getIdade(), f2.getIdade());
   }
}



class Funcionario {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    } 

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
    	return nome;
    }
}