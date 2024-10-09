package hospitalManagement;

public class Patient {
	static long id=1000;
	String name;
	int age;
	String gender;
	String contactNumber;
	String patientId;
	public Patient(String name, int age, String gender, String contactNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.patientId="P"+ ++id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getPatientId() {
		return patientId;
	}
	
	
	
	
	
}
