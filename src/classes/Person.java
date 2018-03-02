package classes;

public class Person{
	//Fields
	private String name;
	private double salary;
  private Projects projects;
	private InterestingFacts facts;
	private Address address;
  
	//Constructors
	public Person() {
		name = "Bob";
		salary = 1000000;
		facts = new InterestingFacts();
		projects=new Projects();
		address = new Address();
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
	
	public Address getAddress() {
		return address;
	}
	public Projects getProjects() {
		return projects;
	}
}
