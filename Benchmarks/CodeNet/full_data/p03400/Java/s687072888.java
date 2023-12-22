import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int D = scanner.nextInt();
		    int X = scanner.nextInt();
		    int[] A = new int[N];
		    for(int i = 0; i < N; i++) 
		    {
		    	A[i] = scanner.nextInt();
		    }
		    
		    for(int i = 0; i < N; i++) 
		    {
		    	X = X + (D-1)/A[i] + 1;
		    }
		    System.out.println(X);
		    
		    scanner.close(); }
		  }