import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String moji = scanner.nextLine();
		    
		    if( moji.indexOf("S") != -1 ) 
		    {
		    	if(moji.indexOf("N") != -1 ) 
		    	{
		    		if( moji.indexOf("W") != -1 ) 
				    {
				    	if(moji.indexOf("E") != -1 ) 
				    	{
				    		System.out.println("Yes");
				    	}
				    	else 
				    	{
				    		System.out.println("No");
				    	}
				    }
		    		else 
		    		{
		    			if(moji.indexOf("E") != -1 ) 
				    	{
				    		System.out.println("No");
				    	}
				    	else 
				    	{
				    		System.out.println("Yes");
				    	}
		    		}
		    	}
		    	else 
		    	{
		    		System.out.println("No");
		    	}
		    }
		    else 
		    {

		    	if(moji.indexOf("N") == -1 ) 
		    	{
		    		if( moji.indexOf("W") != -1 ) 
				    {
				    	if(moji.indexOf("E") != -1 ) 
				    	{
				    		System.out.println("Yes");
				    	}
				    	else 
				    	{
				    		System.out.println("No");
				    	}
				    }
		    		else 
		    		{
		    			if(moji.indexOf("E") != -1 ) 
				    	{
				    		System.out.println("No");
				    	}
				    	else 
				    	{
				    		System.out.println("Yes");
				    	}
		    		}
		    	}
		    	else 
		    	{
		    		System.out.println("No");
		    	}
		    }
		    
		    scanner.close(); }
		  }