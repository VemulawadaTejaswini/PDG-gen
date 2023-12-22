import java.io.*;
import java.util.*;
public class Main
{
	final long inf=(long)(1e18+1);
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n+1];
		char op[]=new char[n+1];
		for(int i=1;i<=n;i++)
		{
			if(i==1)
				op[i]='+';
			else
				op[i]=nextToken().charAt(0);
			a[i]=nextInt();
		}
		//dp[i][j] is the max value of expr[1..i] such that there are j parenthesis enclosing a[i]
		long dp[][]=new long[n+1][3];
		for(int i=0;i<=n;i++)
			Arrays.fill(dp[i],-inf);	
		dp[0][0]=0;
		for(int i=1;i<=n;i++)
			for(int j=0;j<=2;j++)
			{
				if(op[i]=='-')
				{
					if(j==0)
						continue;
					for(int k=j-1;k<=2;k++)
						dp[i][j]=Math.max(dp[i][j],dp[i-1][k]+(j%2==0?a[i]:-a[i]));
				}
				else
				{
					for(int k=j;k<=2;k++)
						dp[i][j]=Math.max(dp[i][j],dp[i-1][k]+(j%2==0?a[i]:-a[i]));
				}
			}
		long ans=-inf;
		for(int j=0;j<=2;j++)
			ans=Math.max(ans,dp[n][j]);
		out.println(ans);
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