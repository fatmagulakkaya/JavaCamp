package homework3;

public class Instructor extends User{
	private String instructorRate;
	
	public Instructor(int id, String firstName, String lastName, String email, String instructorRate){
        super(id , firstName, lastName, email);
        this.instructorRate = instructorRate;
     
	}

	public String getInstructorRate() {
		return instructorRate;
	}

	public void setInstructorRate(String instructorRate) {
		this.instructorRate = instructorRate;
	}

}
