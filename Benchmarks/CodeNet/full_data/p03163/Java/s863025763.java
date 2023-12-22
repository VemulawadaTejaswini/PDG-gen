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
		int w=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++){
		   a[i][0]=sc.nextInt();
		   a[i][1]=sc.nextInt();
		}
		
		int dp[][]=new int[n+1][w+1];
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=w;j++){
		        if((j-a[i-1][0])>=0){
		            dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-a[i-1][0]]+a[i-1][1]);
		        }
		        else
		        dp[i][j]=dp[i-1][j];
		    }
		}
		System.out.println(dp[n][w]);
		
	}
}
