package hospitalManagement;

import java.time.LocalDate;

public class AppontmentRecord {
	static long id=0;
 String patientId;
 String   doctorId;
 LocalDate date;  
  String   appointmentId;
public AppontmentRecord(String patientId, String doctorId) {
	super();
	this.patientId = patientId;
	this.doctorId = doctorId;
	this.appointmentId="ART"+ ++id;
	this.date=date.now();
}
public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public LocalDate getDate() {
	return date;
}
public String getAppointmentId() {
	return appointmentId;
}
  
  
  
  
}
