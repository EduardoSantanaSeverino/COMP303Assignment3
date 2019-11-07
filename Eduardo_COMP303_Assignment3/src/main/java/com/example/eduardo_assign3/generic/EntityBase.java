package com.example.eduardo_assign3.generic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 7, 2019
 */

public abstract class EntityBase {

	protected int id;
	
	private static AtomicLong idCounter = new AtomicLong();

	public static int createID()
	{
	    return (int)(idCounter.getAndIncrement() + 1);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}