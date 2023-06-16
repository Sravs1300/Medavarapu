package Arrays;

public class Array4 {

	public static void main(String[] args) {
		int[][] a= {{3,6},{1,2,4}};
		int sum=0;
		int length=a.length;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
			{
				sum = sum+a[i][j];
			}
		double average=sum/length;
		System.out.println("Average of length:"+average);
	}
}


