import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String c1 = scanner.nextLine();
		    String c2 = scanner.nextLine();
		    
		    c1 = c1.substring(2, 3) + c1.substring(1, 2) + c1.substring(0, 1);
		    if( c1.equals(c2) ) 
		    {
		    	System.out.println("Yes");
		    }
		    else 
		    {
		    	System.out.println("No");
		    }
		    
		    scanner.close(); }
		  }