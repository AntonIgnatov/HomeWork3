package net.bigmir.venzor;

public class Human {
	private String name;
	private boolean sex;
	private int age;
	private double height;
	private double weight;
	private String race;

	public Human(String name, boolean sex, int age, double height, double weight, String race) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.race = race;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getRace() {
		return race;
	}

	@Override
	public String toString() {
		String s;
		if (this.sex) {
			s = "male";
		} else {
			s = "female";
		}
		return "Human [name=" + name + ", sex=" + s + ", age=" + age + ", height=" + String.format("%.3f.", height)
				+ ", weight=" + String.format("%.3f.", weight) + ", race=" + race + "]";
	}

}
