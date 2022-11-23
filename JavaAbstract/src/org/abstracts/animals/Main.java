package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		
		Gatto gatto1 = new Gatto("Gatto");
		System.out.println("Animale: " + gatto1.getNome());
		gatto1.dormi();
		gatto1.mangia();
		gatto1.verso();
		
		Cane cane1 = new Cane("Cane");
		System.out.println("\nAnimale: " + cane1.getNome());
		cane1.dormi();
		cane1.mangia();
		cane1.verso();
		
		Delfino delfino1 = new Delfino("Delfino");
		System.out.println("\nAnimale " + delfino1.getNome());
		delfino1.dormi();
		delfino1.mangia();
		delfino1.verso();
		
		Aquila aquila1 = new Aquila ("Aquila");
		System.out.println("\nAnimale " + aquila1.getNome());
		aquila1.dormi();
		aquila1.mangia();
		aquila1.verso();
		
		Passerotto pass1 = new Passerotto("Passerotto");
		System.out.println("\nAnimale " + pass1.getNome());
		pass1.dormi();
		pass1.mangia();
		pass1.verso();

	}

}
