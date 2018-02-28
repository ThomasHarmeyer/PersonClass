package classes;

public class Person{
	//Fields
	private String name;
	private double salary;
  private Projects projects;
	private InterestingFacts facts;
  
	//Constructors
	public Person() {
		name = "Bob";
		salary = 1000000;
		facts = new InterestingFacts();
    projects=new Projects();
    }
	
	//Methods
	public void moreMoney() {
		if (salary + 1000 < Double.MAX_VALUE) {
			salary += 1000;
		}
	}

	public InterestingFacts getFacts() {
		return facts;
  }
	public Projects getProjects() {
		return projects;
	}
}
