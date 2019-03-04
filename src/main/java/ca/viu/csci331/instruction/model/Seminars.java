package ca.viu.csci331.instruction.model;
import java.util.List;
import java.util.ArrayList;

public class Seminars {

	List<Seminar> seminars;
	int capacity, numOfSeminars;
	
	public Seminars(int capacity) {
		
		this.capacity = capacity;
		seminars = new ArrayList<Seminar>();
	}
	
	public void add(Seminar newSeminar) {
		
		if (numOfSeminars < capacity) {
		
			if (checkSeminarID(newSeminar.seminarId)) {
				seminars.add(newSeminar);
				numOfSeminars++;
				System.out.println("Adding Seminar: " + numOfSeminars);
			
			} else {
				System.out.println("Could not add seminar, seminar ID:  " + newSeminar.seminarId + " already exists in records.");
			}
		} else {
			System.out.println("Capacity is full, could not add Seminar.");
		}
	}
	
	/* 	add(Seminar ) helper
	 *	Check if seminar exists in list by comparing ID's.
	 */
	public boolean checkSeminarID(String id) {
		
		for (Seminar seminar : seminars)
			if (seminar.seminarId.equals(id))
				return false;
		
		return true;
	}
	
	public void cancel(Seminar removeSeminar) {
		if (seminars.removeIf(match -> match.equals(removeSeminar))) {
			System.out.println("Removing seminar: with ID: " + removeSeminar.seminarId); 
			numOfSeminars--;
		} else {
			System.out.println("Could not find matching seminar.");
		}
	}
	
	public void show() {
		if (seminars.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("There are currently no seminars available.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Seminars currently available: ");
		
		for (int i = 0; i < seminars.size(); i++) {
			System.out.println("\n" + seminars.get(i));
		}
		
	}
	
	public Seminar searchById(String id) {
		for (Seminar seminarID : seminars) {
			if (seminarID.seminarId.equals(id)) 
				return seminarID;
		}
		
		return Seminar.NOT_FOUND;
		
	}

	public int getNumOfSeminars() {
		return numOfSeminars;
	}

	public void setNumOfSeminars(int numOfSeminars) {
		this.numOfSeminars = numOfSeminars;
	}
}
