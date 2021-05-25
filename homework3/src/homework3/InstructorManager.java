package homework3;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Eklendi"  + instructor.instructorRate);
		
	}
	public void add(Instructor[] instructors) {
	  	  for(Instructor instructor : instructors) {
	  	   add(instructor);
	  
	}
	  }
	public void  delete(Instructor instructor) {
		System.out.println("Silindi!"  + instructor.instructorRate);
  }
	public void delete(Instructor[] instructors) {
	  	  for(Instructor instructor : instructors) {
	  	   delete(instructor);
	  
	}
	  }
	
	
}