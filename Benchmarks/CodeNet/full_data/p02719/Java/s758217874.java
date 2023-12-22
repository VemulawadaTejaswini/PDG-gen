/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	    Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int k=sc.nextInt();
		  long store=Long.MAX_VALUE;
		  
		 while(n<store)
		      { store=n;
		        n=Math.abs(n-k);
		        
		      }
		  System.out.println(store);     
		       
		    
	   }     
	catch(Exception e)
		 {}
	}
}
