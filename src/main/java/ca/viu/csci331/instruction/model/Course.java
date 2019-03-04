package ca.viu.csci331.instruction.model;

public class Course {
	
	private String name, courseNumber, description;
	private double credits;
	public static Course NOT_FOUND = new Course("Not Found","Not Found","Not Found", 0.0);
	
	public Course(String name, String courseNumber, String description, double credits) {
		this.name = name;
		this.courseNumber = courseNumber;
		this.description = description;
		this.credits = credits;
	}
	
	public void show() {
		
		System.out.println("----------------------------- ");
		System.out.println("Course Information: \n");
		System.out.println("\t Course Name: " + name);
		System.out.println("\t Course Number: " + courseNumber );
		System.out.println("\t Description: " + description);
		System.out.println("\t Credits: " + credits);
	}
	
	@Override
	public String toString() {
		return ("\t Course Name: " + this.getName() +
				"\t Course Number: " + this.getCourseNumber() +
				"\t Description: " + this.getDescription() +
				"\t Credits:  " + this.getCredits());
	}
	
	// Get & Set Methods 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredit(double credits) {
		this.credits = credits;
	}
	
	
	

}
