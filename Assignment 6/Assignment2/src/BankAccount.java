import java.util.Scanner;
public class BankAccount 
{

	 private String ownerFirstName;
	    private String ownerLastName;
	    private double initialDepositAmount;
	    private boolean Available;

	    public class Main {
	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);
	            
	         
	            
	            // Display account information
	            System.out.println("\nAccount created for: ");
	            System.out.println("Initial balance: $");
	            
	            // Close the scanner
	            scanner.close();
	        }
	    }
	    
	    public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount) 
	    {
	        this.ownerFirstName = ownerFirstName;
	        this.ownerLastName = ownerLastName;
	        this.initialDepositAmount = initialDepositAmount;
	        this.Available = true;
	    }

		public boolean deposit(double amount) 
	    {
	        if (Available && amount > 0) 
	        {
	            initialDepositAmount += amount;
	            return true;
	        }
	        return false;
	    }

	    public boolean withdraw(double amount) 
	    {
	        if (Available && amount > 0 && initialDepositAmount >= amount) 
	        {
	            initialDepositAmount = amount;
	            return true;
	        }
	        return false;
	    }

	    public boolean isOpen() 
	    {
	        return Available;
	    }

	    public void close() 
	    {
	        Available = false;
	    }

	    public String getOwnerFullName() 
	    {
	        return ownerFirstName + " " + ownerLastName;
	    }

	    public double viewBalance() 
	    {
	        return initialDepositAmount;
	    }
	}
