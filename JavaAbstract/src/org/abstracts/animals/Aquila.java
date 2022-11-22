package org.abstracts.animals;

public class Aquila extends Animale {

	public Aquila(String nome) {
		super(nome);
	}
	
	@Override
	public void verso() {
		System.out.println("AAAAAAAAA");

	}

	@Override
	public void mangia() {
		System.out.println("Volpi, lepri, marmotte, conigli selvatici");
	}

}
