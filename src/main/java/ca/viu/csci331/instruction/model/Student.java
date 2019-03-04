package ca.viu.csci331.instruction.model;


public class Student {
	
	private String name, studentId, email;
	public static Student NOT_FOUND = new Student("Not Found","Not Found","Not Found");

	public Student(String name, String email, String studentId) {
		this.name = name;
		this.email = email;
		this.studentId = studentId;
	}
	
	public void show() { 
		System.out.println("----------------------------- ");
		System.out.println("Student Information: \n");
		System.out.println("\t Name: " + name);
		System.out.println("\t Student ID: " + studentId );
		System.out.println("\t Email: " + email);
		
	}
	
	@Override
	public String toString() {
		return ("\t Student Name: " + this.getName() +
				"\t ID: " + this.getStudentId() +
				"\t Email: " + this.getEmail());
	}
	
	// Get & Set Methods  	  
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
