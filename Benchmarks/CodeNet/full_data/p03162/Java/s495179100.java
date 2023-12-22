/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][3];
		for(int i=0;i<n;i++){
		    a[i][0]=sc.nextInt();
		     a[i][1]=sc.nextInt();
		      a[i][2]=sc.nextInt();
		}
		int ah[]=new int[n];
		int ab[]=new int[n];
		int as[]=new int[n];
		ah[0]=a[0][2];
		ab[0]=a[0][1];
		as[0]=a[0][0];
		
		
		for(int i=1;i<n;i++){
		    ah[i]= a[i][2]+Math.max(as[i-1],ab[i-1]);
		      as[i]=a[i][0]+Math.max(ah[i-1],ab[i-1]);
		        ab[i]=a[i][1]+Math.max(as[i-1],ah[i-1]);
		        //	 ans+=Math.max(ah[i],Math.max(as[i],ab[i]));
		}
		int ans=Math.max(ah[n-1],Math.max(as[n-1],ab[n-1]));
		System.out.println(ans);
		
	}
}
