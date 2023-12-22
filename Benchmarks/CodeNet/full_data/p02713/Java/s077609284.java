/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{  static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

 static int hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c);

	}
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	    Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  long sum=0;
		  for(int i=1;i<=n;i++)
		    {
		       for(int j=1;j<=n;j++)
		         {
		            for(int k=1;k<=n;k++)
		              sum+=hcf(i,j,k);
		           }
		    }
		 System.out.println(sum); 
	   }     
	catch(Exception e)
		 {}
	}
}
