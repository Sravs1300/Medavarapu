package Arrays;

public class Array2 {



	public static void main(String[] args) {
		int[][] Array = {{3, 6}, {1, 2, 4}};  
		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j <Array[i].length; j++) {
				sum =sum+ Array[i][j];  
			}
		}
		System.out.println("sum of all elements in the array:" +sum);  
	}
}

