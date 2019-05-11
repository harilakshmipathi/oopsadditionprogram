import java.util.Scanner;

public class encapadd {

	 public static void main(String args[]) {
		 
	 
	 encapsulation add = new encapsulation();
         Scanner addition = new Scanner(System.in);
	     System.out.println("enter the two  numbers: ");
	    int number1 = addition.nextInt();
	    int number2 = addition.nextInt();
	        int num = number1 + number2;
	      
	       System.out.println("Sum of the number" +num);
  
	}

}
