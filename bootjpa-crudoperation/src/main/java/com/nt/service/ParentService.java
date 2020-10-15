package com.nt.service;

import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;

import com.nt.bo.BranchBO;
import com.nt.repo.BranchRepo;

public class ParentService {
	@Autowired
	private BranchRepo branchRepo;

	public BranchBO getbranchDetails(int branchid) {
		System.out.println("branchid : "+branchid);
		BranchBO branch = branchRepo.findById(branchid).get();
		System.out.println("branch : "+branch.toString());
		return  branch;
}
}
