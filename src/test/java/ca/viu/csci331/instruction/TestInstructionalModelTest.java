package ca.viu.csci331.instruction;
import ca.viu.csci331.instruction.model.*;

import org.junit.Test;
import org.junit.Assert;

public class TestInstructionalModelTest {
	
	// Student & AdmittedStudents tests
	@Test
	public void testAdmitStudent() {
		
		Student students[] = {
				new Student("Sarah Williamson", "a@hotmail.com", "23452642"),
				new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342"),
				new Student("Jacob Smith", "jacobkins@yandex.com", "53334"),
				new Student("Walrus Henry", "kittens@hotmail.ca", "64435"),
				new Student("Willow Tree", "willowapple@yahoo.ca", "3453"),
				new Student("Andrew Pilsbury", "cowtown@hotmail.ca", "34534532")
		};
	
		AdmittedStudents admitStudent = new AdmittedStudents(6);
			
		Assert.assertTrue(admitStudent.getNumberOfStudents() == 0);
		
		int countStudent = 0;
		for (Student student : students) {
			admitStudent.admit(student);
			countStudent++;
			Assert.assertTrue(admitStudent.getNumberOfStudents() == countStudent);
		}		
	}
	
	@Test
	public void testSearchByName() {
		
		Student students[] = {
				new Student("Sarah Williamson", "a@hotmail.com", "23452642"),
				new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342"),
				new Student("Jacob Smith", "jacobkins@yandex.com", "53334"),
				new Student("Walrus Henry", "kittens@hotmail.ca", "64435"),
				new Student("Willow Tree", "willowapple@yahoo.ca", "3453"),
				new Student("Andrew Pilsbury", "cowtown@hotmail.ca", "34534532")
		};
		
		AdmittedStudents admitStudent = new AdmittedStudents(6);
		for (Student student : students) {
			admitStudent.admit(student);
		}
		
		Student find = admitStudent.searchByName("Jacob Smith");
		Assert.assertTrue(students[2].getName().equals(find.getName()));
		
		Student absent = admitStudent.searchByName("Suson Boyle");
		Assert.assertTrue("Not Found".equals(absent.getName()));
	}
	
	@Test
	public void testSearchById() {
		
		Student students[] = {
				new Student("Sarah Williamson", "a@hotmail.com", "23452642"),
				new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342"),
				new Student("Jacob Smith", "jacobkins@yandex.com", "53334"),
				new Student("Walrus Henry", "kittens@hotmail.ca", "64435"),
				new Student("Willow Tree", "willowapple@yahoo.ca", "3453"),
				new Student("Andrew Pilsbury", "cowtown@hotmail.ca", "34534532")
		};
		
		AdmittedStudents admitStudent = new AdmittedStudents(6);
		for (Student student : students) {
			admitStudent.admit(student);
		}
		
		Student find = admitStudent.searchById("53334");
		Assert.assertTrue(students[2].getStudentId().equals(find.getStudentId()));
		
		Student absent = admitStudent.searchById("1234");
		Assert.assertTrue("Not Found".contentEquals(absent.getStudentId()));
	}
	
	// Course & OfferedCourses Tests
	
	@Test
	public void testOfferCourses() {
		
		Course courses[] = {
				new Course("Math", "123", "Logic & Foundations", 3.0),
				new Course("Math", "223", "Logic & Foundations 2", 3.0),
				new Course("CSCI", "331", "Object Oriented Programming", 3.0),
				new Course("CSCI", "370", "Database", 3.0),
				new Course("CSCI 2", "375", "Systems Analysis", 3.0),
				new Course("CSCI", "311", "Web Programming", 3.0),
				new Course("CSCI", "251", "Network & Operating Systems", 3.0)
		};
		
		OfferedCourses offerCourses = new OfferedCourses(7);
		Assert.assertTrue(offerCourses.getCapacity() == 7);
		Assert.assertTrue(offerCourses.getNumberOfCourses() == 0);
		
		int countCourse = 0;
		for (Course course : courses) {
			offerCourses.offer(course);
			countCourse++;
			Assert.assertTrue(offerCourses.getNumberOfCourses() == countCourse);
		}	
	}
		
	@Test 
	public void testSearchCourseName() {
		
		Course courses[] = {
				new Course("Math", "123", "Logic & Foundations", 3.0),
				new Course("Math", "223", "Logic & Foundations 2", 3.0),
				new Course("CSCI", "331", "Object Oriented Programming", 3.0),
				new Course("CSCI", "370", "Database", 3.0),
				new Course("CSCI 2", "375", "Systems Analysis", 3.0),
				new Course("CSCI", "311", "Web Programming", 3.0),
				new Course("CSCI", "251", "Network & Operating Systems", 3.0)
		};

		OfferedCourses offerCourses = new OfferedCourses(7);
		for (Course course : courses) {
			offerCourses.offer(course);
		}
		
		Course find = offerCourses.searchByName("Math");
		Assert.assertTrue(courses[1].getName().equals(find.getName()));
		
		Course absent = offerCourses.searchByName("English");
		Assert.assertTrue("Not Found".equals(absent.getName()));
	}
	
