// Qicheng Lin
// Period 5
// 10-23-24
// FoodTester3.java

public class FoodTester3
{
	public static void main(String[] args)
	{
		printNewLines();
		Food3 food1 = new Food3("baked", "banana", "muffins", 50, 15);
		food1.printForSale();
		/* food1 is a food object, which requires three parameters as 
		 * input. Sending in "baked", "banana" and "muffins" into food1,
		 * the constructor in Food with all three parameters updates the
		 * str to become "At the sale: muffins baked with banana".
		 * 
		 * food1 has access to printForSale() because that method is 
		 * in the Food class. This prints out str
		*/
		Food3 food2 = new Food3("fried", "yam", "fritters", 100, 12);
		food2.printForSale();
		// same as above
		Pizza3 pizza = new Pizza3("pepperoni", "pizza", 250, 5);
		pizza.printForSale();
		// same as above, except it sends it into Pizza3
		DeepDishPizza3 deepDishPizza = new DeepDishPizza3("cheese");
		deepDishPizza.printForSale();
		// same as above, except it sends it into DeepDishPizza3.
		printNewLines();
	}

	public void printNewLines()
	{
		System.out.println("\n\n");
	}
}
