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
		this.id=maxId;
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
		this.vendingMachineId=vendingMachineId;
	}

	public int getId(int id)
	{
		return id;
	}
	public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
    	return name;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void sellSnack(int quantity)
    {
        if(quantity>0)
        {
        	if(this.quantity>=quantity)
        	{
        		this.quantity -=quantity;
        	}
        }
    }
    
    public double getCost(double quantity)
    {
    	return this.cost*quantity;
    }


}





