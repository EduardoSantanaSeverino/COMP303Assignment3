/**
 * 
 */
package com.example.eduardo_assign3.seeker;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

public class Seeker {

	private String firstName ;
	private String lastName ;
	private String ageOrDOB ;
	private String gender ;
	private String bloodGroup ;
	private String city ;
	private String phone ;
	

	/**
	 * 
	 */
	public Seeker() {
	
	} 
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param ageOrDOB
	 * @param gender
	 * @param bloodGroup
	 * @param city
	 * @param phone
	 */
	public Seeker(String firstName, String lastName, String ageOrDOB, String gender, String bloodGroup, String city,
			String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ageOrDOB = ageOrDOB;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.phone = phone;
	} 
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the ageOrDOB
	 */
	public String getAgeOrDOB() {
		return ageOrDOB;
	}
	/**
	 * @param ageOrDOB the ageOrDOB to set
	 */
	public void setAgeOrDOB(String ageOrDOB) {
		this.ageOrDOB = ageOrDOB;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	
}

