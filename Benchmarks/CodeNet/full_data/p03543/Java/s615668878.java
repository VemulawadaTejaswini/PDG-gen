public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String s  = scanner.nextLine();
		    if( s.substring(0, 1) == s.substring(1 , 2) && s.substring(2, 3) == s.substring(1 , 2) )
		    {
		    	System.out.println("Yes");
		    }
		    else 
		    {
		    	if( s.substring(3, 4) == s.substring(1 , 2) && s.substring(2, 3) == s.substring(1 , 2) ) 
		    	{
		    		System.out.println("Yes");
		    	}
		    	else 
		    	{
		    		System.out.println("No");
		    	}
		    }
		    scanner.close(); }
		  }