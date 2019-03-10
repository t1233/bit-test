package inft16.usermanager;

public class Main {

	public static void main(String[] args) {
		UserManager manager = new UserManager();
		User user = manager.createUser("H. Simpson");
		System.out.println("Created User: " + user.getId() + "; " + user.getName());
	}
	
}
