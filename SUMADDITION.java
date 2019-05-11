import java.util.Scanner;

public class SUMADDITION extends calcu{
	
	 public static void main(String args[]) {
	      calcu demo = new calcu();
	 	 Scanner add = new Scanner(System.in);
	      System.out.println("Enter the two numbers: ");
	        int no1 = add.nextInt();
	        int no2 = add.nextInt();
	        int sum = no1+ no2;
	      
	       System.out.println("Sum of the number" +sum);
   }
	}