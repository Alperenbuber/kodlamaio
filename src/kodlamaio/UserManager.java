package kodlamaio;

public class UserManager {
	void login(User user) {
		System.out.println(user.getFirstname() + " Ba�ar�yla giri� yapt�n�z" );
	}
	
	void checkOut(User user) {
		System.out.println(user.getFirstname() + " Ba�ar�yla ��k�� yapt�n�z." );
	}

	void becomeAMember(User user) {
		System.out.println(user.getFirstname() + ", Ba�ar�yla �ye oldun. ");
	}
}
