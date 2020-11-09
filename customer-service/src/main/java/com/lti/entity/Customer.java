package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@SequenceGenerator(name = "customerSeq", sequenceName = "customer_seq", initialValue = 101, allocationSize = 1)
public class Customer {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSeq")
	private int Id;
	
	@Column(length = 30)
	private String name;
	@Column(length = 20)
	private String age;
	@Column(length = 15)
	private String birthDate;
	@Column(length = 35)
	private String address;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 15)
	private String mobileNo;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
