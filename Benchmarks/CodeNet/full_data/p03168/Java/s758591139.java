
import java.io.*;
import java.util.*;
public class Main{
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
	static int n;
	static double[]arr;
	static double[][]dp;
	static double prob(int ind,int heads)
	{
		if(heads>n-heads)
			return 1;
		if(ind==n)
			return 0;
		if(dp[ind][heads]!=-1)
			return dp[ind][heads];
		double res=(1-arr[ind])*prob(ind+1,heads)+arr[ind]*prob(ind+1,heads+1);
		dp[ind][heads]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		n=cin();
		String[] cmd=br.readLine().split(" ");
		arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Double.valueOf(cmd[i]);
		}
		dp=new double[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], (double)(-1));
		}
		System.out.println(prob(0,0));
	}
}
