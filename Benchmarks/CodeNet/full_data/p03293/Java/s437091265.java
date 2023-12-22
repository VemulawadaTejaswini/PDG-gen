import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String S = scanner.nextLine();
		    String T = scanner.nextLine();
		    
		    
		    int counter = 0;
		    	
		    	for(int i = 0; i < S.length(); i++ ) 
			    {
		    		String[] arrays = S.split("");
		    		String[] arrayt = T.split("");
		    		Arrays.sort(arrays);
		    		Arrays.sort(arrayt);
		    		if (arrays[i].equals(arrayt[i])) 
		    		{
		    			counter = counter + 1;
		    		} 
			    }
		    
		   if(counter == S.length()) 
		   {
			   System.out.println("Yes");
		   }
		   else 
		   {
			   System.out.println("No");
		   }
		    scanner.close();}
		  }