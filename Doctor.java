package hospitalManagement;

public class Doctor {
	static long id=2000;
 String   doctorId;
  String name;
 String  specialization;
String   contactNumber;
  boolean isAvilable;
public Doctor(String name, String specialization, String contactNumber) {
	super();
	this.doctorId="D"+ ++id;
	this.name = name;
	this.specialization = specialization;
	this.contactNumber = contactNumber;
	this.isAvilable=true;
	
	
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public boolean isAvilable() {
	return isAvilable;
}
public void setAvilable(boolean isAvilable) {
	this.isAvilable = isAvilable;
}
public String getDoctorId() {
	return doctorId;
}
public String getName() {
	return name;
}
  
  
}
