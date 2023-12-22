import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int W = scn.nextInt();
		int[]v = new int[n];
		int[]w = new int[n];
		int maxval=0;
		for(int i=0;i<n;i++)
		{
			w[i]=scn.nextInt();
			v[i]=scn.nextInt();
			maxval+=v[i];
		}
		
		long []dp = new long[maxval+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
			for(int j=0;j<n;j++)
			{
				for(int i=maxval;i>=v[j];i--)
				{
			     if(dp[i-v[j]]!=Integer.MAX_VALUE)
					dp[i]=Math.min(dp[i], w[j]+dp[i-v[j]]);
			}
		}
			int max=0;
		for(int i=1;i<maxval+1;i++)
		{
			if(i>max&&dp[i]<=W)
			{
				max=i;
			}
		}
		System.out.println(max);
	}
}
