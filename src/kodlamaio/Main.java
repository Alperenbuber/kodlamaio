package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstname("Alperen");
		student.setLastname("B�ber");
		student.setEmail("xyz@hotmail.com");
		student.setPassword("12345");
		student.setCompleteRate("21");
		student.setBitirVeDevamEt("�devi G�nderdiniz.");
		
		
		
		
		Instructor instructor=new Instructor();
		instructor.setId(2);
		instructor.setFirstname("Engin");
		instructor.setLastname("Demiro�");
		instructor.setEmail("engindemirog@hotmail.com");
		instructor.setPassword("987654321");
		instructor.setOdevYukle("�deviniz ba�ar�yla y�klendi.");
		instructor.setLinkYukle("Dersin linki ba�ar�yla y�klendi.");
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addHomework(instructor);
		instructorManager.uptadedinformation(instructor);
		instructorManager.addVideo(instructor);
		
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.submitHomework(student);
		
		UserManager userManager=new UserManager();
		userManager.becomeAMember(student);
		userManager.login(student);
		
		
		

	}

}
