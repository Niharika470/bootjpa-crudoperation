package com.nt.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college_table")
public class CollegeBO {
	
	@Id
	@Column(name="clgid")
	private int collegeId;
	
	@Column(name="clgname")
	private String collegeName;
	
	@Column(name="clgloc")
	private String collegeLocation;
	
	@Column(name="clgphn")
	private int collegePhone;
	
	

	public CollegeBO() {
		super();
	}



	public int getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public String getCollegeLocation() {
		return collegeLocation;
	}



	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}



	public int getCollegePhone() {
		return collegePhone;
	}



	public void setCollegePhone(int collegePhone) {
		this.collegePhone = collegePhone;
	}

}