import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static long  MOD = 1000000007;

	static void updateBIT(long bit[], int i, long val)
	{
		while(i<bit.length)
		{
			bit[i]+=val;
			i+=(i&(-i));
		}
	}

	static long queryBIT(long bit[], int i)
	{
		long ans=0;
		while(i>0)
		{
			ans+=bit[i];
			i-=(i&(-i));
			ans=ans%MOD;
		}
		return ans;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();

		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=scan.nextInt();

		/*
		dp=new Long[n+1][k+1];
		System.out.println(numOfWays(ar, n, k));
		*/

		long dp[][]=new long[n+1][k+1];

		for(int i=0;i<=n;i++)
			dp[i][0]=1;

		long bit[]=new long[k+2];
		updateBIT(bit, 1, 1);

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				int st=Math.max(0, j-ar[i-1]);
				int end=j;

				dp[i][j] = queryBIT(bit, end+1)-queryBIT(bit, st);
			}

			bit=new long[k+2];
			for(int j=0;j<=k;j++)
			{
				updateBIT(bit, j+1, dp[i][j]);
			}
		}

		System.out.println(dp[n][k]);

	}
}