/**
 * 
 */
package com.example.eduardo_assign3.bloodstock;

import java.util.Date;

import com.example.eduardo_assign3.generic.EntityBase;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019 		
 */

public class BloodStock extends EntityBase {

	private String bloodGroup;
	private int quantity;
	private Date bestBefore;
	private String status;
	
	/**
	 * @param bloodGroup
	 * @param quantity
	 * @param bestBefore
	 * @param status
	 */
	public BloodStock(String bloodGroup, int quantity, Date bestBefore, String status) {
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
		this.bestBefore = bestBefore;
		this.status = status;
		this.id = createID();
	}
	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}
	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the bestBefore
	 */
	public Date getBestBefore() {
		return bestBefore;
	}
	/**
	 * @param bestBefore the bestBefore to set
	 */
	public void setBestBefore(Date bestBefore) {
		this.bestBefore = bestBefore;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
