package javaCamp;

public class StudentManager {
	public void addCourse (Course course) {
		System.out.println(course.courseName + "Kursa Katıldınız.");
		
	}
	
	public void studentManager(Course course) {
		System.out.println(course.courseName + "Kurstaki Ilerlemeniz " + ": (%)"+course.progressRate);
	}
	
	
	

}
