package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		
		Gatto gatto1 = new Gatto("Gatto");
		System.out.println("Animale: " + gatto1.getNome());
		gatto1.dormi();
		gatto1.mangia();
		gatto1.verso();
		

	}

}
