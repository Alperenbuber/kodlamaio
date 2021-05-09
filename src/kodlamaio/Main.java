package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstname("Alperen");
		student.setLastname("Büber");
		student.setEmail("xyz@hotmail.com");
		student.setPassword("12345");
		student.setCompleteRate("21");
		student.setBitirVeDevamEt("Ödevi Gönderdiniz.");
		
		
		
		
		Instructor instructor=new Instructor();
		instructor.setId(2);
		instructor.setFirstname("Engin");
		instructor.setLastname("Demiroð");
		instructor.setEmail("engindemirog@hotmail.com");
		instructor.setPassword("987654321");
		instructor.setOdevYukle("Ödeviniz baþarýyla yüklendi.");
		instructor.setLinkYukle("Dersin linki baþarýyla yüklendi.");
		
		
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
