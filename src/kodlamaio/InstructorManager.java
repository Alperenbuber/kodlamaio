package kodlamaio;

public class InstructorManager extends UserManager{
	
	void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstname() + ", �devi ba�ar�yla ekledin." );
	}
	
    void uptadedinformation(Instructor instructor) {
    	System.out.println( "Say�n "+instructor.firstname + " Ki�isel bilgileriniz y�klendi" );
    }
    
    void addVideo(Instructor instructor) {
    	System.out.println("Videolar y�klenmi�tir.");
    }
}
