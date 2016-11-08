package com.ignite.receivingservices.model;

import javax.persistence.Entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="receiving")
public class SuperOverride {

	@Id
	@Column(name="po_nbr")
	private int poNbr;
	
	@Column(name="item_nbr")
	private int itemNbr;
	
	@Column(name="total_qty")
	private int totalQty;
	
	@Column(name="label_nbr")
	private String labelNbr;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="door_nbr")
	private String doorNbr;
	
	@Column(name="rcvd_qty")
	private int rcvdQty;
	
	@Column(name="rcvd_ts")
	private Timestamp rcvdTs;
		
	@Column(name="delivery_nbr")
	private int deliveryNbr;
	
	@Column(name="po_status")
	private String poStatus;
	
	@Column(name="slot_id")
	private String slotId;
	
	@Column(name="pallet_cnt")
	private int palletCount;
	
	@Column(name="comments")
	private String comment;
	
	@Column(name="is_locked")
	private String isLocked;

	
	
	public SuperOverride() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPoNbr() {
		return poNbr;
	}



	public void setPoNbr(int poNbr) {
		this.poNbr = poNbr;
	}



	public int getItemNbr() {
		return itemNbr;
	}



	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}



	public int getTotalQty() {
		return totalQty;
	}



	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}



	public String getLabelNbr() {
		return labelNbr;
	}



	public void setLabelNbr(String labelNbr) {
		this.labelNbr = labelNbr;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getDoorNbr() {
		return doorNbr;
	}



	public void setDoorNbr(String doorNbr) {
		this.doorNbr = doorNbr;
	}



	public int getRcvdQty() {
		return rcvdQty;
	}



	public void setRcvdQty(int rcvdQty) {
		this.rcvdQty = rcvdQty;
	}



	public Timestamp getRcvdTs() {
		return rcvdTs;
	}



	public void setRcvdTs(Timestamp rcvdTs) {
		this.rcvdTs = rcvdTs;
	}



	public int getDeliveryNbr() {
		return deliveryNbr;
	}



	public void setDeliveryNbr(int deliveryNbr) {
		this.deliveryNbr = deliveryNbr;
	}



	public String getPoStatus() {
		return poStatus;
	}



	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
	}



	public String getSlotId() {
		return slotId;
	}



	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}



	public int getPalletCount() {
		return palletCount;
	}



	public void setPalletCount(int palletCount) {
		this.palletCount = palletCount;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getIsLocked() {
		return isLocked;
	}



	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}


	public SuperOverride(int poNbr, int itemNbr, int totalQty, String labelNbr, String userId, String doorNbr,
			int rcvdQty, Timestamp rcvdTs, int deliveryNbr, String poStatus, String slotId, int palletCount,
			String comment, String isLocked) {
		super();
		this.poNbr = poNbr;
		this.itemNbr = itemNbr;
		this.totalQty = totalQty;
		this.labelNbr = labelNbr;
		this.userId = userId;
		this.doorNbr = doorNbr;
		this.rcvdQty = rcvdQty;
		this.rcvdTs = rcvdTs;
		this.deliveryNbr = deliveryNbr;
		this.poStatus = poStatus;
		this.slotId = slotId;
		this.palletCount = palletCount;
		this.comment = comment;
		this.isLocked = isLocked;
	}
	
		
}
