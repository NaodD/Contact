package mainPackage;


public class Contact {
	public String givenname,surname,number;
	
	//default constructor
	public Contact() {
		givenname = "";
		surname = "";
		number = "";
	}
	
	public Contact(String gvnm,String srnm, String nmbr) {
		this.givenname = gvnm;
		this.surname = srnm;
		this.number = nmbr;
	}
	public String toString ()
	   {
	      return surname + ", " + givenname + " :\t" + number;
	   }
	public void addNumber (String a) {
		if(!number.equals("")) {
			this.number = number;

		}
		else {
		}
	}
	public void editNumber(String n){
		this.number = n;
	}
	
	public void editSurname(String n){
		this.surname = n;
	}
	
	public void editGivenname(String n){
		this.givenname = n;
	}
	
	public void deleteNumber(String n){
		this.number = null;
	}
	
	public void deleteName(String n){
		this.givenname = null;
		this.surname = null;
	}
}
