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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++){
		    a[i][0]=sc.nextInt();

		    a[i][1]=sc.nextInt();

		}
		int dp[][]=new int[n+1][w+1];
		for(int i=0;i<=n;i++){
		    for(int j=0;j<=w;j++){
		        if(i==0||j==0)
		        dp[i][j]=0;
		        
		        else if(j<a[i-1][0])
		        dp[i][j]=dp[i-1][j];
		        else
		        dp[i][j]=Math.max(dp[i-1][j],a[i-1][1]+dp[i-1][j-a[i-1][0]]);
		    }
		}
		int x=dp[n][w];
		System.out.println(x);
	}
}
