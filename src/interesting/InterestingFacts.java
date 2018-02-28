package interesting;

import java.util.ArrayList;

public class InterestingFacts {
	// Initialize funFacts list
	private ArrayList<String> funFacts = new ArrayList<>();

	// Default constuctor, adds some facts in there
	public InterestingFacts() {
		funFacts.add("Has a pet dog");
		funFacts.add("Pretty Cool");
	}

	// Aboutme method- returns a string where on each line of it, there is a number
	// and then the corresponding fact in the list
	public String aboutMe() {
		// Empty string made
		String abt = "";
		// For loop iterates through ArrayList size(), adds neccesary info to string
		for (int i = 0; i < funFacts.size(); i++) {
			abt += (i + 1) + ": " + funFacts.get(i) + "\n";
		}
		// Return whichever string. If there are no facts, returns empty string
		return abt;
	}
}
