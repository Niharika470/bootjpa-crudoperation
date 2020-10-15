package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Ticket;
@Repository
public interface TicketDao extends JpaRepository<Ticket,Integer> {
	
}
