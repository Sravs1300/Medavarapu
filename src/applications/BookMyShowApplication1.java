package applications;

import java.util.Scanner;

public class BookMyShowApplication1 {
	
	private static final double TotalAmount = 0;

	/**
	 * This Method is used to Create an Account in Book My show Application
	 */
	public static void CreateAccount()
	{
		
		System.out.println("Clicked on Save Button");
		
	}
	
	/**
	 * This Method is is used to Select the Movie in Book My show Application
	 */
	public static void MovieSelection(String Movie)
	{
		if (Movie.equalsIgnoreCase("DASARA")  || Movie.equals("RRR") || Movie.equals("KGF"))
		{
			System.out.println(Movie + " movie Selected");
		}
		else
		{
			System.out.println(Movie + " Movie Not available in the List");
		}
	}
	
	/**
	 * This Method is is used to Select the Theaters in Book My show Application
	 */
	public void MovieTheaters(String Theaters)
	{
		if (Theaters.equals("INOX")  || Theaters.equals("ROCKY") || Theaters.equals("ASIAN"))
		{
			System.out.println(Theaters + " Theater Selected");
		}
		else
		{
			System.out.println(Theaters + " Theater Not available in the List");
		}
	}
	
	/**
	 * This Method is used to select the Seats in Book My show Application
	 */
	public static void SeatSelection(int seatNo)
	{
		if (seatNo>0 || seatNo <= 83)
		{
			System.out.println(seatNo + " is Selected in Lower Class");
		}
		else if (seatNo> 84 || seatNo <= 169)
		{
			System.out.println(seatNo + " is Selected in First Class");
		}
		else if (seatNo> 170 || seatNo <= 250)
		{
			System.out.println(seatNo + " is Selected in Balcony");
		}
		else
		{
			System.out.println(seatNo+" Invalid Seat Number");
		}
	}
	
	/**
	 * This Method is used to do Payment in Book My show Application
	 */
	public static void Payment()
	{
		Scanner sc =new Scanner(System.in);

        System.out.print("Enter the payment method (credit card, debit card, netbanking): ");
        String paymentMethod = sc.next();

		switch (paymentMethod) {
            case "credit card":
                processCreditCardPayment(TotalAmount);
                break;
            case "debit card":
                processCreditCardPayment(TotalAmount);
                break;
            case "netbanking":
                processNetBankingPayment(TotalAmount);
                break;
            default:
                System.out.println("Invalid payment method.");
                break;
        }
    }
		
	

	public static void processCreditCardPayment(double totalAmount) {
	    Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter credit card number: ");
	    String cardNumber = input.nextLine();
	
	    System.out.print("Enter expiration date (MM/YY): ");
	    String expDate = input.nextLine();
	
	    System.out.print("Enter CVV: ");
	    int cvv = input.nextInt();
	
	    System.out.println("Payment successfull");
	}

	
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Name");
		String Name = sc.nextLine();
		
		System.out.println("Enter the Phone Number");
		String Num = sc.next();
		System.out.println(Num.length());
		if (Num.length()==10||Num.length()!=9)
		{
			System.out.println(Num);
		}
		else
		{
			System.out.println("Please Enter valid 10 digit Numbers");
		}
		System.out.println("Enter Username: ");
		String username = sc.next();
		
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		BookMyShowApplication1.CreateAccount();
		System.out.println(Name+" Account created Succesfully");
		System.out.println(Num+ " Phone Number updated Succesfully");
		
		// Login to BookMyshow Application
		System.out.println("Logging into Application by using Credentials: ");
		System.out.println("Enter Login USERNAME: ");
		String USERNAME = sc.next();
		System.out.println("Enter Login PASSWORD: ");
		String PASSWORD = sc.next();
		if (username.contains(USERNAME) && password.contains(PASSWORD))
		{
			System.out.println("Logged Into Application Succesfully");
			BookMyShowApplication1.MovieSelection("Dasara");
			BookMyShowApplication1 bs = new BookMyShowApplication1();
			bs.MovieTheaters("INOX");
			BookMyShowApplication1.SeatSelection(8);
		}
		else
		{
			System.out.println("Invalid Login Credentials");
		}
	}
}

	

