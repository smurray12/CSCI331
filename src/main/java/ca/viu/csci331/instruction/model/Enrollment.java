package ca.viu.csci331.instruction.model;

public class Enrollment {
	
		private Student student;
		private Seminar seminar;
		private double grade;
		
		public Enrollment(Student student, Seminar seminar) {
			
			this.student = student;
			this.seminar = seminar;
			grade = 0;
		}
		
		public void show() {
			System.out.println("----------------------------- ");
			System.out.println("Enrollment Information: \n");
			System.out.println("\t Student: " + student.getName());
			System.out.println("\t Seminar: " + seminar.seminarId);
			System.out.println("\t Grade: " + this.grade);
		}
		
		@Override // to show objects
		public String toString() {
			return ("\t Student: " + student.getName() +
					"\t Seminar: " + seminar.seminarId +
					"\t Grade: " + this.grade);
		}
		
		// Get & Set methods
		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Seminar getSeminar() {
			return seminar;
		}

		public void setSeminar(Seminar seminar) {
			this.seminar = seminar;
		}

		public double getGrade() {
			return grade;
		}

		public void setGrade(double grade) {
			this.grade = grade;
		}
		
		
		
		
}
