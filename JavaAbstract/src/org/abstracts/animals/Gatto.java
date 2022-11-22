package org.abstracts.animals;

public class Gatto extends Animale {

	public Gatto(String nome) {
		super(nome);
	}
	
	@Override
	public void verso() {
		System.out.println("Miao miao");

	}

	@Override
	public void mangia() {
		System.out.println("Carne e pesce");
	}

}
