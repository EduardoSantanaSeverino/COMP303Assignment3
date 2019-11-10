package com.example.eduardo_assign3.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 7, 2019
 */

/**
 * This Class is an abstract class to serve as a template for 
 * all the services created in the application.
 * In this way we are implementing code reusing for services. 
 */
public abstract class  ServiceBaseAbstract <T extends EntityBase> {
	
	protected List<T> list;
	
	public ServiceBaseAbstract()
	{
		super();
		if(this.list == null)
		{
			this.list = new ArrayList<T>();
		}
	}
	
	/** 
	 * @return the list
	 */
	public List<T> getAll() {
		return list;
	}
	
	public T getItem(int id)
	{
		return list.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	
	public void createItem(T item)
	{
		item.setId(T.createID());
		this.list.add(item);
	}

	public void updateItem(int id, T item) 
	{
		for (int i = 0; i < this.list.size(); i++)
		{
			T obj = this.list.get(i);
			if(obj.getId() == id)
			{
				item.setId(id);
				this.list.set(i, item);
				return;
			}
		}
	}

	public void deleteItem(int id) 
	{
		this.list.removeIf(t -> t.getId() == id);
	}

}