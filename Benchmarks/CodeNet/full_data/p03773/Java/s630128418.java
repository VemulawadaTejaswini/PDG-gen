import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    
		    if(A + B >= 24)
		    {
		    	System.out.println(A + B - 24);
		    }
		    else 
		    {
		    	System.out.println(A + B);
		    }
		    scanner.close(); }
		  }