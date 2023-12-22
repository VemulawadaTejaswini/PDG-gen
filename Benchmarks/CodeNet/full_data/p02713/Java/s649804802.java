/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static int printgcd(int i,int j,int k){
        BigInteger b1,b2,b3,b4;
        b1 = BigInteger.valueOf(i);
        b2 = BigInteger.valueOf(j);
        b3 = BigInteger.valueOf(k);
        b4=b1.gcd(b2);
        b4=b4.gcd(b3);
        return b4.intValue();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   long sum = 0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
		    	for(int j=1;j<=n;j++){
		    	    	for(int k=1;k<=n;k++){
		    	    	   sum+=Long.valueOf(printgcd(i,j,k)); 
		    	    	}
		    	}
		}
		System.out.println(sum);
		
		
	}
	
	
}
