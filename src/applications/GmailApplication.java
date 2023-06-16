package applications;
import java.util.Scanner;
public class GmailApplication {
	

	public static void Signup()
	{
		System.out.println("Your Gmail account had been created");
	}
	
		public static void greetToCustomer()
		{
			System.out.println("Hello, Sravya Welcome To Gmail: ");
		}
		public static void composethemail() 
		{
			Scanner sc = new Scanner(System.in);
            System.out.print("Enter recipient email address ");
            String recipient = sc.nextLine();
            System.out.print("Enter email subject ");
            String subject = sc.nextLine();
            System.out.print("Enter email message ");
            String messageText = sc.nextLine();
            System.out.println("Click on sent Button, Email sent successfully");
		}
		public static void SentMail()
		{
			System.out.println("Clicked on sent Button");
		}
		public static void DeleteMail(String selectMail)
		{
			System.out.println("Selected mail has deleted" +selectMail);
		}
		
        public static void Logout()
		{
			System.out.println("clicked on the logout button");
			System.out.println("Successfully logout from the account");
		}
	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your First Name ");
			String FirstName = sc.nextLine();

			System.out.println("Enter your Last Name");
			String LastName = sc.nextLine();
			System.out.println("Enter your password");
			String password = sc.nextLine();
			GmailApplication.Signup();
			//Login to Gmail Application
			System.out.println("Logging into Application by using Credentials");
			System.out.println("Enter EMAILID ");
			String EMAILID = sc.next();
			System.out.println("Enter PASSWORD ");
			String PASSWORD = sc.next();
			if (EMAILID.equals(EMAILID) && PASSWORD.equals(PASSWORD))
			{
				System.out.println("Logged Into Application Succesfully");
			
			GmailApplication.greetToCustomer();
			GmailApplication.composethemail();
			GmailApplication.SentMail();
			GmailApplication.DeleteMail("Sowmya");
			GmailApplication.Logout();
			}
			else
			{
				System.out.println("Invalid credentials");
			}
		}

		
		}

	