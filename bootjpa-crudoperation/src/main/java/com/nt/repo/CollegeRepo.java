package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.bo.CollegeBO;
@Repository

public interface CollegeRepo extends JpaRepository<CollegeBO, Integer> {

}
