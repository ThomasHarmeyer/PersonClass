package classes;

public class Person {
	private String name;
	private double salary;

	public void Person() {
		this.name = "Bob";
		this.salary = 1000000;
	}

	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}
}
