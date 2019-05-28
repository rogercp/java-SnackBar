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

	public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double sellSnacks(int quantity)
    {
        this.quantity -= quantity;
        return quantity * cost;
    }

    @Override
    public String toString()
    {
        String rtnStr= "Snack's id: " + id + "\n" +
                       "Snack's name: " + name + "\n" +
                       "Snack's quantity: " + quantity + "\n" +
                       "Snack's cost: " + cost + "\n";

        return rtnStr;
    }
}