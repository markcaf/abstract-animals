package org.abstracts.animals;

public class Cane extends Animale {

	public Cane(String nome) {
		super(nome);
	}
	
	@Override
	public void verso() {
		System.out.println("Bau Bau");

	}

	@Override
	public void mangia() {
		System.out.println("Croccantini");
	}

}
