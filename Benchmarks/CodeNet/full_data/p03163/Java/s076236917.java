/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int w=s.nextInt();
		int[]wt=new int[n];
		int[]val=new int[n];
		for(int i=0;i<n;i++){
		    wt[i]=s.nextInt();
		    val[i]=s.nextInt();
		}
		int[][]dp=new int[n+1][w+1];
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=w;j++){
		        if(wt[i-1]<=j){
		            dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
		        }
		        else dp[i][j]=dp[i-1][j];
		    }
		}
	    System.out.println(dp[n][w]);
	}
}
