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
}
