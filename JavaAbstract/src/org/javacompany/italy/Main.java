/**
 * 
 */
package org.javacompany.italy;

import java.time.LocalDate;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Paolino", "Paperino", LocalDate.now(), 600, 12);
		Employee emp2 = new Employee("Gastone", "Paperone", LocalDate.now(), 1800, 12);
		Employee emp3 = new Employee("Paperoga", "Duck", LocalDate.now(), 650, 10);

		Boss boss1 = new Boss("Paperon", "De Paperoni", LocalDate.now(), 5550, 1000);
		Boss boss2 = new Boss("John D.", "Rockerduck", LocalDate.now(), 5449, 999);

		Person[] company = {emp1, emp2, emp3, boss1, boss2};
		
		int minYearIncome = Integer.MAX_VALUE;
		int maxYearIncome = Integer.MIN_VALUE;
		Person minYearIncomePerson = null;
		Person maxYearIncomePerson = null;
		
		int maxIncomeBossValue = Integer.MIN_VALUE;
		int minIncomeEmployeeValue = Integer.MAX_VALUE;
		Person maxYearIncomeBoss = null;
		Person minYearIncomeEmployee = null;
		
		int sumCost = 0;
		
		for (int i=0; i<company.length; i++) {
			Person personMin = company[i];
			int minValue = personMin.getYearIncome();
			Person personMax = company[i];
			int maxValue = personMax.getYearIncome();
			
			if(minValue < minYearIncome ) {
				minYearIncome = minValue;
				minYearIncomePerson = personMin;
			}
			
			if(personMin instanceof Employee && minValue < minIncomeEmployeeValue) {
				minYearIncomeEmployee = personMin;
				minIncomeEmployeeValue =  minValue;
			}
			
			if(maxValue > maxYearIncome) {
				maxYearIncome = maxValue;
				maxYearIncomePerson = personMax;
			}

			if(personMax instanceof Boss && maxValue > maxIncomeBossValue) {
				maxYearIncomeBoss = personMax;
				maxIncomeBossValue = maxValue;
			}

			sumCost += maxValue;
			
		}
		
		int averageCost = sumCost/company.length;
		
		System.out.println("Person with higher annual salary: " + maxYearIncomePerson 
				+ "\n\nPerson with lower annual salary: " + minYearIncomePerson
				+ "\n\nTotal company cost: " + sumCost
				+ "\n\nAverage company cost: " + averageCost
				+ "\n\nBoss with higher annual salary: " + maxYearIncomeBoss
				+ "\n\nEmployee with lower annual salary: " + minYearIncomeEmployee);
	}

}
