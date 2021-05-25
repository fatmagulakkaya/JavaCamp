package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println("Eklendi... " + user.id);
		System.out.println("Eklendi... " + user.firstName);
		System.out.println("Eklendi... " + user.lastName);
		System.out.println("Eklendi... " + user.email);
	}
	public void add(User[] users) {
	  	  for(User user : users) {
	  		 add(user);
	  	  }
		}
	public void delete(User user) {
		System.out.println("Silindi! " + user.id);
		System.out.println("Silindi! " + user.firstName);
		System.out.println("Silindi! " + user.lastName);
		System.out.println("Silindi! " + user.email);
	}
	public void delete(User[] users) {
	  	  for(User user : users) {
	  		 delete(user);
	  	  }
		}

}
