package kodlamaio;

public class InstructorManager extends UserManager{
	
	void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstname() + ", ödevi baþarýyla ekledin." );
	}
	
    void uptadedinformation(Instructor instructor) {
    	System.out.println( "Sayýn "+instructor.firstname + " Kiþisel bilgileriniz yüklendi" );
    }
    
    void addVideo(Instructor instructor) {
    	System.out.println("Videolar yüklenmiþtir.");
    }
}
