package com.project.psmobile.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//)DB001 Table
// Order Table 
@Entity
public class OrderTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long syskey;
	private String productID;
	private String productName;
	private Long RecordStatus;
	private Long brand;
	private Long type;
	private Long price;
	private String employeeID;
	private String customerID;
	private Long T1;
	private Long T2;
	private Long T3;
	private Long T4;
	private Long T5;
	private String T6;
	private Long T7;
	
	public OrderTable() {
		super();
	}

	public OrderTable(Long syskey, String productID, String productName, Long recordStatus, Long brand, Long type,
			Long price, String employeeID, String customerID, Long t1, Long t2, Long t3, Long t4, Long t5, String t6,
			Long t7) {
		super();
		this.syskey = syskey;
		this.productID = productID;
		this.productName = productName;
		RecordStatus = recordStatus;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.employeeID = employeeID;
		this.customerID = customerID;
		T1 = t1;
		T2 = t2;
		T3 = t3;
		T4 = t4;
		T5 = t5;
		T6 = t6;
		T7 = t7;
	}



	public Long getSyskey() {
		return syskey;
	}

	public void setSyskey(Long syskey) {
		this.syskey = syskey;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getRecordStatus() {
		return RecordStatus;
	}

	public void setRecordStatus(Long recordStatus) {
		RecordStatus = recordStatus;
	}

	public Long getBrand() {
		return brand;
	}

	public void setBrand(Long brand) {
		this.brand = brand;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getT1() {
		return T1;
	}

	public void setT1(Long t1) {
		T1 = t1;
	}

	public Long getT2() {
		return T2;
	}

	public void setT2(Long t2) {
		T2 = t2;
	}

	public Long getT3() {
		return T3;
	}

	public void setT3(Long t3) {
		T3 = t3;
	}

	public Long getT4() {
		return T4;
	}

	public void setT4(Long t4) {
		T4 = t4;
	}

	public Long getT5() {
		return T5;
	}

	public void setT5(Long t5) {
		T5 = t5;
	}

	public String getT6() {
		return T6;
	}

	public void setT6(String t6) {
		T6 = t6;
	}

	public Long getT7() {
		return T7;
	}

	public void setT7(Long t7) {
		T7 = t7;
	}



	public String getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}



	public String getCustomerID() {
		return customerID;
	}



	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	

}
