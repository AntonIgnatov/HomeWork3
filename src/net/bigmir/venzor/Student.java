package net.bigmir.venzor;

public class Student extends Human {
	private double bal; // sredi bal
	private int nomber;
	private double attendance; // poseshaemost

	public Student(String name, boolean sex, int age, double height, double weight, String race, double bal, int nomber,
			double attendance) {
		super(name, sex, age, height, weight, race);
		this.bal = bal;
		this.nomber = nomber;
		this.attendance = attendance;

	}

	public Student() {
		super();
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getNomber() {
		return nomber;
	}

	public void setNomber(int nomber) {
		this.nomber = nomber;
	}

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return this.getName() + " age " + this.getAge() + " # " + nomber + " bal " + String.format("%.1f.", bal)
				+ " poseshaemost " + attendance;
	}

}
