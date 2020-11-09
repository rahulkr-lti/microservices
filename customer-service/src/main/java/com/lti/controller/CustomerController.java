package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addCustomer(@RequestBody Customer customer) {
		String name = service.saveCustomer(customer);
		return "Customer added with name: " + name;
	}
	
	@GetMapping(value = "/byname/{enter}",produces = "application/json")
	public List<Customer> byName(@PathVariable String enter) {
		return service.searchByName(enter);
	}
	
	@GetMapping(value = "/byId/{id}",produces = "application/json")
	public Customer byId(@PathVariable int id) {
		return service.searchById(id);
	}
}
