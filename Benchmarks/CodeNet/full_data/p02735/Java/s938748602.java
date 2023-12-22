import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int m=nextInt();
		boolean white[][]=new boolean[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			String s=nextLine();
			for(int j=1;j<=m;j++)
				white[i][j]=s.charAt(j-1)=='.';
		}
		int dp[][][]=new int[n+1][m+1][2];
		//dp[i][j][flag]=min no of operations to make path from i,j to n,m such that first operation is free if flag=1
		final int inf=(int)(1e9+1);
		for(int i=n;i>=1;i--)
			for(int j=m;j>=1;j--)
			{
				if(i==n && j==m)
				{
					dp[i][j][0]=white[i][j]?0:1;
					dp[i][j][1]=0;
				}
				else
				{
					if(white[i][j])
					{
						dp[i][j][0]=Math.min(i==n?inf:dp[i+1][j][0],j==m?inf:dp[i][j+1][0]);
						dp[i][j][1]=Math.min(i==n?inf:dp[i+1][j][0],j==m?inf:dp[i][j+1][0]);
					}
					else
					{
						dp[i][j][0]=1+Math.min(i==n?inf:dp[i+1][j][1],j==m?inf:dp[i][j+1][1]);
						dp[i][j][1]=Math.min(i==n?inf:dp[i+1][j][1],j==m?inf:dp[i][j+1][1]);
					}
				}
			}
		out.println(dp[1][1][0]);
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}