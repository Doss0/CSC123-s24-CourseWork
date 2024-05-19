
public class ChangeMaker 
{
	int Dollars;
	int Cents;
	int Quarters, Dimes, Nickles, Pennies;
	public ChangeMaker(int dollars, int cents)
	{
		this.Dollars = dollars;
		this.Cents = cents; 
	}
	public int getQuarters()
	{
		int Quarters = Dollars * 100 + Cents; 
		return Quarters = Quarters / 25;
	}
	public int getDimes()
	{
		int Dimes = Dollars * 100 + Cents;
		return Dimes =(Dimes % 25) / 10;
	}

	public int getNickles()
	{
		int Nickles = Dollars * 100 + Cents;
        return Nickles = ((Nickles % 25) % 10) / 5;
	}

	public int getPennies()
	{
		int Pennies = Dollars * 100 + Cents;
        return Pennies = ((Pennies % 25) % 10) % 5;
	}
}