	@Test
	public void testSearchCourseId() {
		Course courses[] = {
				new Course("Math", "123", "Logic & Foundations", 3.0),
				new Course("Math", "223", "Logic & Foundations 2", 3.0),
				new Course("CSCI", "331", "Object Oriented Programming", 3.0),
				new Course("CSCI", "370", "Database", 3.0),
				new Course("CSCI 2", "375", "Systems Analysis", 3.0),
				new Course("CSCI", "311", "Web Programming", 3.0),
				new Course("CSCI", "251", "Network & Operating Systems", 3.0)
		};

		OfferedCourses offerCourses = new OfferedCourses(7);
		for (Course course : courses) {
			offerCourses.offer(course);
		}
		
		Course find = offerCourses.searchByCourseNum("223");
		Assert.assertTrue(courses[1].getCourseNumber().equals(find.getCourseNumber()));
		
		Course absent = offerCourses.searchByCourseNum("32422");
		Assert.assertTrue("Not Found".equals(absent.getCourseNumber()));
	}
	
	// Instructor & Instructors Tests
	@Test
	public void testHireInstructors() {
		Instructor instructors[] = {
				new Instructor("Henry Smith", "1231445", "hs@yahoo.ca"),
				new Instructor("Joanne Smith", "4523453", "js@yahoo.ca"),
				new Instructor("Harry Potter", "1111992", "hp@yandex.ca"),
				new Instructor("Tim Allen", "23414445", "TimmyAllen@yahoo.ca"),
				new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca"),
				new Instructor("Ivery Wilk", "22331775", "IveryW@hotmail.ca")
		};
		
		Instructors instructorHire = new Instructors(6);
		Assert.assertTrue(instructorHire.getCapacity() == 6);
		Assert.assertTrue(instructorHire.getNumOfInstructors() == 0);
		
		int countInstructor = 0;
		for (Instructor instructor : instructors) {
			instructorHire.hire(instructor);
			countInstructor++;
			System.out.println(instructorHire.getNumOfInstructors());
			Assert.assertTrue(instructorHire.getNumOfInstructors() == countInstructor);
		}
	}
	
	@Test
	public void testSearchInstructor() {
		Instructor instructors[] = {
				new Instructor("Henry Smith", "1231445", "hs@yahoo.ca"),
				new Instructor("Joanne Smith", "4523453", "js@yahoo.ca"),
				new Instructor("Harry Potter", "1111992", "hp@yandex.ca"),
				new Instructor("Tim Allen", "23414445", "TimmyAllen@yahoo.ca"),
				new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca"),
				new Instructor("Ivery Wilk", "22331775", "IveryW@hotmail.ca")
		};


		Instructors instructorSearch = new Instructors(6);
		for (Instructor instructor : instructors) {
			instructorSearch.hire(instructor);
		}
		
		// Search by name
		Instructor find = instructorSearch.searchByName("Tim Allen");
		Assert.assertTrue(instructors[3].getName().equals(find.getName()));
		
		// Search non existent name
		Instructor absent = instructorSearch.searchByName("Sammy");
		Assert.assertTrue("Not Found".equals(absent.getName()));
		
		// Search by ID
		Instructor findID = instructorSearch.searchById("1231445");
		Assert.assertTrue(instructors[0].getInsID().equals(findID.getInsID()));
		
		// Search non existent ID
		Instructor absentID = instructorSearch.searchById("2342342356");
		Assert.assertTrue("Not Found".equals(absentID.getInsID()));
	}
	
	// Schedule & Schedules
	@Test
	public void testSchedulesAdd() {
		Schedule schedules[] = {
				new Schedule("Monday", "Building 200, Room 120", 12, 30, 2),
				new Schedule("Monday", "Building 210, Room 100", 1, 30, 2),
				new Schedule("Wednesday", "Building 220, Room 103", 12, 30, 2),
				new Schedule("Friday", "Building 220, Room 103", 12, 30, 2),
				new Schedule("Saturday", "Library, VIU", 9, 00, 1)
		};
		
		Schedules schedulesAdd = new Schedules(5);
		Assert.assertTrue(schedulesAdd.getNumOfSchedules() == 0);
		
		int countSchedules = 0;
		for (Schedule schedule : schedules) {
			schedulesAdd.add(schedule);
			countSchedules++;
			Assert.assertTrue(schedulesAdd.getNumOfSchedules() == countSchedules);
		}	
	}
	
