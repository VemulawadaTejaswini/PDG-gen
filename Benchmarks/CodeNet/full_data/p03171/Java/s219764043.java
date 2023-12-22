import java.util.*;
public class Main
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int dp[][]=new int[n+1][n+1];
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i;j<n;j++)
			{
				if(j==i)
					dp[i][j]= a[i];
				else
				dp[i][j]=Math.max(a[i]-dp[i+1][j],a[j]-dp[i][j-1]);
			}
		}
		
		System.out.println(dp[0][n-1]);
	}
}