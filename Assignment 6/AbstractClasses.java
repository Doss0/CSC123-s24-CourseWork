import java.util.Scanner;
import java.util.Map;
import java.io.InputStream;
import java.util.HashMap;

public class AbstractClasses 
{
	public Map<String, MyCurrency> loadCurrencies() 
	{
        Map<String, MyCurrency> currencies = new HashMap<>();
        try (InputStream inputStream = getInputStream();
             Scanner keyboard = new Scanner(inputStream)) 
        {
            
            while (scanner.hasNextLine()) 
            {
                String Line = keyboard.nextLine();
                String[]Parts = line.split(",");
                if (Parts.length == 4) 
                {
                    String currencyCode = parts[0].trim();
                    double exchangeRate = Double.parseDouble(parts[1].trim());
                    MyCurrency currency = new MyCurrency(currencyCode, exchangeRate);
                    currencies.put(currencyCode, currency);
                }
            }
        } 
        return currencies;
        catch (IOException Catch) 
        {
            //Unsure on what to put here without getting an error
        }
       
}
