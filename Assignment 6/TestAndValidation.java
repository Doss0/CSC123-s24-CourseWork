import java.util.Map;
public class TestAndValidation 
{
	 NetworkCurrencyLoader NCL = new NetworkCurrencyLoader("http://www.usman.cloud/banking/exchange-rate.csv");
     Map<String, MyCurrency> NCL = NCL.loadCurrencies();
     System.out.println(MyCurrency);
     //I am unsure on wht to do here
}
