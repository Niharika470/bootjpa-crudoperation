package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.TicketDao;
import com.nt.model.Ticket;




@Service
public class TicketService {
	@Autowired
	private TicketDao ticketDao;
	
	
	//public void saveTicketDetails(List<Ticket> tickets) {
	//	ticketDao.saveAll(tickets);
	//}
	
	public  Ticket getTicketDetails(int id) {
	  System.out.println("id : "+id);
	   Ticket ticket = ticketDao.findById(id).get(); //select * from ticket where id=101
	  System.out.println("ticket : "+ticket.toString());
	  
	  return ticket; 
	  }

}
