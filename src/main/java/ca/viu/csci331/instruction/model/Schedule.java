package ca.viu.csci331.instruction.model;

public class Schedule {
	
	String day, location;
	int hour, minute, duration;
	
	public Schedule(String day, String location, int hour, int minute, int duration) {
		
		this.day = day;
		this.location = location;
		this.hour = hour;
		this.minute = minute;
		this.duration = duration;
	}
	
	public void show() {
		System.out.println("----------------------------- ");
		System.out.println("Schedule Information: \n");
		System.out.println("\t Day: " + day);
		System.out.println("\t Location: " + location);
		System.out.println("\t Time: " + hour + ":" + minute );
		System.out.println("\t Duration: " + duration);
	}
	
	@Override // to show objects
	public String toString() {
		return ("\t Day: " + this.getDay() +
				"\t Location: " + this.getLocation() +
				"\t Time: " + this.getHour() + ":" + this.getMinute() +
				"\t Duration: " + this.getDuration());
	}
	
	// Get & Set Methods
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	

}
