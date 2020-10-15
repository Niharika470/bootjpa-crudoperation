package com.nt.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.bo.BranchBO;

@Repository
public interface BranchRepo extends  JpaRepository<BranchBO, Integer>{
                               

}

