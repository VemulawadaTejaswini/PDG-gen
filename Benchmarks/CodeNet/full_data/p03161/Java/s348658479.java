import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static Integer dp[];

	static int minimumJumps(int ar[], int i, int k)
	{
		if(i==0)
			return 0;

		if(dp[i]!=null)
			return dp[i];

		int min=Integer.MAX_VALUE;
		int st=Math.max(i-k, 0);

		for(int j=st;j<i;j++)
		{
			if(dp[j]==null)
				min = Math.min(min, minimumJumps(ar, j, k)+Math.abs(ar[i]-ar[j]));
			else
				min = Math.min(min, dp[j]+Math.abs(ar[i]-ar[j]));
		}
		return dp[i]=min;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=scan.nextInt();

		dp=new Integer[n];

		int ans = minimumJumps(ar, ar.length-1, k);
		System.out.println(ans);
	}
}