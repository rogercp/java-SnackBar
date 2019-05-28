package snacks;


public class VendingMachine
{
	private static int MaxId=0
	private int id;
	private String name;

	public VendingMachine (String name)
	{
		MaxId++;
		id=MaxId;
		this.name=name;
	}

	public int getId()
	{
		return id;
	}

	public String setname(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}

	@Override 
	public String toString()
	{
		String rtnStr="Vending Machine's id: " + id + "\n";
						"Vending Machine's name:" + name + "\n";

				return rtnStr;
	}

}