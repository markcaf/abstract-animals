package org.abstracts.animals;

public class Delfino extends Animale {

	public Delfino(String nome) {
		super(nome);
	}
	
	@Override
	public void verso() {
		System.out.println("Hihihihi");

	}

	@Override
	public void mangia() {
		System.out.println("Pesce, crostacei e calamari");
	}

}
