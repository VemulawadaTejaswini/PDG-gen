
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
	static long mod=1000000007;
	static ArrayList<Integer>[] gr;
	static int[] vis;
	static long[][]dp;
	static long dfs(int node,int col)
	{
		if(dp[node][col]!=-1)
			return dp[node][col];
		long res=1;
		for(int i=0;i<gr[node].size();i++)
		{
			int y=gr[node].get(i);
			if(vis[y]!=0)
				continue;
			vis[y]=1;
			if(col==0)
			{
				res=(res*(dfs(y,1)+dfs(y,0)))%mod;
			}
			else
				res=(res*dfs(y,0))%mod;
			vis[y]=0;
		}
		dp[node][col]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int n=cin();
		gr=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
		{
			gr[i]=new ArrayList<>();
		}
		for(int i=0;i<n-1;i++)
		{
			int[]ar=split();
			int x=ar[0];
			int y=ar[1];
			gr[x].add(y);
			gr[y].add(x);
		}
		vis=new int[n+1];
		dp=new long[n+1][2];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		vis[1]=1;
		long a=dfs(1,0);
		vis=new int[n+1];
		vis[1]=1;
		dp=new long[n+1][2];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		long b=dfs(1,1);
//		System.out.println(a+" "+b);
		System.out.println((a+b)%mod);
	}
}
