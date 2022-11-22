package org.abstracts.animals;

public abstract class Animale {
	
	private String nome;
	
	public Animale(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void dormi() {
		System.out.println("Zzzzzzzz");
	}
	
	public abstract void verso();
	
	public abstract void mangia();
}
