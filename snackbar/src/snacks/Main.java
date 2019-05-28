package snacks;

public class Main
{
	public static void main(String[] args)
	{
		Customer jane= new Customer("Jane", 45.25);
		Customer bob= new Customer("Bob", 33.14);

		VendingMachine foodVendingMachine= new VendingMachine("Food");
		VendingMachine drinkVendingMachine= new VendingMachine("Drink");
		VendingMachine officeVendingMachine= new VendingMachine("Office");

		Snacks chips= new Snacks ("Chips", 35, 1.75, foodVendingMachine.getId());
		Snacks chocolateBar = new Snacks ("Chocolate Bar", 36, 1.00. foodVendingMachine.getId());
		Snacks pretzels =new Snacks ("Pretzel", 30, 2.00,foodVendingMachine.getId());
		Snacks soda= new Snacks ("Soda", 24, 2.50, drinkVendingMachine.getId());
		Snacks water= new Snacks ("Water", 20 ,2.75, drinkVendingMachine.getId());

		

	}
}