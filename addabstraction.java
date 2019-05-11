import java.util.Scanner;

public class addabstraction {
	 static int x;
	 static int y;
	 static int z;
	 addabstraction(int x,int y,int z)
	    {
	 	   this.x=x;
	 	   this.y=y;
	 	   this.z=z;
	 	   
	    }
	    public static void main(String args[])
	    {
	       System.out.println("Enter two integers");
	       Scanner in = new Scanner(System.in);
	      
	       x = in.nextInt();
	       y = in.nextInt();
	       z = x + y;
	      
	       System.out.println("Sum of the integers = " +z);
	    }
	 }

