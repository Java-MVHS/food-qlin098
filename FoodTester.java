// Qicheng Lin
// Period 5
// 10-23-24

public class FoodTester
{
	public static void main(String[] args)
	{
		Food food1 = new Food("baked", "banana", "muffins");
		food1.printForSale();
		/* food1 is a food object, which requires three parameters as 
		 * input. Sending in "baked", "banana" and "muffins" into food1,
		 * the constructor in Food with all three parameters updates the
		 * str to become "At the sale: muffins baked with banana".
		 * 
		 * food1 has access to printForSale() because that method is 
		 * in the Food class. This prints out str
		*/
		Food food2 = new Food("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza	= new Pizza("pepperoni", "pizza");
		pizza.printForSale();
		DeepDishPizza deepDishPizza = new DeepDishPizza("cheese");
		deepDishPizza.printForSale();
	}
}
