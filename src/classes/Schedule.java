package classes;

public class Schedule {
	// Initilizing new one dimentional array with five elements 
		private String[] scheduledMeetings = new String[5];
		
		// Default constructor
		public Schedule() {
			
			//Just putting in some values
			scheduledMeetings[0] = "7:30 Starting Sprint";
			scheduledMeetings[1] = "9:30 Sprint Breifing";
			scheduledMeetings[2] = "11:30 Sprint Kickoff";
			scheduledMeetings[3] = "1:30 Sprint Plan Review";
			scheduledMeetings[4] = "3:30 More Sprint Stuff";
		}
		
		// Method implementation of mySchedule
		public String mySchedule() {
			//Declaring my return variable
			String meetings = scheduledMeetings[0];
			//Using for loop to fill my array
			for (int count = 1; count < 5; count++) {
				meetings = meetings + "\n" + scheduledMeetings[count];
			}
			//Returning my value
			return meetings;
		}
	}
