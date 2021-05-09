package kodlamaio;

public class Student extends User {
	
	public String completeRate;
	public String oncekiDers;
	public String bitirVeDevamEt;
	
	
	public Student() {
		
	}
	
	
	
	public Student(String completeRate, String oncekiDers, String bitirVeDevamEt) {
		this();
		this.completeRate = completeRate;
		this.oncekiDers = oncekiDers;
		this.bitirVeDevamEt = bitirVeDevamEt;
	}
	public String getCompleteRate() {
		return completeRate;
	}
	public void setCompleteRate(String completeRate) {
		this.completeRate = completeRate;
	}
	public String getOncekiDers() {
		return oncekiDers;
	}
	public void setOncekiDers(String oncekiDers) {
		this.oncekiDers = oncekiDers;
	}
	public String getBitirVeDevamEt() {
		return bitirVeDevamEt;
	}
	public void setBitirVeDevamEt(String bitirVeDevamEt) {
		this.bitirVeDevamEt = bitirVeDevamEt;
	}

}
