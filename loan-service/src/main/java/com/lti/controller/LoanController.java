package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lti.entity.Loan;
import com.lti.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
    RestTemplate template;
	
	@Autowired
	private LoanService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addCustomer(@RequestBody Loan loan) {
		int id = service.saveLoan(loan);
		return "Loan details for id: " + id;
	}
	
	@GetMapping(value = "/byCustId/{id}",produces = "application/json")
	public Loan byId(@PathVariable int id) {
		return service.searchByCustId(id);
	}
	
	@GetMapping("/byCustomerId/{id}")
	public String byCustId(@PathVariable int id) {
		String url = "http://CUSTOMER-SERVICE/customer/byId/" + id;
		return template.getForObject(url, String.class) + service.searchByCustId(id);
	}
}
