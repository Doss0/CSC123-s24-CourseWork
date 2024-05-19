import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;

public class NetworkCurrencyLoader extends AbstractClasses
{
	private String nURL;

    public NetworkCurrencyLoader(String nURL) 
    {
        this.nURL = nURL;
    }
    protected InputStream getInputStream() 
    {
        URL url = new URL(nURL);
        HttpURLConnection Connection = (HttpURLConnection) url.openConnection();
        return Connection.getInputStream();
        //I had help with This "Protected Method"
    }
}