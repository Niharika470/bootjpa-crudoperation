package com.nt.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_table")
public class BranchBO {
	
	@Id
	@Column(name="branchid")
	private long branchId;
	
	@Column(name="branchname")
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
	public BranchBO() {
		super();
	}
	public BranchBO(long branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "BranchDTO [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	
	
}


