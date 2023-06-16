package Strings;

public class String3 {

	public static void main(String[] args) {

		String str = "I Love My India";
		char ch = 'I';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("Number of occurrences of the character " + ch + ":" + count);
	}


}



