package inft16.usermanager;

import java.util.ArrayList;
import java.util.Random;

public class UserManager {
	
	private ArrayList<User> users = new ArrayList<User>(); 
	
	public User createUser(String name) {
		Random generator = new Random();
		int id = generator.nextInt(50000); //generate random integer of [0; 49999]
		User user = new User(id, name);
		users.add(user);
		
		return user;
	}
	
	public User findById(int id) {
		for(User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
	
}
