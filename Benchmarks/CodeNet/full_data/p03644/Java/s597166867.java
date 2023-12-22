import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int count = 0;
		    
		    while( N != 1 ) 
		    {
		    	N = N /2;
		    	count = count + 1;
		    }
		    System.out.println((int) Math.pow(2,count) );
		    scanner.close(); }
		  }