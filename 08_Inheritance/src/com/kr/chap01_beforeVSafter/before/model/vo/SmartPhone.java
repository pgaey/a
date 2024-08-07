package com.kr.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	//필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	//생성자
	public SmartPhone() {}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
	
	// set
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	//get
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	//info
	public String information() {
		return "브랜드명 : " + brand + " / 상품코드 : " + pCode + " / 상품명 : " + pName +
				" / 상품가격 : " + price + " / 통신사 : " + mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
}
