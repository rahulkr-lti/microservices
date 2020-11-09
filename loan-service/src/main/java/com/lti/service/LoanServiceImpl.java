package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Loan;
import com.lti.repo.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private LoanRepository repo;

	@Override
	public int saveLoan(Loan loan) {
		repo.save(loan);
		return loan.getCustomerId();
	}

	@Override
	public Loan searchByCustId(int id) {
		return repo.findByCustId(id);
	}
}
