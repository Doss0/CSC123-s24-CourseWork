
public class ChangeMaker 
{
	int Dollars;
	int Cents;
	int Quarters, Dimes, Nickles, Pennies;
	public ChangeMaker(int dollars, int cents)
	{
		Dollars = dollars;
		Cents = cents; 
	}
	public int getQuarters()
	{
		return Quarters;
	}
	public int getDimes()
	{
		return Dimes;
	}

	public int getNickles()
	{
		return Nickles;
	}

	public int getPennies()
	{
		return Pennies; 
	}
}