// Qicheng Lin
// Period 5
// 10-23-24
// Food3.java
public class Food3
{
	protected String str;
	protected String str2;
	protected String str3;
	public Food3()
	{ 
		str = new String("");
		str2 = new String("");
		str3 = new String("");
	}
	public Food3(String prepMethod, String ingredient, String name, float cost, int count)
	{	
		str = "At the sale: " +	name + " " +	prepMethod + " with " + ingredient + "."; //initializing the string
		str2 = String.format(" with %d %s that cost $%.2f, $%.2f can be made.", count, name, cost/100, count * cost/100); //initializing the second string
		str3 = str + str2; //concatenating str1 and str2
	}
	public void printForSale()
	{
		System.out.println(str3); //printing out
	}
}
