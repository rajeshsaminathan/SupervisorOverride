package com.ignite.receivingservices.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ReceivingLog{
	
	@Id
	@Column(name="item_nbr")
	private int itemNbr;
	
	@Column(name="item_desc")
	private String itemDesc;
	
	@Column(name="item_qty")
	private int itemQty;
	
	@Column(name="upc")
	private String upcNbr;

		
	public ReceivingLog() {
		super();
	}

	public ReceivingLog(int itemNbr, String itemDesc, int itemQty, String upcNbr) {
		super();
		this.itemNbr = itemNbr;
		this.itemDesc = itemDesc;
		this.itemQty = itemQty;
		this.upcNbr = upcNbr;
	}

	public int getItemNbr() {
		return itemNbr;
	}

	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public String getUpcNbr() {
		return upcNbr;
	}

	public void setUpcNbr(String upcNbr) {
		this.upcNbr = upcNbr;
	}

	

		
}
