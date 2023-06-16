package loopingstatemets;

public class Divisible2 {

	public static void main(String[] args) {
		int i=150;
		do
		{
			if(i%7==0)
				System.out.println(i);
			i++;
		}
		while(i<=200);
	}
}