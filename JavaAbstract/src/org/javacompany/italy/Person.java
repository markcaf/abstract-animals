package org.javacompany.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String companyCode;
	
	public Person(String name, String surname, LocalDate dateOfBirth) {
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		Random rnd = new Random();
		int rndCode = rnd.nextInt(00000, 99999); //set a random value of 5 number
        setCompanyCode(String.valueOf(rndCode)); //convert to string
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname() + " (" + getCompanyCode() + ")";
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {
		return getFullName() + " - " + getDateOfBirth();
	}
	
}
