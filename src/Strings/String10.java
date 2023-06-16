package Strings;

public class String10 {

		public static void main(String[] args) {
			String input = "Java is important and easy Subject";
			String[] words = input.split("\\s+"); 
			String[] evenWords = new String[words.length / 2]; 

			for (int i = 0; i < words.length; i += 2) {
				evenWords[i / 2] = words[i]; 
			}

			for (String word : evenWords) {
				System.out.println(word);
			}
		}
	}









