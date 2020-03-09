package hellocontroller;

// function of this file is to convert the JSON data recieved into java readable form and then pass it to controller .

// this is model of mvc.
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"studentId","studentName","studentMobile","studentAddress","studentHobby"})   // it will give json data according to this order.

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentHobby;
	
	private Long studentMobile;
	private String studentAddress;
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
}
