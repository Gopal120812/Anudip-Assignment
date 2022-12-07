package firstproject;

public class ArrayAverage {

	public static void main(String[] args) {
		int sum=0;
		int []arr= {5,10,15,20,30};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum/arr.length);

	}

}
