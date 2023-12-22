

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int height[]=new int[n];
		long val[]=new long[n];
		long dp[]=new long[n];
		
		for(int i=0;i<n;i++)
			height[i]=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			val[i]=scan.nextLong();
			dp[i]=val[i];
		}
		for(int i=1;i<n;i++)
		{
			int curheight=height[i];
			for(int j=0;j<i;j++)
			{
				if(height[j]<curheight) {
					dp[i]=Math.max(dp[i],dp[j]+val[i]);
				}
			}
		}
		System.out.println(dp[n-1]);
	}
}
