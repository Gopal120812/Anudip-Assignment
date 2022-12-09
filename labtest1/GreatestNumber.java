package labtest1;

public class GreatestNumber {
	public static void main(String[] args) {
		int n1 = 20, n2 = 25, n3 = 15;

        if(n1 > n2) {
            if(n1 > n3) //prints n1, if the above two conditions are true 
                System.out.println(n1 + " is the largest number.");
            else //prints n3, if the inner condition(n1>n3) defined is false  
            	 
                System.out.println(n3 + " is the largest number.");
        } 
        else {
        	
            if(n2 > n3) //prints n2, if the condition defined in outer if is false and the condition defined in inner if is true  
            	//means n3>n1 and n2>n3  
                System.out.println(n2 + " is the largest number.");
            else //prints n3, if the condition defined in both inner and outer loop is false  
        
                System.out.println(n3 + " is the largest number.");
        }
	}

}
