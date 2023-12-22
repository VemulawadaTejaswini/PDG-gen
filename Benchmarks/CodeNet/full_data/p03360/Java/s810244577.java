import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int[] abc = new int[3];
		    abc[0] = scanner.nextInt();
		    abc[1] = scanner.nextInt();
		    abc[2] = scanner.nextInt();
		    int k = scanner.nextInt();
		    
		    Arrays.sort(abc);
		    
		    System.out.println(abc[0] + abc[1] + abc[2] * (int)Math.pow(2, k));
		    
		    scanner.close(); }
		  }