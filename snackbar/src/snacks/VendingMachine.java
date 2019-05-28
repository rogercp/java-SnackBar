package snacks;


public class VendingMachine
{
	//fields
	private static int MaxId=0;
	private int id;
	private String name;

	public VendingMachine (String name)
	{
		MaxId++;
		this.id=MaxId;
		this.name=name;
	}

	public int getId()
	{
		return this.id;
	}

	public void setname(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}

	
}