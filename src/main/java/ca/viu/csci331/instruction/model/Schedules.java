package ca.viu.csci331.instruction.model;
import java.util.ArrayList;
import java.util.List;

public class Schedules {
	
	List<Schedule> schedules;
	int capacity, numOfSchedules;
	
	public Schedules(int capacity) {
		this.capacity = capacity;
		numOfSchedules = 0;
		schedules = new ArrayList<Schedule>();
	}
	
	public void add(Schedule newSchedule) {
		
		if (numOfSchedules < capacity) {
			if (checkSchedule(newSchedule.getDay(), newSchedule.getLocation(), newSchedule.getHour())) {
				schedules.add(newSchedule);
				numOfSchedules++;
				System.out.println("Adding Schedule: " + numOfSchedules);
			} else {
				System.out.println("Same schedule already exists in records.");
			}
			
		} else {
			System.out.println("Capacity is full, could not add Schedule.");
		}
	}
	
	/* 	add(Schedule ) helper
	 *	Check if schedule exists in list by comparing date, location, & hour.
	 */
	public boolean checkSchedule(String day, String location, int hour) {
		
		for (Schedule schedule : schedules)
			if (schedule.getDay().equals(day) && schedule.getLocation().equals(location) && schedule.getHour() == hour)
				return false;
		
		return true;
	}
	
	public void remove(Schedule removeSchedule) {

		if (schedules.removeIf(match -> match.equals(removeSchedule))) {
			System.out.println("Removing schedule: at " + removeSchedule.getLocation() + " at " + removeSchedule.getHour()
			+ ":" + removeSchedule.getMinute());
		
			numOfSchedules--;
		} else {
			System.out.println("Could not find matching schedule.");
		}
		
	}
	
	public void show() {
		
		if (schedules.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("There are currently no schedules available.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Schedules currently available: ");
		
		for (int i = 0; i < schedules.size(); i++) {
			System.out.println("\n" + schedules.get(i));
		
		}
	}

	public int getNumOfSchedules() {
		return numOfSchedules;
	}

	public void setNumOfSchedules(int numOfSchedules) {
		this.numOfSchedules = numOfSchedules;
	}
	
	
}  
