package com.lti.service;

import com.lti.entity.Loan;

public interface LoanService {

	int saveLoan(Loan loan);
	
	Loan searchByCustId(int id);
}
