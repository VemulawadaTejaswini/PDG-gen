import java.io.*;
import java.util.*;
public class Main
{
	final long inf=(long)(1e18+1);
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=nextInt();
		//dp[i] is the max sum of elements at even intervals starting at i
		long dp[]=new long[n+1];
		dp[0]=-inf;
		//next[i] is the next element after i to be taken for the dp
		int next[]=new int[n+1];
		int ans=0;
		for(int i=n;i>=1;i--)
		{
			dp[i]=a[i];
			next[i]=n+1;
			for(int j=i+2;j<=n;j+=2)
			{
				if(a[i]+dp[j]>dp[i])
				{
					dp[i]=a[i]+dp[j];
					next[i]=j;
				}
			}
			if(dp[i]>dp[ans])
				ans=i;
		}
		out.println(dp[ans]);
		Stack<Integer> stack=new Stack<>();
		for(int i=1;i<ans;i++)
			stack.push(i);
		int i;
		for(i=ans;next[i]<=n;i=next[i])
		{
			int l=i;
			int r=next[i];
			int mid=(l+r)/2;
			for(int j=l+1;j<=mid;j++)
				stack.push(j);
		}
		for(i=i+1;i<=n;i++)
			stack.push(i);
		out.println(stack.size());
		while(!stack.isEmpty())
			out.println(stack.pop());
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