package classes;

import java.util.ArrayList;

public class Projects {
	//Fields
	ArrayList<String> completedProjects = new ArrayList<String>();
	//Constructors
	public Projects() {
		completedProjects.add("PersonClass");
	}
	//Methods
	public String projectSummary() {
		String output = null;
		if (!completedProjects.isEmpty()) {
			output=completedProjects.get(0);
		}
		for (int x=1;x<completedProjects.size();x++) {
			output=output+"\n"+completedProjects.get(x);
		}
		return output;
	}
}
