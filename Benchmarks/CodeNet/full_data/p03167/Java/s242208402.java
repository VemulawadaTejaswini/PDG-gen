
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
	static long[][]dp;
	static char[][]mat;
	static long mod=1000000007;
	static long solve(int r,int c)
	{
		if(r>=mat.length || c>=mat[0].length)
			return 0;
		if(mat[r][c]=='#')
			return 0;
		if(r==mat.length-1 && c==mat[0].length-1)
			return 1;
		if(dp[r][c]!=-1)
			return dp[r][c];
		long res=0;
		res=(solve(r+1,c)+solve(r,c+1))%mod;
		dp[r][c]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int n=ar[0];
		int m=ar[1];
		mat=new char[n][m];
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			for(int j=0;j<m;j++)
			{
				mat[i][j]=s.charAt(j);
			}
		}
		dp=new long[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0,0));
	}
}
