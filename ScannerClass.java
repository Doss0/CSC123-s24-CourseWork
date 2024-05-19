import java.util.Scanner;

public class ScannerClass 
{
	
	public static void main(String[]args)
	{
		byte A
		short B
		int C
		long D
		double E
		String F
		boolean G
		Scanner keyboard = new Scanner(System.in);
		System.out.println("A = ");
		A = keyboard.nextByte();
		System.out.println("B = ");
		B = keyboard.nextShort(); 
		System.out.println("C = ");
		C = keyboard.nextInt(); 
		System.out.println("D = ");
		D = keyboard.nextInt();
		System.out.println("E = ");
		E = keyboard.nextLong(); 
		System.out.println("F = ");
		F = keyboard.nextLine(); 
		
		Scanner Keyboard = new Scanner("Kobe,Bryant").useDelimiter(",");

        while (scanner.hasNext()) 
        {
            String token = Keyboard.next();
            System.out.println("Token: " + token);
        }
	}
}
