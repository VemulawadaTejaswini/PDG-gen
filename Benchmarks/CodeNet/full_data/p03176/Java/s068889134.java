
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[]dp;
	static int[]h;
	static long[]a;
	static int[]vis;
	static long solve(int ind)
	{
		if(ind==a.length)
			return 0;
		if(vis[ind]!=0)
			return dp[ind];
		vis[ind]=1;
		for(int i=ind+1;i<a.length;i++)
		{
			if(h[i]>h[ind])
			{
				 dp[ind]=Math.max(dp[ind],a[ind]+solve(i));
			}
		}
		solve(ind+1);
//		System.out.println(ind+" "+dp[ind]);
		return dp[ind];
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int n=cin();
		h=split();
		a=splitL();
		dp=new long[n+1];
		for(int i=0;i<n;i++)
		{
			dp[i]=a[i];
		}
		vis=new int[n];
		solve(0);
		long ans=0;
		for(int i=0;i<n;i++)
		{
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}
}
