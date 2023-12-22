import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int M = scanner.nextInt();
		    int[] moto = new int[N];
		    int sum = 0;
		    
		    for(int i = 0; i < N; i++) 
		    {
		    	moto[i] = scanner.nextInt();
		    	sum = sum + moto[i];
		    }
		    
		    Arrays.sort(moto);
		    System.out.println(N + (M - sum) / moto[0]);
		    scanner.close(); }
		  }