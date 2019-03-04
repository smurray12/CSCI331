package ca.viu.csci331.instruction.model;

public class Main {

	public static void main(String[] args) {
		
	// Students & Admitted Students
		Student a = new Student("Sarah Williamson", "a@hotmail.com", "23452642");
		Student b = new Student("Sally O'neil-Henryson", "asfr@yahoo.com", "2342342");
		Student c = new Student("Jacob Smith", "jacobkins@yandex.com", "53334");
		Student d = new Student("Walrus Henry", "kittens@hotmail.ca", "64435");
		Student e = new Student("Willow Tree", "willowapple@yahoo.ca", "3453");
		Student f = new Student("Andrew Pilsbury", "cowtown@hotmail.ca", "34534532");
		AdmittedStudents start = new AdmittedStudents(5);
		start.admit(a);
		start.admit(b);
		start.admit(c);
		start.admit(d);
		start.admit(d);
		start.admit(e);
		start.admit(f);
		start.show();
		
		start.cancel(a);
		start.show();
		start.cancel(a);
		
		start.searchById("53334").show();
		start.searchById("1").show();
		start.searchByName("Walrus Henry").show();
	
		
	// Courses & Offered Courses
		Course g = new Course("Math", "123", "Logic & Foundations", 3.0);
		Course h = new Course("Math", "223", "Logic & Foundations 2", 3.0);
		Course i = new Course("CSCI", "331", "Object Oriented Programming", 3.0);
		Course j = new Course("CSCI", "370", "Database", 3.0);
		Course k = new Course("CSCI 2", "375", "Systems Analysis", 3.0);
		Course l = new Course("CSCI", "311", "Web Programming", 3.0);
		Course m = new Course("CSCI", "251", "Network & Operating Systems", 3.0);
		
		OfferedCourses begin = new OfferedCourses(6);
		begin.offer(g);
		begin.offer(h);
		begin.offer(h);
		begin.offer(i);
		begin.offer(j);
		begin.offer(k);
		begin.offer(l);
		begin.offer(m);
		begin.show();
		
		begin.cancel(h);
		begin.show();
		
		begin.searchByCourseNum("123").show();
		begin.searchByName("CSCI 2").show();
	
		
		
	// Instructor & Instructors in records
		Instructor n = new Instructor("Henry Smith", "1231445", "hs@yahoo.ca");
		Instructor o = new Instructor("Joanne Smith", "4523453", "js@yahoo.ca");
		Instructor p = new Instructor("Harry Potter", "1111992", "hp@yandex.ca");
		Instructor q = new Instructor("Tim Allen", "2341445", "TimmyAllen@yahoo.ca");
		Instructor r = new Instructor("Sam Willson", "2341445", "Sam23@yahoo.ca");
		Instructor s = new Instructor("Ivery Wilk", "22331775", "IveryW@hotmail.ca");
		
		Instructors instructor = new Instructors(5);
		instructor.hire(n);
		instructor.hire(o);
		instructor.hire(p);
		instructor.hire(p);
		instructor.hire(q);
		instructor.hire(r);
		instructor.hire(s);
		instructor.show();
		
		instructor.terminate(o);
		instructor.show();
		
		instructor.searchById("1231445").show();
		instructor.searchByName("Harry Potter").show();
		
	
	//Schedule & Schedules
		Schedule t = new Schedule("Monday", "Building 200, Room 120", 12, 30, 2);
		Schedule u = new Schedule("Monday", "Building 210, Room 100", 1, 30, 2);
		Schedule v = new Schedule("Wednesday", "Building 220, Room 103", 12, 30, 2);
		Schedule w = new Schedule("Wednesday", "Building 220, Room 103", 12, 30, 2);
		Schedule x = new Schedule("Saturday", "Library, VIU", 9, 00, 1);
		
		Schedules schedules = new Schedules(4);
		schedules.add(t);
		schedules.add(u);
		schedules.add(v);
		schedules.add(w);
		schedules.add(x);
		schedules.show();
		
		schedules.remove(w);
		schedules.show();
		
		schedules.remove(t);
		schedules.show();
		
		Seminar y = new Seminar("123", j, 30, n);
		Seminar z = new Seminar("3453", k, 3, r);
		y.addValidSchedule(u);
		z.addValidSchedule(u);
		
		Seminars seminars = new Seminars(2);
		seminars.add(z);
		seminars.add(z);
		seminars.show();
		
		Enrollment z1 = new Enrollment(b, z);
		Enrollments enrollments = new Enrollments(2);
		enrollments.enroll(z1);
		enrollments.enroll(z1);
		enrollments.show();
	}

}