package applications;
import java.util.Scanner;

public class PhonepeApplication1{

	/**
	 * This Method is used to Greet the Customer
	 * @param Name
	 */
	public void greetCustomer(String Name)
	{
		System.out.println(Name+" Hello,Welcome to Phonepe Application");
	}

	/**
	 * This Method is used to select The contact in the Contact List
	 * @param Contact
	 */
	public void selectContacts(String Contact)
	{
		if(Contact.equals("Sravya") || Contact.equals("Sangeetha") || Contact.equals("Naveen"))
		{
			System.out.println(Contact+" Is Available and "+Contact+" contact page is opened");
			System.out.println("Enter the Amount in search Box");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			@SuppressWarnings("unused")
			int Amount = sc.nextInt();
		}
		else
		{
			System.out.println(Contact+" Entered Contact Not Available in your Contacts");
		}

	}

	/**
	 * This Method is used to Open the Payment page of Selected Contact
	 * @param contact
	 */
	public void paymentPage(String contact)
	{
		System.out.println(contact+" payment page is opened");
		System.out.println("Clicked on PAY Button");
	}

	/**
	 * This Method is used to Verify UPI and Do Payment
	 */
	public void UpiPage()
	{
		System.out.println("Enter UPI Pin No: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int PIN = sc.nextInt();
		if(PIN == 2000)
		{
			System.out.println("Transaction Succesfully Completed");
		}
		else
		{
			System.out.println(PIN+" Invalid Pin , So Transaction Incomplete");
		}
	}
	
	/**
	 * This Method is used to Logout from Application
	 * @param Name
	 */
	public void Logout(String Name)
	{
		System.out.println(Name+" Logged Out from the Phonepe Application Succesfully");
	}

	public static void main(String[] args) {

		System.out.println("Enter the Login Pin of PHONEPE: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int LoginPin = sc.nextInt();
		if(LoginPin == 1234)
		{
			PhonepeApplication1 pa = new PhonepeApplication1();
			pa.greetCustomer("KIRAN");
			pa.selectContacts("Sravya");	
			pa.paymentPage("Sravya");
			pa.UpiPage();
			pa.Logout("KIRAN");
		}
		else
		{
			System.out.println("Invalid PIN , So LOGIN Not Done");
		}
	}
}

