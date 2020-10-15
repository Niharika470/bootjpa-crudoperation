package com.nt.model.dto;

import java.util.List;


public class CollegeDTO {
	private String collegeName;
	
	private List<BranchDTO> branchList;

	public CollegeDTO() {
		super();
	}

	public CollegeDTO(String collegeName, List<BranchDTO> branch) {
		super();
		this.collegeName = collegeName;
		this.branchList =  branch;
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<BranchDTO> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<BranchDTO> branchList) {
		this.branchList = branchList;
	}

	
	

}
