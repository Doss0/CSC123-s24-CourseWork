import java.io.InputStream;
import java.io.FileInputStream;

public class FileCurrencyLoader extends AbstractClasses
{
	private String File;

	public FileCurrencyLoader(String File)
	{
		this.File = File;
	}
	protected InputStream getInputStream()
	{
		return FileCurrencyLoader(File);
	}
}
