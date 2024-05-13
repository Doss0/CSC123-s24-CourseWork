import java.util.Date;
import java.util.Scanner;
public class LibraryMembers extends LibraryApplication
{
	String firstName;
	String lastName;
	Date dob;
	String city;
	int zip;
	Scanner keyboard = new Scanner(System.in);
	
	public LibraryMembers(String FirstName, String LastName, Date DOB, String City, int Zip) 
	{
	 super ();
	}
	
	public String getfirstName()
	{
	firstName = keyboard.nextLine();
	return firstName;
	}
	public void setfirstName( String firstName)
	{
		firstName = getfirstName();
	}
	public String getlastName()
	{
	lastName = keyboard.nextLine();
	return lastName;
	}
	public void setlastName( String lastName)
	{
		lastName = getlastName();
	}
	public Date getdob()
	{
	return dob;
	}
	public void setdob( Date dob)
	{
		dob = getdob();
	}
	public String getCity()
	{
	city = keyboard.nextLine();
	return city;
	}
	public void setCity( String city)
	{
		city = getCity();
	}
	public int getZip()
	{
		zip = keyboard.nextInt();
		return zip;
	}
	public void setZip()
	{
		zip = getZip();
	}
}
