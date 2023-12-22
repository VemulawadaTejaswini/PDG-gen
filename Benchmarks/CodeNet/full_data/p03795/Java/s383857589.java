import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		   int N = scanner.nextInt();
		   System.out.println(800 * N - 200 * (N/15) );
		   
		    scanner.close(); }
		  }