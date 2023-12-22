
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
	static int[] dp;
	static ArrayList<Integer>[]gr;
	static int dfs(int node)
	{
		int res=0;
		for(int i=0;i<gr[node].size();i++)
		{
			int y=gr[node].get(i);
			if(dp[y]!=-1)
				res=Math.max(res,1+dp[y]);
			else
				res=Math.max(res,1+dfs(y));
		}
		dp[node]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int n=ar[0];
		int m=ar[1];
		gr=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
		{
			gr[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++)
		{
			ar=split();
			int x=ar[0];
			int y=ar[1];
			gr[x].add(y);
		}
		dp=new int[n+1];
		Arrays.fill(dp, -1);
		for(int i=1;i<=n;i++)
		{
			if(dp[i]!=-1)
				continue;
			dp[i]=dfs(i);
		}
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}
}
