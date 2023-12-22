import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    int A1 = scanner.nextInt();
		    int A2 = scanner.nextInt();
		    int A3 = scanner.nextInt();
		    
		    int max = A1;
		    int min = A1;
		    if(A2 > max) 
		    {
		    	max = A2;
		    }
		    if(A2 < min) 
		    {
		    	min = A2;
		    }
		    if(A3 > max) 
		    {
		    	max = A3;
		    }
		    if(A3 < min) 
		    {
		    	min = A3;
		    }
		    System.out.println(max - min);
		    scanner.close();}
		  }