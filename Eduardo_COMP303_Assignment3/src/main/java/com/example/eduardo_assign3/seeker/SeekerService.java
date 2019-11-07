/**
 * 
 */
package com.example.eduardo_assign3.seeker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@Service
public class SeekerService {
	
	private List<Seeker> list;
	
	public SeekerService()
	{
		this.list = new ArrayList<Seeker>();
		this.list.add(new Seeker("Eduardo", "Santana", "12", "Masculine", "R+", "Santo Domingo", "8093158978"));
	}
	
	/** 
	 * @return the list
	 */
	public List<Seeker> getAll() {
		return list;
	}
	
	public Seeker getItem(String id)
	{
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void createItem(Seeker item)
	{
		item.setId(Seeker.createID());
		this.list.add(item);
	}

	public void updateItem(String id, Seeker item) {
		for (int i = 0; i < this.list.size(); i++)
		{
			Seeker obj = this.list.get(i);
			if(obj.getId().equals(id))
			{
				item.setId(id);
				this.list.set(i, item);
				return;
			}
		}
	}

	public void deleteItem(String id) {
		this.list.removeIf(t -> t.getId().equals(id));
	}

}
