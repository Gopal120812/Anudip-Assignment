package labtest1;

import java.util.Scanner;

public class Operations {
	  public static void main(String[] args) {

	    char operator;
	    int number1, number2;
	    Scanner scan = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *,/, or %");
	    operator = scan.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = scan.nextInt();

	    System.out.println("Enter second number");
	    number2 = scan.nextInt();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        System.out.println("Result :"+(number1+number2));
	        break;

	      // performs subtraction between numbers
	      case '-':
	        System.out.println("Result :"+(number1-number2));
	        break;

	      // performs multiplication between numbers
	      case '*':  
	        System.out.println("Result :"+(number1*number2));
	        break;

	      // performs division between numbers
	      case '/': 
	        System.out.println("Result :"+(number1/number2));
	        break;
	        
	     // prints the remainder of numbers
	      case '%':
	        System.out.println("Result :"+(number1%number2));
	        break;
 

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	   
	  }
	}


