package ca.viu.csci331.instruction.model;
import java.util.List;
import java.util.ArrayList;

public class Seminar {
	
	String seminarId;
	int capacity;
	Course course; 
	Instructor instructor;
	List<Schedule> schedules;
	public static Seminar NOT_FOUND = new Seminar("Not Found",null, 0, null);
	
	public Seminar(String seminarId, Course course, int capacity, Instructor instructor) {
		
		this.seminarId = seminarId;
		this.capacity = capacity;
		this.instructor = instructor;
		this.course = course;
		schedules = new ArrayList<Schedule>();
	}
	
	public void addValidSchedule(Schedule validSchedule) {
		
		if (checkSchedule(validSchedule.getDay(), validSchedule.getLocation(), validSchedule.getHour())) {
			schedules.add(validSchedule);
			System.out.println("Adding valid schedule");
		} else {
			System.out.println("Same schedule already exists in records.");
		}

	}
	
	/* 	addValidSchedule(Schedule ) helper
	 *	Check if schedule exists in list by comparing date, location, & hour.
	 */
	public boolean checkSchedule(String day, String location, int hour) {
		
		for (Schedule schedule : schedules)
			if (schedule.getDay().equals(day) && schedule.getLocation().equals(location) && schedule.getHour() == hour)
				return false;
		
		return true;
	}
		
	public void removeSchedule(Schedule removeSchedule) {
		schedules.remove(removeSchedule);
	}	
	
	@Override // to show objects
	public String toString() {
		return ("\t Seminar ID: " + this.seminarId +
				"\t Capacity: " + this.capacity +
				"\t Course: " + course.getName() +
				"\t Instructor: " + instructor.getName());
	}

	public String getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(String seminarId) {
		this.seminarId = seminarId;
	}
	
}
