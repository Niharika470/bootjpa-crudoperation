package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.bo.BranchBO;
import com.nt.bo.CollegeBO;
import com.nt.bo.StudentDetailsBO;
import com.nt.model.dto.CollegeDTO;
import com.nt.model.dto.RequestDTO;
import com.nt.model.dto.ResponseDTO;
import com.nt.model.dto.StudentDetailsDTO;
import com.nt.repo.BranchRepo;
import com.nt.repo.CollegeRepo;
import com.nt.repo.StudentDetailsRepo;
import com.nt.service.BranchService;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@Autowired
	private BranchRepo branchRepo;
	
	@Autowired
	private CollegeRepo collegeRepo;
	
	@Autowired
	private StudentDetailsRepo studentDetailsRepo;

	/*
	
	 * @GetMapping(value="/branch/{id}") public Branch
	 * getBranchDetailsById(@PathVariable(value="id")int id) {
	 * System.out.println("BranchController.getBranchDetails()"+id); return
	 * branchService.getbranchDetails(id); }
	 
	
	/*
	 * @GetMapping(value="/studentDetails") public @ResponseBody StudentDetailsDTO
	 * getStudentDetailsById() { BranchDTO branchDto=new BranchDTO(11,"chem");
	 * System.out.println(branchDto.toString()); CollegeDTO collegeDto=new
	 * CollegeDTO("IGIT", branchDto); System.out.println(collegeDto.toString());
	 * StudentDetailsDTO studDto = new StudentDetailsDTO(101, "Ravi", collegeDto);
	 * System.out.println(studDto.toString());
	 * System.out.println("BranchController.getStudentDetailsById()");
	 * 
	 * return studDto; }
	 */
	
	/*
	 * @GetMapping(value="/studentDetails/{collegeName}/{branchName}") public
	 * static @ResponseBody ResponseDTO
	 * studentAllDetails(@PathVariable(value="collegeName")String collegeName,
	 * 
	 * @PathVariable(value = "branchName") String branchName) { BranchDTO branchDto
	 * = new BranchDTO(11, "chem"); BranchDTO branchDto1 = new BranchDTO(12,
	 * "mech");
	 * 
	 * List<BranchDTO> branchList = new ArrayList<>(); branchList.add(branchDto);
	 * branchList.add(branchDto1);
	 * 
	 * CollegeDTO collegeDto = new CollegeDTO("IGIT", branchList);
	 * 
	 * CollegeDTO collegeDto1 = new CollegeDTO("CET", branchList); CollegeDTO
	 * collegeDto2 = new CollegeDTO("KIIT", branchList);
	 * 
	 * // System.out.println("1-->"+branchDto.getBranchName()); //
	 * System.out.println("2-->"+branchList.get(0).getBranchName()); //
	 * System.out.println("3-->"+collegeDto.getBranch().get(0).getBranchName());
	 * 
	 * StudentDetailsDTO studDto = new StudentDetailsDTO(101, "Ravi", "01/01/1997",
	 * collegeDto.getCollegeName(),
	 * collegeDto.getBranchList().get(0).getBranchName()); StudentDetailsDTO
	 * studDto1 = new StudentDetailsDTO(102, "Manav", "14/07/1997",
	 * collegeDto1.getCollegeName(),
	 * collegeDto1.getBranchList().get(1).getBranchName()); StudentDetailsDTO
	 * studDto2 = new StudentDetailsDTO(103, "Roshni", "19/09/1994",
	 * collegeDto2.getCollegeName(),
	 * collegeDto2.getBranchList().get(0).getBranchName()); StudentDetailsDTO
	 * studDto3 = new StudentDetailsDTO(104, "Ramit", "15/04/1995",
	 * collegeDto1.getCollegeName(),
	 * collegeDto1.getBranchList().get(1).getBranchName()); StudentDetailsDTO
	 * studDto4 = new StudentDetailsDTO(105, "Arnab", "25/05/1994",
	 * collegeDto2.getCollegeName(),
	 * collegeDto2.getBranchList().get(0).getBranchName()); StudentDetailsDTO
	 * studDto5 = new StudentDetailsDTO(106, "Mohit", "06/11/1996",
	 * collegeDto.getCollegeName(),
	 * collegeDto.getBranchList().get(1).getBranchName());
	 * 
	 * List<StudentDetailsDTO> studentList = new ArrayList<>();
	 * studentList.add(studDto); studentList.add(studDto1);
	 * studentList.add(studDto2); studentList.add(studDto3);
	 * studentList.add(studDto4); studentList.add(studDto5);
	 * 
	 * List<StudentDetailsDTO> filteredStudentList = new ArrayList<>(); for
	 * (StudentDetailsDTO studentDetailsDTO : studentList) {
	 * if(collegeName.equalsIgnoreCase(studentDetailsDTO.getCollegeName()) &&
	 * branchName.equalsIgnoreCase(studentDetailsDTO.getBranchName())) {
	 * filteredStudentList.add(studentDetailsDTO); } }
	 * 
	 * ResponseDTO dto = new ResponseDTO();
	 * dto.setListStudents(filteredStudentList);
	 * dto.setNoOfStudents(filteredStudentList.size());
	 * 
	 * return dto;
	 * 
	 * }
	 */
	
	@GetMapping(value="/studentDetails")
	public @ResponseBody ResponseDTO studentDetails(@RequestBody RequestDTO request) {

		//TODO Get all the data from DB
		
		List<BranchBO> branchList=branchRepo.findAll();
		List<CollegeBO> collegeList=collegeRepo.findAll();
		List<StudentDetailsBO> studentList=studentDetailsRepo.findAll();
		
		//TODO Map the fetched value and form an appropriate dto
		
		List<StudentDetailsDTO> filteredStudList=new ArrayList<>();
		
		/*
		 * for(StudentDetailsBO studentBo:studentList) {
		 * if(request.getCollegeName().equalsIgnoreCase(studentBo.getCollegeName())&&(
		 * request.getBranchName().equalsIgnoreCase(studentBo.getBranchName()))) {
		 * StudentDetailsDTO studDto=new StudentDetailsDTO();
		 * studDto.setRollNum(studentBo.getRollNum());
		 * studDto.setStudentName(studentBo.getStudentName());
		 * studDto.setDOB(studentBo.getDOB());
		 * 
		 * filteredStudList.add(studDto); } }
		 */
		ResponseDTO responseDto=new ResponseDTO();
		responseDto.setListStudents(filteredStudList);
		 responseDto.setNoOfStudents(filteredStudList.size());
		
		return responseDto;
	}
		
		

	//@GetMapping(value="/branch")
	//public List<Branch> findAll() {
	//	System.out.println("BranchController.getBranchDetails()");
	//	return branchRepo.findAll();
	//}
	
	  @PostMapping(value="/br") 
	  public String saveBranchDetails(@RequestBody List<Branch> branches) 
		{
			branchService.saveBranchDetails(branches);
			return "AllBranchDetail saved";
		}
	  
	  @PutMapping(value="/br") public Branch updateBranchDetails(@RequestBody
	  Branch branchObj) { return branchRepo.save(branchObj);
	  
	  }
	  
	  @DeleteMapping(value="/br/{id}") public String
	  deleteBranchDetailsById(@PathVariable(value="id") int id) { Optional<Branch>
	  branch=branchRepo.findById(id); if(branch.isPresent()) {
	  branchRepo.delete(branch.get()); return "Branch is deleted with id"+id; }else
	  throw new RuntimeException("Branh not found for id"+id);
	  
	  }
	 
}