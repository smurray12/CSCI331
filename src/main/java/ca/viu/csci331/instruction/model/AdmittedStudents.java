package ca.viu.csci331.instruction.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdmittedStudents {
	
	List<Student> students;
	int capacity, numberOfStudents;
	
	public AdmittedStudents(int capacity) {
		this.capacity = capacity;
		numberOfStudents = 0;
		students = new ArrayList<Student>();
	}
	
	public void admit(Student admitStudent) {
		
		if (numberOfStudents < capacity) {
			
			if (checkStudentID(admitStudent.getStudentId())) {
				students.add(admitStudent);
				numberOfStudents++;
				System.out.println("Admitting Student: " + numberOfStudents);	
				
			} else {
				System.out.println("Student ID: " + admitStudent.getStudentId() + " already exists in records");
			}
			
		} else {
			System.out.println("Capacity is full, could not add Student.");
		}
	}
	
	/* 	admit(Student ) helper
	 *	Check if student exists in list by comparing ID's.
	 */
	public boolean checkStudentID(String id) {
		
		for (Student student : students)
			if (student.getStudentId().contentEquals(id))
				return false;
		
		return true;
	}
	
	public void cancel(Student removeStudent) {

		Iterator<Student> itr = students.iterator();
		boolean notFound = false;
		
		while (itr.hasNext() && !notFound) {
			
			Student person = itr.next();
			
			if (person.getStudentId().equals(removeStudent.getStudentId())) {
				itr.remove();	
				notFound = true;
				numberOfStudents--;
			}
		}
		
		if (!notFound) {
			System.out.println("Could not find student: " + removeStudent.getName() + " in records");
		
		} else if (notFound) {
			System.out.println("----------------------------- ");
			System.out.println("Removed " + removeStudent.getName());
		}
	}
	
	public void show() {
		
		if (students.size() == 0) {
			System.out.println("---------------------- ");
			System.out.println("Student Records are empty.");
		}
		
		System.out.println("----------------------------- ");
		System.out.println("Students in records: ");
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("\n" + students.get(i));
		}
	}
	
	public Student searchByName(String name) {
		
		for (Student person : students) {
			if (person.getName().contentEquals(name)) 
				return person;
		}
		
		return Student.NOT_FOUND;
	}
	
	public Student searchById(String studentId) {
		
		for (Student person : students) {
			
			if (person.getStudentId().equals(studentId)) 
				return person;
		}
		
		return Student.NOT_FOUND;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	
}
