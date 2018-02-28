package classes;

public class Address {
private String houseNumber;
private String street;
private String city;
private String state;
private String zip;

public Address() {
	houseNumber = "20800";
	street = "Bartlett Dr";
	city = "Brookfield";
	state = "WI";
	zip = "53045";
}
public String mailingLabel () {
	return houseNumber + " " + street + "\n" + city + " " + state + " " + zip;
}
}