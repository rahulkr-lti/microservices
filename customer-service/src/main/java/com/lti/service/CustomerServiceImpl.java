package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public String saveCustomer(Customer customer) {
		repo.save(customer);
		return customer.getName();
	}

	@Override
	public List<Customer> searchByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public Customer searchById(int id) {
		return repo.findById(id);
	}

}
