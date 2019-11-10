/**
 * 
 */
package com.example.eduardo_assign3.bloodbank;

import com.example.eduardo_assign3.generic.EntityBase;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

public class BloodBank extends EntityBase {

	private String bloodbankName;
	private String address;
	private String city;
	private String phone;
	private String website;
	private String email;
	
	/**
	 * 
	 */
	public BloodBank() {
	}
	
	/**
	 * @param bloodbankName
	 * @param address
	 * @param city
	 * @param phone
	 * @param website
	 * @param email
	 */
	public BloodBank(String bloodbankName, String address, String city, String phone, String website, String email) {
		this.bloodbankName = bloodbankName;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.website = website;
		this.email = email;
		this.id = createID();
	}
	
	/**
	 * @return the bloodbankName
	 */
	public String getBloodbankName() {
		return bloodbankName;
	}
	/**
	 * @param bloodbankName the bloodbankName to set
	 */
	public void setBloodbankName(String bloodbankName) {
		this.bloodbankName = bloodbankName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
