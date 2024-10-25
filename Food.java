// Qicheng Lin
// Period 5
// 10-23-24

public class Food
{
	protected String str;
	public Food()
	{ 
		str = new String("");
	}
	public Food(String prepMethod, String ingredient, String name)
	{
		str = "At the sale: " +	name + " " +	prepMethod + " with " + ingredient;
	}
	public void printForSale()
	{
		System.out.println(str);
	}
}
