package com.nt.model.dto;

import java.util.List;

public class ResponseDTO {
	private int noOfStudents;
	private List<StudentDetailsDTO> listStudents;
	
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public List<StudentDetailsDTO> getListStudents() {
		return listStudents;
	}
	public void setListStudents(List<StudentDetailsDTO> listStudents) {
		this.listStudents = listStudents;
	}

	
}
