package classes;

import java.util.ArrayList;

public class Projects {
	//Fields
	ArrayList<String> completedProjects;
	//Constructors
	public Projects() {
		completedProjects = new ArrayList<String>();
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
