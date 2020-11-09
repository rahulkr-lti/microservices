package com.lti.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lti.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{
	
	@Query("FROM Loan where customerId=:any")
	Loan findByCustId(@Param("any") int any);
}
