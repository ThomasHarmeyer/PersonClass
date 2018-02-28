package classes;

import java.util.ArrayList;

public class Person{
	//Fields
	private String name;
	private double salary;
	ArrayList<String> completedProjects = new ArrayList<String>();
	//Constructors
	public void Person() {
		this.name = "Bob";
		this.salary = 1000000;
	}
	//Methods
	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}
	public String projectSummary() {
		String output = null;
		if (!completedProjects.isEmpty()) {
			output=completedProjects.get(0);
		}
		for (int x=1;x<completedProjects.size();) {
			output=output+"\n"+completedProjects.get(x);
		}
		return output;
	}
}
