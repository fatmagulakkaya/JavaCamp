package homework3;

public class Student extends User {
	 private String studentNumber;
	 private String coursesTaken;
	 
	 public Student(int id, String firstName, String lastName, String email, String studentNumber, String coursesTaken){
	        super(id , firstName, lastName, email);
	        this.studentNumber = studentNumber;
	        this.coursesTaken = coursesTaken;
	    }


		public String getStudentNumber() {
			return studentNumber;
		}

		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}


		public String getCoursesTaken() {
			return coursesTaken;
		}


		public void setCoursesTaken(String coursesTaken) {
			this.coursesTaken = coursesTaken;
		}
	

}
