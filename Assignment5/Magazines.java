import java.util.Scanner;
public class Magazines extends ReferenceMaterial
{
private String PublicationDate;
private int IssueNumber;
Scanner keyboard = new Scanner(System.in);
	
	public Magazines(String PublicationDate, int IssueNumber, String Title, boolean suitableForKids, boolean Available) 
	{
		super(Title, suitableForKids, Available);
	String publicationdate = PublicationDate;
	int issuenumber = IssueNumber;
	}
	
	public String getpublicationDate()
	{
		PublicationDate = keyboard.nextLine();
		return PublicationDate;
	}
	public void setpublicationDate(String publicationdate)
	{
		PublicationDate = publicationdate;
	}
	public int getissueNumber()
	{
		IssueNumber = keyboard.nextInt();
		return IssueNumber;
	}
	public void setissueNumber(int issuenumber)
	{
		IssueNumber =issuenumber;
	}

}
