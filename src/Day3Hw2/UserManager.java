package Day3Hw2;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı " + user.fullName + " eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
