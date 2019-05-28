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
}