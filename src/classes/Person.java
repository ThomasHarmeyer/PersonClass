package classes;

import java.util.ArrayList;

public class Person {
	private String name;
	private double salary;
	private ArrayList<String> funFacts = new ArrayList<>();

	public Person() {
		name = "Bob";
		salary = 1000000;
		funFacts.add("Cool Fact #1");
	}

	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}

	public String aboutMe() {
		String abt = "";
		for (int i = 0; i < funFacts.size(); i++) {
			abt += (i + 1) + ": " + funFacts.get(i) + "\n";
		}
		return abt;
	}
}
