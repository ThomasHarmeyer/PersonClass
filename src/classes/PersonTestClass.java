package classes;

public class PersonTestClass {
	
	public static void main(String[] args) {
	Person bob = new Person();
	for(int x=0;x<1000;x++) {
		bob.moreMoney();
	}
	System.out.println("Mailing Label:");
	System.out.println(bob.getAddress().mailingLabel());
	System.out.println("\nInteresting Facts:");
	System.out.println(bob.getFacts().aboutMe());
	System.out.println("\nOccupation:");
	System.out.println(bob.getOccupation().nameTag());
	System.out.println("\nProjects:");
	System.out.println(bob.getProjects().projectSummary());
	System.out.println("\nSchedule:");
	System.out.println(bob.getSchedule().mySchedule());
	}

}
