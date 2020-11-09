package com.lti.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lti.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("FROM Customer where name=:enter")
	List<Customer> findByName(@Param("enter") String enter);
	
	@Query("FROM Customer where id=:any")
	Customer findById(@Param("any") int any);
}
