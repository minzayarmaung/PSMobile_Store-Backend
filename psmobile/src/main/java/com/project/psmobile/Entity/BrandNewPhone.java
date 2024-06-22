package com.project.psmobile.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// PDB001 Table
@Entity
public class BrandNewPhone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long syskey;
	private String productID;
	private String productName;
	private Long brand;
	private Long price;
	private Long T1;
	private Long T2;
	private Long T3;
	private String T4;
	private String N1;
	private String N2;
	private String N3;
	
	public BrandNewPhone() {
		super();
	}

	public BrandNewPhone(Long syskey, String productID, String productName, Long brand, Long price, Long t1, Long t2,
			Long t3, String t4, String n1, String n2, String n3) {
		super();
		this.syskey = syskey;
		this.productID = productID;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		T1 = t1;
		T2 = t2;
		T3 = t3;
		T4 = t4;
		N1 = n1;
		N2 = n2;
		N3 = n3;
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

	public Long getBrand() {
		return brand;
	}

	public void setBrand(Long brand) {
		this.brand = brand;
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

	public String getT4() {
		return T4;
	}

	public void setT4(String t4) {
		T4 = t4;
	}

	public String getN1() {
		return N1;
	}

	public void setN1(String n1) {
		N1 = n1;
	}

	public String getN2() {
		return N2;
	}

	public void setN2(String n2) {
		N2 = n2;
	}

	public String getN3() {
		return N3;
	}

	public void setN3(String n3) {
		N3 = n3;
	}
	
	

}
