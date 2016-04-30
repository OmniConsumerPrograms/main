// Brad Howard
// OCP Item Manager

import java.io.*;
import java.util.*;

public class ItemManager implements IManager<Item>
{
	private ArrayList<Item> itemList;
	
	public ItemManager()
	{
		itemList = new ArrayList<Item>();
	}
	
	public void set(Item item)
	{
		itemList.add(item);
	}
	
	public Item get(int ID)
	{
		return itemList.get(ID);
	}
}