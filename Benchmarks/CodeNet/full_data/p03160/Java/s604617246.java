import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int dp[]=new int[n];
		dp[0]=0;
		for(int i=1;i<n;i++)
		{
			dp[i]=dp[i-1]+Math.abs(a[i]-a[i-1]);
			if(i>1)
				dp[i]=Math.min(dp[i], dp[i-2]+Math.abs(a[i-2]-a[i]));
		}
		System.out.println(dp[n-1]);
	}
}
