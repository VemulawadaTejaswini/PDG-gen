

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double prob[]=new double[n+1];
		for(int i=1;i<=n;i++)
		{
			prob[i]=scan.nextDouble();
		}
		double dp[][]=new double[n+1][n+1];
		dp[1][0]=1-prob[1];
		dp[1][1]=prob[1];
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				dp[i][j]=dp[i-1][j]*(1-prob[i]);
				
				if(j!=0)
				{
					dp[i][j]+=dp[i-1][j-1]*prob[i];
				}
			}
		}
		double ans=0;
		for(int i=(n+1)/2;i<=n;i++)
		{
			ans+=dp[n][i];
		}
		System.out.print(ans);
	}
}
