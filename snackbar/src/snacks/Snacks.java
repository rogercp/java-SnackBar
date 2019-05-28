package snacks;

public class Snacks
{
	private static int maxId=0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snacks (String name, int quantity, double cost, int vendingMachineId )
	{
		maxId++;
		id=maxId;
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
		this.vendingMachineId=vendingMachineId;
	}

}