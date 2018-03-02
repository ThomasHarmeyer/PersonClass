package classes;

public class Occupation {

	private String companyName;
	private String jobTitle;
	
	
	public Occupation(String companyName, String jobTitle) {
		
		this.companyName = "Osterburg Industries";
		this.jobTitle = "Brown Noser";
	}

	
	public String nameTag() {
	
		String tag = companyName+"\n"+jobTitle;
		return tag;
	
	}
}