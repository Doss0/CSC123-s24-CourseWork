
public class AssignmentTwo 
{
	private int Pennies;
    private int Nickles;
    private int Dimes;
    private int Quarters;
    
    public AssignmentTwo(int Pennies, int Nickles, int Dimes, int Quarters)
    {
    	this.Pennies = Pennies;
    	this.Nickles = Nickles;
    	this.Dimes = Dimes;
    	this.Quarters = Quarters;
    }
    public int getDollarAmount() 
    {
        int DollarAmnt = Pennies + Nickles * 5 + Dimes * 10 + Quarters * 25;
        return DollarAmnt / 100; 
    }
    public int getCentsAmount() 
    {
    	int DollarAmnt = Pennies + Nickles * 5 + Dimes * 10 + Quarters * 25;
        return DollarAmnt % 100;
    }
}
