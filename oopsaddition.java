import java.util.Scanner;

public class oopsaddition { 
	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 

	    public static void main(String args[]) 
	    { 
	    	oopsaddition s = new oopsaddition(); 
	    	 Scanner add = new Scanner(System.in);
		      System.out.println("Enter the two numbers: ");
		        int x = add.nextInt();
		        int y = add.nextInt();
		        int z = x + y;
		      
		       System.out.println("Sum of the numbers" +z);
	    }
		}