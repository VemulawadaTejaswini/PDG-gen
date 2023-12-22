import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int MAX;
	static Double dp[][];

	static double maxProbility(double ar[], int n, int k)
	{
		if(n==0)
			return (k==0)?1.0: 0;
		if(k==0)
		{
			double prod=1;
			for(int i=0;i<n;i++)
				prod*=(1-ar[i]);
			return prod;
		}

		if(dp[n][k]!=null)
			return dp[n][k];
		
		return ((maxProbility(ar, n-1, k-1)*ar[n-1]) + (maxProbility(ar, n-1, k)*(1-ar[n-1])));
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double ar[]=new double[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextDouble();
		}

		double ans=0;
		dp=new Double[n+1][n+1];

		for(int k=(n/2)+1;k<=n;k++)
		{
			ans += maxProbility(ar, n, k);
		}

		System.out.println(ans);
	}
}