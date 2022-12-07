package firstproject;

public class ArraySum
{

	public static void main(String[] args) 
	{
		int []ar = {10,20,30,40};
		int Addition = sumArray(ar);
		
		
		
		System.out.println("Addition: "+Addition);
	}
	
	public static int sumArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
    }
}