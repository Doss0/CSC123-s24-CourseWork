import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DMV 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // I had help from my tutor for this section
        System.out.println("Enter Registration ID:");
        int registrationID = scanner.nextInt();
        System.out.println("Enter Start Date (in MM/DD/YYYY format):");
        String startDateStr = scanner.next();
        Date startDate = parseDate(startDateStr);
        System.out.println("Enter End Date (in MM/DD/YYYY format):");
        String endDateStr = scanner.next();
        Date endDate = parseDate(endDateStr);
        System.out.println("Enter Vehicle:");
        String vehicle = scanner.next();
        System.out.println("Enter License Plate:");
        String licensePlate = scanner.next();

        Registration registration = new Registration(registrationID, startDate, endDate, new Owner[0], vehicle, licensePlate);

        System.out.println("Enter Vehicle:");
        String regVehicle = scanner.next();
        System.out.println("Enter Owner Name:");
        String ownerName = scanner.next();
        System.out.println("Enter Owner Address:");
        String ownerAddress = scanner.next();

        System.out.println("Enter Offense Date (in MM/DD/YYYY format):");
        String offenseDateStr = scanner.next();
        Date offenseDate = parseDate(offenseDateStr);
        System.out.println("Enter Offense Code:");
        int offenseCode = scanner.nextInt();
        System.out.println("Enter Amount:");
        double amount = scanner.nextDouble();

        Citation citation = new Citation(offenseDate, offenseCode, amount, registration);

        System.out.println("\nRegistration Details:");
        System.out.println("ID: " + registration.getID() + ", Start Date: " + registration.getStartDate() +
                ", End Date: " + registration.getEndDate() + ", Vehicle: " + registration.getVehicle() +
                ", License Plate: " + registration.getLicensePlate());

        System.out.println("\nRegistered Vehicle Details:");
        Registration registerVehicle = null;
		System.out.println("Vehicle: " + registerVehicle.getVehicle() + ", Owner Name: " + registerVehicle.getOwnerAddress() +
                ", Owner Address: " + registerVehicle.getOwnerAddress());

        System.out.println("\nCitation Details:");
        System.out.println("Date: " + citation.getDate() + ", Offense Code: " + citation.getOffenseCode() +
                ", Amount: " + citation.getAmount());
        
        scanner.close();
    }
    private static Date parseDate(String dateStr) 
    {
        try 
        {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            return formatter.parse(dateStr);
        } catch (ParseException e) 
        {
            System.out.println("Invalid date format. Please enter date in MM/DD/YYYY format.");
            return null;
        }
    }
}
