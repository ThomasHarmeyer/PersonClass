package classes;

public class Person{
	//Fields
	private String name;
	private double salary;
	private Projects projects;
	//Constructors
	public void Person() {
		this.name = "Bob";
		this.salary = 1000000;
		this.projects=new Projects();
	}
	//Methods
	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}
}
