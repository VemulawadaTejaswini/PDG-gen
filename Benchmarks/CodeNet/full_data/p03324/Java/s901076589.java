import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		   String d = scanner.next();
		   String n = scanner.next();
		   int D = Integer.parseInt(d);
		   int N = Integer.parseInt(n);
		  
		   if(D == 0)
		   {
			   if(N == 100) 
			   {
				   System.out.println(101);
			   }
			   else 
			   {
				   System.out.println(N);
			   }
		   }
		   if(D == 1) 
		   {
			   if(N == 100) 
			   {
				   System.out.println(10100);
			   }
			   else 
			   {
				   System.out.println(N * 100);
			   }
		   }
		   if(D == 2) 
		   {
			   if(N == 100) 
			   {
				   System.out.println(1010000);
			   }
			   else 
			   {
				   System.out.println(N * 10000);
			   }
		   }
        	scanner.close();}
		  }