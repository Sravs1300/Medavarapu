package Strings;

public class String11 {

	public static void main(String[] args) {
		String input = "Hello, What work assigned for you";
		String[] words = input.split("\\s+"); 
		String maxLengthWord = ""; 

		for (String word : words) {
			if (word.length() > maxLengthWord.length()) {
				maxLengthWord = word; 
			}
		}

		System.out.println("The max length word in the input string is: " + maxLengthWord);
	}
}

