package Package;

import java.util.Date;

public class Institute {

	public String name = "";
	public Date dateOfCreation = null;
	public String adress = "";
	public List<ResearchAssociate> researchAssociates = new ArrayList<>();

	public Institute(String name, Date dateOfCreation, String adress) {
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.adress = adress;
	}

	public double age() {
		// TODO - implement Institute.age

		Date currentDate = System.currentDate();
		Date ageDate = currentDate.substract(this.birthday);
		double age = ageDate.getYear() + (ageDate.getMonthDays() + ageDate.getDays()) / 365;
		return age;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newAdress
	 */
	public void changeAdress(String newAdress) {
		// TODO - implement Institute.changeAdress

		this.adress = newAdress;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void addResearchAssociate(ResearchAssociate researchAssociate) {
		// TODO - implement Institute.addResearchAssociate

		if (!this.researchAssociates.contains(researchAssociate)) {
			this.researchAssociates.add(researchAssociate);
		}

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.dateOfCreation + " " + this.adress + " " + this.researchAssociates.forEach().toString().append(" ");
	}

}