package kodlamaio;

public class StudentManager extends UserManager {
	void submitHomework(Student student) {
		System.out.println(student.firstname +  " �devini ba�ar�yla g�nderdin.Tamamlanma : %" + student.getCompleteRate());
		
	}
	void register() {
		System.out.println("Ba�ar�yla derse kay�t oldunuz.");
	}

}
