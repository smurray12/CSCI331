package ca.viu.csci331.instruction.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfferedCourses {
	
	List<Course> courses;
	int capacity, numberOfCourses;
	
	public OfferedCourses(int capacity) {
		this.capacity = capacity;
		numberOfCourses = 0;
		courses = new ArrayList<Course>();
	}
	
	public void offer(Course name) {
		
		if (numberOfCourses < capacity) {
			
			if (checkCourseNum(name.getCourseNumber())) {
				courses.add(name);
				numberOfCourses++;
				System.out.println("Adding offered courses: " + numberOfCourses);
			
			} else {
				System.out.println("Could not add course, " + name.getCourseNumber() + " course number already exists in records.");
			}
			
		} else {
			System.out.println("Capacity is full, could not add Course.");
		}
	}
	
	/* 	offer(Course ) helper
	 *	Check if course exists in list by comparing courseNumber.
	 */
	public boolean checkCourseNum(String num) {
		
		for (Course course : courses)
			if (course.getCourseNumber().equals(num))
				return false;
		
		return true;
	}
	
	public void cancel(Course courseNumber) {
		
		Iterator<Course> itr = courses.iterator();
		boolean notFound = false;
		
		while (itr.hasNext() && !notFound) {
			
			Course removeCourse = itr.next();
			
			if (removeCourse.getCourseNumber().equals(courseNumber.getCourseNumber())) {
				itr.remove();	
				notFound = true;
				numberOfCourses--;
			}
		}
	}
	
	public void show() {
		if (courses.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("There are currently no courses offered.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Courses currently offered: ");
		
		for (int i = 0; i < courses.size(); i++) {
			System.out.println("\n" + courses.get(i));
		}
	}
	
	public Course searchByName(String name) {
		
		for (Course courseName : courses) {
			if (courseName.getName().contentEquals(name)) 
				return courseName;
		}
		
		return Course.NOT_FOUND;
	}
	
	public Course searchByCourseNum(String courseNumber) {
	
		for (Course courseNum : courses) {
			if (courseNum.getCourseNumber().equals(courseNumber)) 
				return courseNum;
		}
		
		return Course.NOT_FOUND;
	}
	
	public boolean equals(OfferedCourses obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if ( !(obj instanceof OfferedCourses)) return false;
		OfferedCourses s = (OfferedCourses) obj;
		return s.capacity == this.capacity;
	}

	public int getNumberOfCourses() {
		return numberOfCourses;
	}

	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}












