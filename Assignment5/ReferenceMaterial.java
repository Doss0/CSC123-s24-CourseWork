import java.util.Scanner;
public class ReferenceMaterial 
{
	private String Title;
	private boolean suitableForkids;
	private boolean Available;
	Scanner Keyboard = new Scanner(System.in);
	
	public ReferenceMaterial(String Title, boolean suitableForKids, boolean Available)
	{
		String title = Title;
		boolean SuitableForKids = suitableForKids;
		boolean available = Available;
	}

	public String getTitle()
	{
		Title = Keyboard.nextLine();
		return Title;
	}
	public void setTitle(String title)
	{
		Title = title;
	}
	//Return method for the boolean variables are needed!
}
