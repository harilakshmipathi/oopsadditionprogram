import java.util.Scanner;

public class AdditionPoly {

		 public int sum(int no1, int no2) 
			    { 
			        return (no1 + no2); 
			    } 

			    public static void main(String args[]) 
			    { 
			    	AdditionPoly  addition = new AdditionPoly(); 
			    	 Scanner add = new Scanner(System.in);
				      System.out.println("Enter the two numbers: ");
				        int no1= add.nextInt();
				        int no2 = add.nextInt();
				        int sum = no1+ no2;
				      
				       System.out.println("Sum of the numbers" +sum);
			    }
				}