	@Test
	public void testScheduleRemove() {
		Schedule schedules[] = {
				new Schedule("Monday", "Building 200, Room 120", 12, 30, 2),
				new Schedule("Monday", "Building 210, Room 100", 1, 30, 2),
				new Schedule("Wednesday", "Building 220, Room 103", 12, 30, 2),
				new Schedule("Friday", "Building 220, Room 103", 12, 30, 2),
				new Schedule("Saturday", "Library, VIU", 9, 00, 1)
		};
		
		Schedules schedulesAdd = new Schedules(5);
		for (Schedule schedule : schedules) {
			schedulesAdd.add(schedule);
			schedulesAdd.remove(schedule);
		}
		Assert.assertTrue(schedulesAdd.getNumOfSchedules() == 0);
	}
	
	// Seminar & Seminars Tests
	@Test
	public void testSeminarAdd() {
		
		Course j = new Course("CSCI", "370", "Database", 3.0);
		Course k = new Course("CSCI 2", "375", "Systems Analysis", 3.0);
		Instructor n = new Instructor("Henry Smith", "1231445", "hs@yahoo.ca");
		Instructor r = new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca");
		
		Seminar seminars[] = {
			new Seminar("123", j, 30, n),
			new Seminar("3453", k, 3, r)
		};
		
		Seminars seminarAdd = new Seminars(2);
		
		int countSeminar = 0;
		for (Seminar seminar : seminars) {
			seminarAdd.add(seminar);
			countSeminar++;
			Assert.assertTrue(seminarAdd.getNumOfSeminars() == countSeminar);
		}	
	}
	
	@Test 
	public void testSearchSeminar() {
		
		Course j = new Course("CSCI", "370", "Database", 3.0);
		Course k = new Course("CSCI 2", "375", "Systems Analysis", 3.0);
		Instructor n = new Instructor("Henry Smith", "1231445", "hs@yahoo.ca");
		Instructor r = new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca");
		
		Seminar seminars[] = {
				new Seminar("123", j, 30, n),
				new Seminar("3453", k, 3, r)
			};
			
		Seminars seminarAdd = new Seminars(2);

		for (Seminar seminar : seminars) {
			seminarAdd.add(seminar);
		}
		
		// Search by ID
		Seminar find = seminarAdd.searchById("123");
		Assert.assertTrue(seminars[0].getSeminarId().equals(find.getSeminarId()));
		
		// Search non existent ID
		Seminar absent = seminarAdd.searchById("2342");
		Assert.assertTrue("Not Found".equals(absent.getSeminarId()));
	}
	
	// Seminar & Seminars Tests
	@Test
	public void testEnrollment() {
		
		Enrollment enrollments[] = {
				new Enrollment(new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342"), new Seminar("123", new Course("CSCI", "370", "Database", 3.0), 30, new Instructor("Henry Smith", "1231445", "hs@yahoo.ca"))),
				new Enrollment(new Student("Jacob Smith", "jacobkins@yandex.com", "53334"), new Seminar("3453", new Course("CSCI 2", "375", "Systems Analysis", 3.0), 3, new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca")))
	};
	
		Enrollments enrollmentAdd = new Enrollments(2);
		Assert.assertTrue(enrollmentAdd.getNumOfEnrollments() == 0);
		
		int countEnrollments = 0;
		for (Enrollment enrollment : enrollments) {
			enrollmentAdd.enroll(enrollment);
			countEnrollments++;
			Assert.assertTrue(enrollmentAdd.getNumOfEnrollments() == countEnrollments);
		}	
	}
	
	@Test
	public void testCancelEnrollment() {
		
		Enrollment enrollments[] = {
				new Enrollment(new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342"), new Seminar("123", new Course("CSCI", "370", "Database", 3.0), 30, new Instructor("Henry Smith", "1231445", "hs@yahoo.ca"))),
				new Enrollment(new Student("Jacob Smith", "jacobkins@yandex.com", "53334"), new Seminar("3453", new Course("CSCI 2", "375", "Systems Analysis", 3.0), 3, new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca")))
		};
		Enrollments enrollmentAdd = new Enrollments(2);
		
	
		for (Enrollment enrollment : enrollments) {
			enrollmentAdd.enroll(enrollment);
			enrollmentAdd.cancel(enrollment);
			Assert.assertTrue(enrollmentAdd.getNumOfEnrollments() == 0);
		}		
	}
	
}
