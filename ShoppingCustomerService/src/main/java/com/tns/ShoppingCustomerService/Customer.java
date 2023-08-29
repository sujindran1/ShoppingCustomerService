package com.tns.ShoppingCustomerService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="cmoviebooking")
	private int cmoviebooking;
	
	@Column(name="shopping")
	private String shopping;
	
	@Column(name="foodcourt")
	private String foodcourt;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCmoviebooking() {
		return cmoviebooking;
	}
	public void setCmoviebooking(int cmoviebooking) {
		this.cmoviebooking = cmoviebooking;
	}
	public String getShopping() {
		return shopping;
	}
	public void setShopping(String shopping) {
		this.shopping = shopping;
	}
	public String getFoodcourt() {
		return foodcourt;
	}
	public void setFoodcourt(String foodcourt) {
		this.foodcourt = foodcourt;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, int cmoviebooking, String shopping, String foodcourt) {
		super();
		this.cid = cid;
		this.cmoviebooking = cmoviebooking;
		this.shopping = shopping;
		this.foodcourt = foodcourt;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cmoviebooking=" + cmoviebooking + ", shopping=" + shopping + ", foodcourt="
				+ foodcourt + "]";
	}
	

}
