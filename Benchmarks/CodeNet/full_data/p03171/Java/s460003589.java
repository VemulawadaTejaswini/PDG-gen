
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
	static long[][]dp;
	static long[]arr;
	static long solve(int i,int j)
	{
		if(i>j)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		long res=0;
		res=Math.max(arr[i]-solve(i+1,j),arr[j]-solve(i,j-1));
		dp[i][j]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int n=cin();
		arr=splitL();
		dp=new long[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0,n-1));
	}
}
