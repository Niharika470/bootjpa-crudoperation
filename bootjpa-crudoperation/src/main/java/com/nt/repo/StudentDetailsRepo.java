package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentDetailsBO;
@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetailsBO, Integer>{

}
