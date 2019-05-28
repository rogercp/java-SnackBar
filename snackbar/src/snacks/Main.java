package snacks;

public class Main
{
	 private static void workWithData ()
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

		// Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		// Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
		// Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
		// Customer 1 finds $10. Print Customer 1 Cash on Hand.
		// Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
		// Add 12 more items to snack 3. Print quantity of snack 3.
		// Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

		jane.buySnack(3,soda);
		jane.buySnack(1,pretzel);
		bob.buySnack(2,soda);

	}

	public static void main(String[] args)
	{
		workWithData();
	}
}