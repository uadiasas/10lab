package Package;

public class University {

	public Employee rector = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String mainOfficeAdress = "";

	public University(Employee rector, String name, Date dateOfCreation, String mainOfficeAdress) {
		this.rector = rector;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.mainOfficeAdress = mainOfficeAdress;
	}

	public double age() {
		// TODO - implement University.age

		Date currentDate = System.currentDate();
		Date ageDate = currentDate.substract(this.birthday);
		double age = ageDate.getYear() + (ageDate.getMonthDays() + ageDate.getDays()) / 365;
		return age;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newOfficeAdress
	 */
	public void changeOfficeAdress(String newOfficeAdress) {
		// TODO - implement University.changeOfficeAdress

		this.officeAdress = newOfficeAdress;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.rector + " " + this.name + " " + this.dateOfCreation + " " + this.mainOfficeAdress;
	}

}