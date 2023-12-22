/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[]arr=new double[n];
		double[][]dp=new double[n+1][n+1];
		dp[0][0]=1;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextDouble();
		}
		for(int j=1;j<=n;j++){
		    dp[j][0]=dp[j-1][0]*(1-arr[j-1]);
		}
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++)
		        dp[i][j]=arr[i-1]*dp[i-1][j-1]+(1-arr[i-1])*dp[i-1][j];
		}
		double sum=0.0;
		for(int i=n;i>n/2;i--)
		    sum+=dp[n][i];
		System.out.println(sum);
	}
}
