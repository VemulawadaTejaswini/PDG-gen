import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		   int count = 0;
		   String  s = scanner.nextLine();
		   
		   for(int i = 0; i < s.length();) 
		   {
			   if(s.substring(i, i + 1 ).equals("+"))
			   {
				   count = count + 1;
			   }
			   else 
			   {
				   count = count - 1;
			   }
				i = i + 1;   
				   
		   }
		    
		   System.out.println(count);
		   
		    scanner.close(); }
		  }