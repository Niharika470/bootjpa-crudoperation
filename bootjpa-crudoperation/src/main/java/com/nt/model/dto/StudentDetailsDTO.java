package com.nt.model.dto;

public class StudentDetailsDTO {

	

	private int rollNum;
	
	private String studentName;
	
	private String DOB;
	
	public StudentDetailsDTO() {
		super();
	}


	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	
}
