import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int t,i;	
		int n=sc.nextInt();
		int w=sc.nextInt();
		long dp[][]=new long[n+1][w+1];
		int v[][]=new int[n+1][2];
		for(i=1;i<=n;i++)
		{
			v[i][0]=sc.nextInt();
			v[i][1]=sc.nextInt();
		}
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				int wc=v[i][0];
				if(wc>j)
					dp[i][j]=dp[i-1][j];
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-wc]+v[i][1]);
			}
		}
		System.out.println(dp[n][w]);
	}
}