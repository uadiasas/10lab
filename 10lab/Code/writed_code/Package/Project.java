package Package;

public class Project {

	public String name = "";
	public Date start = null;
	public Date end = null;
	public List<String> reports = new ArrayList<>();

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public double duration() {
		// TODO - implement Project.duration

		Date currentDate = System.currentDate();
		Date durationDate = currentDate.substract(this.birthday);
		double duration = durationDate.getYear() + (durationDate.getMonthDays() + durationDate.getDays()) / 365;
		return duration;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void createReport(ResearchAssociate researchAssociate) {
		// TODO - implement Project.createReport

		String newReport;

		// create report

		newReport += "\n [" + researchAssociate.name + "]";
		reports.add(newReport);

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.start + " " + this.end + " " + this.reports.forEach().append(" ");
	}

}