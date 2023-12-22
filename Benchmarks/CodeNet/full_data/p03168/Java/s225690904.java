import java.util.*;
public class Main
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a[]=new double[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextDouble();
		}
		double dp[][]=new double[n+1][n+1];
		dp[0][0]=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0)
					dp[i][j]= (dp[i-1][j]*(1-a[i]));
				else
				dp[i][j]=(dp[i-1][j-1]*a[i]) + (dp[i-1][j]*(1-a[i]));
			}
		}
		double sum=0;
		for(int i=(n+1)/2;i<=n;i++)
			sum+=dp[n][i];
		System.out.println(sum);
	}
}