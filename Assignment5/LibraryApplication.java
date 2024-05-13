import java.util.Date;
public class LibraryApplication 
{
	private String FirstName;
	private String LastName;
	private Date DOB;
	private String City;
	private int Zip; 
	
	 public static void main(String[] args) 
	 {
	        
	        LibraryApplication application = new LibraryApplication();
	 }
	public LibraryApplication()
	{
		this.setFirstName(FirstName);
		this.LastName = LastName;
		this.setDOB(DOB);
		this.City = City;
		this.Zip = Zip;
	//Unsure on what else could go here. 
	}
//I believe I would include Members here along with reference materials as return methods but I am leaving this blank

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
}
