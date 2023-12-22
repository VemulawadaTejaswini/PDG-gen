import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int weight = sc.nextInt();
        int[] w = new int[n];
        long[] v = new long[n];
        for(int i=0;i<n;i++)
        {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        }

        long[][] dp = new long[n+1][weight+1];
        for(int i=0;i<=n;i++)
        {
        	for(int j=0;j<=weight;j++)
        	{
                if(i==0||j==0)
                {
                	dp[i][j] = 0;
                	continue;
                }
        		dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
        		if(j-w[i-1]>=0)
        		{
        			dp[i][j] = Math.max(dp[i][j],dp[i-1][j-w[i-1]]+v[i-1]);
        		}
        	}
        }

        for(int i=0;i<=n;i++)
        {
        	for(int j=0;j<=weight;j++)
        	{
        		System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }

        System.out.println(dp[n][weight]);
 	}
}