package homework3;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("Kaydedildi"+ student.school);
	}
	public void add(Student[] students) {
	  	  for(Student student : students) {
	  		  add(student);
	  	  }
	}

	public void delete(Instructor instructor) {
		System.out.println("Silindi!"  + instructor.instructorRate);
}
	public void delete(Student[] students) {
	  	  for(Student student : students) {
	  		  add(student);
	  	  }
	}
}
