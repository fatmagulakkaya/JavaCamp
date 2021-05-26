package homework3;

public class UserManager {
	public void user(User[] users){
        for (User user : users){
            System.out.println(" User Name : " + user.getFirstName());
        }
    }

}
