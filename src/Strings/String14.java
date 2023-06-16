package Strings;

public class String14 {


	import java.util.Scanner;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String fileName = sc.nextLine();

		int dotIndex = fileName.lastIndexOf('.');
		if (dotIndex > 0 && dotIndex < fileName.length() - 1) 
		{
			String fileExtension = fileName.substring(dotIndex + 1);
			System.out.println("File extension: " + fileExtension);
		} 

	}

