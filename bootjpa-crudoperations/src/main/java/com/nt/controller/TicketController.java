package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dao.TicketDao;
import com.nt.model.Ticket;
import com.nt.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	@Autowired
	private TicketDao ticketDao;
	
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		ticketDao.saveAll(tickets);
		return "ticket booked:"+tickets.size();
	}

	@GetMapping("/getTickets")
	public List<Ticket> findAll(){
		return  ticketDao.findAll();
	}
	@GetMapping(value="/getTickets/{asd}")
	public Ticket getTicketDetailsById(@PathVariable(value="asd")int id) {
		System.out.println("TicketController.getTicketDetails()"+id);
		return ticketService.getTicketDetails(id);
	}
	
}
