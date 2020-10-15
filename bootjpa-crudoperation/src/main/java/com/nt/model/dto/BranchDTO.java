package com.nt.model.dto;




public class BranchDTO {
	private long branchId;
	private String branchName;
	
	
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public BranchDTO() {
		super();
	}
	public BranchDTO(long branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "BranchDTO [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	
	
}


