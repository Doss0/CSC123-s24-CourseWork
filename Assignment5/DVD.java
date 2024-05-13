import java.util.Scanner;
public class DVD extends ReferenceMaterial
{
	private String ReleaseDate;
	private int DurationInMin;
	Scanner keyboard = new Scanner(System.in);
	
	public DVD(String ReleaseDate, int DurationInMin, String Title, boolean suitableForKids, boolean Available) 
	{
		super(Title, suitableForKids, Available);
		String releasedate = ReleaseDate;
		int durationinmin = DurationInMin;
	}
	
	public String releaseDate()
	{
		ReleaseDate = keyboard.nextLine();
		return ReleaseDate;
	}
	public void setreleaseDate(String releasedate)
	{
		ReleaseDate = releasedate;
	}
	public int Durationinmin()
	{
		DurationInMin = keyboard.nextInt();
		return DurationInMin;
	}
}
