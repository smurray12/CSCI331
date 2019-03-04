package ca.viu.csci331.instruction.model;

public class Instructor {
	
	private String name, insID, email;
	public static Instructor NOT_FOUND = new Instructor("Not Found","Not Found","Not Found");
	
	public Instructor(String name, String insID, String email) {
		
		this.name = name;
		this.insID = insID;
		this.email = email;
	}
	
	public void show() {
		System.out.println("----------------------------- ");
		System.out.println("Instructor Information: \n");
		System.out.println("\t Name: " + name);
		System.out.println("\t ID: " + insID );
		System.out.println("\t Email: " + email);
	}
	
	@Override // to show objects
	public String toString() {
		return ("\t Instructor Name: " + this.getName() +
				"\t ID: " + this.getInsID() +
				"\t Email: " + this.getEmail());
	}
	
	// Get & Set Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsID() {
		return insID;
	}

	public void setInsID(String insID) {
		this.insID = insID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
