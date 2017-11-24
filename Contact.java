package mainPackage;


public class Contact {
	private String givenname,surname,number, address, email;
	
	
	public Contact() {
		givenname = "";
		surname = "";
		number = "";
		address = "";
		email = "";
	
		
	}
	
	public Contact(String gvnm,String srnm, String nmbr, String adrs,String ml) {
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
	public void editAddress(String n) {
		this.address= n;
		
	}
}
/* When we first thought of our Contact class, we first thought of the instance variables that we would use,
 * and what type they would be declared as in our code. We reasoned that making all of our instance variables 
 * String types was the easiest way to store all of the data of a contact, as contact numbers and emails have
 * many compenents that have numbers and chracters existing simultaneuosly in the data storage  
 */  																						
