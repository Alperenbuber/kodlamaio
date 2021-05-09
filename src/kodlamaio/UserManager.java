package kodlamaio;

public class UserManager {
	void login(User user) {
		System.out.println(user.getFirstname() + " Baþarýyla giriþ yaptýnýz" );
	}
	
	void checkOut(User user) {
		System.out.println(user.getFirstname() + " Baþarýyla çýkýþ yaptýnýz." );
	}

	void becomeAMember(User user) {
		System.out.println(user.getFirstname() + ", Baþarýyla üye oldun. ");
	}
}
