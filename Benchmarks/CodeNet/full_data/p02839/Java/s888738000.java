
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
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int h=ar[0];
		int w=ar[1];
		int[][]a =new int[h][w];
		int[][]b=new int[h][w];
		for(int i=0;i<h;i++)
		{
			ar=split();
			for(int j=0;j<w;j++)
			{
				a[i][j]=ar[j];
			}
		}
		for(int i=0;i<h;i++)
		{
			ar=split();
			for(int j=0;j<w;j++)
			{
				b[i][j]=ar[j];
			}
		}
		boolean[][][]dp=new boolean[h][w][1280];
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				Arrays.fill(dp[i][j], false);
			}
		}
		dp[0][0][Math.abs(a[0][0]-b[0][0])]=true;
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				for(int k=0;k<1280;k++)
				{
					if(!dp[i][j][k])
						continue;
					if(i+1<h)
					{
						dp[i+1][j][k+Math.abs(a[i+1][j]-b[i+1][j])]=true;
						dp[i+1][j][Math.abs(k-Math.abs(a[i+1][j]-b[i+1][j]))]=true;
					}
					if(j+1<w)
					{
						dp[i][j+1][k+Math.abs(a[i][j+1]-b[i][j+1])]=true;
						dp[i][j+1][Math.abs(k-Math.abs(a[i][j+1]-b[i][j+1]))]=true;
					}
				}
			}
		}
		int ans=1000000000;
		for(int i=0;i<1280;i++)
		{
			if(dp[h-1][w-1][i])
				ans=Math.min(ans,i);
		}
		System.out.println(ans);
	}
}
