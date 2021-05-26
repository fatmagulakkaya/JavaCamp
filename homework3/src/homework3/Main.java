package homework3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Fatma G�l","AKKAYA","fatmagulakkaya@hotmail.com","1214151617","JAVA, C#");
		
        Instructor instructor = new Instructor(2,"Engin","DEM�RO�","engindemirog@mail.com","70");
        

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);
        
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        
        User[] users = new User[]{student,instructor};

        UserManager userManager = new UserManager();
        userManager.user(users);

    }

	}


