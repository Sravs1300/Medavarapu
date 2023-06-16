package loopingstatemets;

public class Numpattern {

	public static void main(String[] args) {
		
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.println(" ");
			}
			for(int j=i;j>1;j--)
			{
				System.out.println(j);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.println(j);
			}
			System.out.println();
		}
	}
}
