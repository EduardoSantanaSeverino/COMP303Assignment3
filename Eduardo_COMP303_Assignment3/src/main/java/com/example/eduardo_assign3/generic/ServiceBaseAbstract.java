package com.example.eduardo_assign3.generic;

import java.util.ArrayList;
import java.util.List;

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