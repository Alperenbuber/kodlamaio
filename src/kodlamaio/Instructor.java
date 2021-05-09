package kodlamaio;

public class Instructor extends User {
	
	public String linkYukle;
	public String odevYukle;
	public String aciklamaYap;
	
	
    public Instructor() {
    	
    }
	
	
	public Instructor(String linkYukle, String odevYukle, String aciklamaYap) {
		this ();
		this.linkYukle = linkYukle;
		this.odevYukle = odevYukle;
		this.aciklamaYap = aciklamaYap;
		
	}
	public String getLinkYukle() {
		return linkYukle;
	}
	public void setLinkYukle(String linkYukle) {
		this.linkYukle = linkYukle;
	}
	public String getOdevYukle() {
		return odevYukle;
	}
	public void setOdevYukle(String odevYukle) {
		this.odevYukle = odevYukle;
	}
	public String getAciklamaYap() {
		return aciklamaYap;
	}
	public void setAciklamaYap(String aciklamaYap) {
		this.aciklamaYap = aciklamaYap;
	}

}
