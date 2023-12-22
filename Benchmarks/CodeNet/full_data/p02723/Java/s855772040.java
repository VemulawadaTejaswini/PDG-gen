import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
		String n = sc.nextLine(); 
		
		if (n.charAt(5)==n.charAt(4) && n.charAt(3)==n.charAt(2))
		    System.out.println("Yes");
		    
		else
		    System.out.println("No");
	}
}
