package ca.viu.csci331.instruction.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructors {
	
	List<Instructor> instructors;
	int capacity, numOfInstructors;
	
	public Instructors(int capacity) {
		this.capacity = capacity;
		numOfInstructors = 0;
		instructors = new ArrayList<Instructor>();
	}
	
	public void hire(Instructor id) {
		
		if (numOfInstructors < capacity) {
		
			if (checkInstructorID(id.getInsID())) {
				instructors.add(id);
				numOfInstructors++;
				System.out.println("Adding hired instructors: " + numOfInstructors);
			
			} else {
				System.out.println("Could not hire instructor, " + id.getInsID() + " instructor ID already exists in records.");
			}
		
		} else {
			System.out.println("Capacity is full, could not hired instructor.");
		}
	}
	
	/* 	hire(Instructor ) helper
	 *	Check if instructor exists in list by comparing ID's.
	 */
	public boolean checkInstructorID(String id) {
		
		for (Instructor instructor : instructors)
			if (instructor.getInsID().equals(id))
				return false;
		
		return true;
	}
	
	public void terminate(Instructor id) {
		Iterator<Instructor> itr = instructors.iterator();
		boolean notFound = false;
		
		while (itr.hasNext() && !notFound) {
			
			Instructor removeInstructor = itr.next();
			
			if (removeInstructor.getInsID().equals(id.getInsID())) {
				itr.remove();	
				notFound = true;
				numOfInstructors--;
			}
		}
	}
	
	public void show() {
		
		if (instructors.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("There are currently no instructors.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Instructors currently hired: ");
		
		for (int i = 0; i < instructors.size(); i++) {
			System.out.println("\n" + instructors.get(i));
		}
	}
	
	public Instructor searchByName(String name) {
		
		for (Instructor instructorName : instructors) {
			if (instructorName.getName().contentEquals(name)) 
				return instructorName;
		}
		
		return Instructor.NOT_FOUND;
	}
	
	public Instructor searchById(String id) {
		for (Instructor instructorID : instructors) {
			if (instructorID.getInsID().equals(id)) 
				return instructorID;
		}
		
		return Instructor.NOT_FOUND;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumOfInstructors() {
		return numOfInstructors;
	}

	public void setNumOfInstructors(int numOfInstructors) {
		this.numOfInstructors = numOfInstructors;
	}
	
}
