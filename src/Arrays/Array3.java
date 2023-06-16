package Arrays;

public class Array3 {



	public static void main(String[] args) {
		int array[]= {3,6,1,2,4};
		int sum=0;
		int length=array.length;
		for(int i=0;i<array.length;i++)
		{
			sum= sum+array[i];
		}
		double average=sum/length;
		System.out.println("Average of length:"+average);
	}
}




