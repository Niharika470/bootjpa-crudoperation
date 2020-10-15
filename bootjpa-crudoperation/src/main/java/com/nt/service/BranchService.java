package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.BranchBO;
import com.nt.repo.BranchRepo;

@Service
public class BranchService   extends ParentService{

	@Autowired
	private BranchRepo branchRepo;
	
	public void saveBranchDetails(List<BranchBO> branches) {
		branchRepo.saveAll(branches);
	}
	/*
	 * @Autowired private BranchRepo branchRepo;
	 * 
	 * public Branch getbranchDetails(int branchid) {
	 * System.out.println("branchid : "+branchid);
	 *  Branch branch =
	 * branchRepo.findById(branchid).get();
	 * System.out.println("branch : "+branch.toString()); return branch; }
	 */
}
