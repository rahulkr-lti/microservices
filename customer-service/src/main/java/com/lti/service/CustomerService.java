package com.lti.service;

import java.util.List;

import com.lti.entity.Customer;

public interface CustomerService {

	String saveCustomer(Customer customer);
	
	List<Customer> searchByName(String name);
	
	Customer searchById(int id);
}
