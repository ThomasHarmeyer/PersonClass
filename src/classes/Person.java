package classes;

public class Person {
	private String name;
	private double salary;
	InterestingFacts facts;
	
	public Person() {
		name = "Bob";
		salary = 1000000;
		facts = new InterestingFacts();
	}

	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}

}
