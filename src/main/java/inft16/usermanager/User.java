package inft16.usermanager;

public class User {

	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		
		if (name == null) {
			this.name = "";
		} else {
			this.name = name;	
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
