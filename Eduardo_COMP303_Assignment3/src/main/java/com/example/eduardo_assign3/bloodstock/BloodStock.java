/**
 * 
 */
package com.example.eduardo_assign3.bloodstock;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

public class BloodStock {

	private String BloodGroup;
	private String Quantity;
	private String BestBefore;
	private String Status;
	
	/**
	 */
	public BloodStock() {
	}
	
	/**
	 * @param bloodGroup
	 * @param quantity
	 * @param bestBefore
	 * @param status
	 */
	public BloodStock(String bloodGroup, String quantity, String bestBefore, String status) {
		BloodGroup = bloodGroup;
		Quantity = quantity;
		BestBefore = bestBefore;
		Status = status;
	}
	
	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return BloodGroup;
	}
	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return Quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	/**
	 * @return the bestBefore
	 */
	public String getBestBefore() {
		return BestBefore;
	}
	/**
	 * @param bestBefore the bestBefore to set
	 */
	public void setBestBefore(String bestBefore) {
		BestBefore = bestBefore;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	
}
