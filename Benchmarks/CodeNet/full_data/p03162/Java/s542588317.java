import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int dp[][]=new int[3][n];
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				dp[0][0]=in.nextInt();
				dp[1][0]=in.nextInt();
				dp[2][0]=in.nextInt();
			}
			else
			{
				dp[0][i]=Math.max(dp[1][i-1], dp[2][i-1])+(in.nextInt());
				dp[1][i]=Math.max(dp[0][i-1], dp[2][i-1])+(in.nextInt());
				dp[2][i]=Math.max(dp[0][i-1], dp[1][i-1])+(in.nextInt());
			}
		}
		System.out.println(Math.max(dp[0][n-1], Math.max(dp[1][n-1], dp[2][n-1])));
	}
}
