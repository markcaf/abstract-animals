package org.abstracts.animals;

public class Passerotto extends Animale {

	public Passerotto(String nome) {
		super(nome);
	}
	
	@Override
	public void verso() {
		System.out.println("Firulì");

	}

	@Override
	public void mangia() {
		System.out.println("Mangime");
	}

}
