package com.project.psmobile.Entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// CUS001 Table
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long syskey;
	private String customerID;
	private String customerName;
	private String items;
	private Long amount;
	private Long RecordStatus;
	private Date purchaseDate;
	private Time purchaseTime;
	
	public Customer() {
		super();
	}

	public Customer(Long syskey, String customerID, String customerName, String items, Long amount, Long recordStatus,
			Date purchaseDate, Time purchaseTime) {
		super();
		this.syskey = syskey;
		this.customerID = customerID;
		this.customerName = customerName;
		this.items = items;
		this.amount = amount;
		RecordStatus = recordStatus;
		this.purchaseDate = purchaseDate;
		this.purchaseTime = purchaseTime;
	}

	public Long getSyskey() {
		return syskey;
	}

	public void setSyskey(Long syskey) {
		this.syskey = syskey;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getRecordStatus() {
		return RecordStatus;
	}

	public void setRecordStatus(Long recordStatus) {
		RecordStatus = recordStatus;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Time getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(Time purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	
	

}
