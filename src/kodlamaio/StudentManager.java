package kodlamaio;

public class StudentManager extends UserManager {
	void submitHomework(Student student) {
		System.out.println(student.firstname +  " ödevini baþarýyla gönderdin.Tamamlanma : %" + student.getCompleteRate());
		
	}
	void register() {
		System.out.println("Baþarýyla derse kayýt oldunuz.");
	}

}
