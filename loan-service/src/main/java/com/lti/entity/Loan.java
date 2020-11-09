package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
@SequenceGenerator(name = "loanSeq", sequenceName = "loans_seq", initialValue = 101, allocationSize = 1)
public class Loan {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loanSeq")
	private int loanId;

	private double loanAmount;
	private double interest;
	private int tenure;
	private int customerId;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", interest=" + interest + ", tenure=" + tenure
				+ ", customerId=" + customerId + "]";
	}
	
	
}
