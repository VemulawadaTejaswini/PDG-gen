import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int bekimax = 1;
		    
		    for(int i = 2; i <= Math.sqrt(N); i++) 
		    {
		    	int beki = i * i;
		    	while( beki * i <= N ) 
		    	{
		    		beki = beki * i;
		    	}
		    	if( bekimax < beki ) 
		    	{
		    		bekimax = beki ;
		    	} 
		    }
		    System.out.println(bekimax);
		    
		    scanner.close(); }
		  }