package javaCamp;

public class StudentManager {
	public void addCourse (Course course) {
		System.out.println(course.courseName + "Kursa Kat�ld�n�z.");
		
	}
	
	public void studentManager(Course course) {
		System.out.println(course.courseName + "Kurstaki Ilerlemeniz " + ": (%)"+course.progressRate);
	}
	
	
	

}
