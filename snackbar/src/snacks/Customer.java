package snacks;

public class Customer
{
	private static int maxId=0;
	private int id;
	private String name;
	private double cash;

	public Customer (String name, double cash)
	{
		maxId++;
		this.id=maxId;
		this.name=name;
		this.cash=cash;
	}

   
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

	public void addCash(double cash)
    {
        this.cash += cash;
    }

    public double getCash()
    {
        return cash;
    }

    
    public void buySnack(int quantity, Snacks snack)
    {
        snack.sellSnack(quantity);
        this.cash-=snack.getCost(quantity);
    }

}