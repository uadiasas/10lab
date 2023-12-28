package Package;

public class Faculty {

	public Employee dean = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String officeAdress = "";

	public Faculty(Employee dean, String name, Date dateOfCreation, String officeAdress)  {
		this.dean = dean;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.officeAdress = officeAdress;
	}

	public double age() {
		// TODO - implement Faculty.age

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
		// TODO - implement Faculty.changeOfficeAdress
		
		this.officeAdress = newOfficeAdress;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.dean.toString() + " " + this.name + " " + this.dateOfCreation + " " + this.officeAdress;
	}

}