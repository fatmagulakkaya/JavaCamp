package homework3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName= "Engin";
		instructor.lastName="Demiroğ";
		instructor.email="engindemirog@gmail.com";
		instructor.instructorRate="70";
		
		Student student = new Student();
		student.id=2;
		student.firstName="Fatma Gül";
		student.lastName="AKKAYA";
		student.email="ogreniyorum1@gmail.com";
		student.school="B17 Eylül Üniversitesi";
		student.studentNumber="12161314";
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student};
		studentManager.add(students);
		studentManager.delete(students);
		
		InstructorManager instructorManager = new InstructorManager();
	
		Instructor[] instructors= {instructor};
		instructorManager.add(instructors);
		instructorManager.delete(instructor);
		
		UserManager userManager=new UserManager();
		User[] users = {student,instructor};
		userManager.add(users);
		userManager.delete(users);	

	}

}
