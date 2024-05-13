import java.util.Scanner;
public class Books extends ReferenceMaterial
{
	private String Author;
	private int ISBN;
	private int NumbOfP;
	Scanner keyboard = new Scanner(System.in);

	public Books(String Author, int ISBN, int NumbOfP, String Title, boolean suitableForKids, boolean Available) 
	{
		super(Title, suitableForKids, Available);
		String author = Author;
		int isbn = ISBN;
		int numbofp = NumbOfP;
	}
	
	public String getAuthor()
	{
		Author = keyboard.nextLine();
		return Author;
	}
	public void setAuthor(String author)
	{
		Author = author;
	}
	public int getIsbn()
	{
		ISBN = keyboard.nextInt();
		return ISBN;
	}
	public void setIsbn(int isbn)
	{
		ISBN = isbn;
	}
	public int getNumbofP()
	{
		NumbOfP = keyboard.nextInt();
		return NumbOfP;
	}
	public void setNumbofP(int numbofp)
	{
		NumbOfP = numbofp;
	}
}
