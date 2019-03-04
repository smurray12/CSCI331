package ca.viu.csci331.instruction.model;
import java.util.List;
import java.util.ArrayList;

public class Enrollments {
	
	List<Enrollment> enrollments;
	int capacity, numOfEnrollments;
	
	public Enrollments(int capacity) {
		this.capacity = capacity;
		numOfEnrollments = 0;
		enrollments = new ArrayList<Enrollment>();
	}
	
	public void enroll(Enrollment newEnroll) {
		
		if (numOfEnrollments < capacity) {
			
			if (checkEnrollment(newEnroll.getStudent().getStudentId())) {
				enrollments.add(newEnroll);
				numOfEnrollments++;
				System.out.println("Adding Enrollment: " + numOfEnrollments);
				
			} else {
				System.out.println("Could not enroll student: " + newEnroll.getStudent().getName() + " because they are already enrolled.");
			}
			
		} else {
			System.out.println("Capacity is full, could not add enrollment.");
		}
	}
	
	/* 	enroll(Enrollment ) helper
	 *	Check if enrollment exists in list by comparing Student id.
	 */
	public boolean checkEnrollment(String id) {
		
		for (Enrollment enrollment : enrollments)
			if (enrollment.getStudent().getStudentId().equals(id))
				return false;
		
		return true;
	}
	
	public void cancel(Enrollment cancellEnroll) {
		
		if (enrollments.removeIf(match -> match.equals(cancellEnroll))) {
			System.out.println("Removing enrollment of Student: " + cancellEnroll.getStudent()); 
			numOfEnrollments--;
		} else {
			System.out.println("Could not find matching enrollment.");
		}
	}

	public void show() {
		
		if (enrollments.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("There are currently no enrollments.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Enrollments currently in records: ");
		
		for (int i = 0; i < enrollments.size(); i++) {
			System.out.println("\n" + enrollments.get(i));
		}
		
	}

	public int getNumOfEnrollments() {
		return numOfEnrollments;
	}

	public void setNumOfEnrollments(int numOfEnrollments) {
		this.numOfEnrollments = numOfEnrollments;
	}
	
}
