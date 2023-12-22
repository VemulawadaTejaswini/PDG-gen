/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int w=s.nextInt();
		int a[]=new int[n];
		int v[]=new int[n];
		int dp[][]=new int[n+1][w+1];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		    v[i]=s.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
		   for(int j=1;j<=w;j++)
		   {
		       if(a[i-1]<=j)
		       {
		           dp[i][j]=Math.max(v[i-1]+dp[i-1][j-a[i-1]],dp[i-1][j]);
		       }
		       else
		       {
		           dp[i][j]=dp[i-1][j];
		       }
		   }
		}
		System.out.println(dp[n][w]);
	
	}
}
