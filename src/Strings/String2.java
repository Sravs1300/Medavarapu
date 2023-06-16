package Strings;

public class String2 {



	public static void main(String[] args) {
		String str = "I Love My India";
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		System.out.println("Number of words in the string: " + count);
	}
}







