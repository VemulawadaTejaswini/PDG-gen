/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static Scanner  in = new Scanner (System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=in.nextInt();
	    if(n<1200){
	    	System.out.println("ABC");
	    }
	    else if(n<2800){
	    	System.out.println("ARC");
	    }
	    else{
	    	System.out.println("AGC");
	    }
	}
	
}