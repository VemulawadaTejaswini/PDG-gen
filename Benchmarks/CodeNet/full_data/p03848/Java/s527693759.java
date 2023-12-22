import java.io.*;
import java.util.*;
public class Main
{
	final long mod=(long)(1e9+7);
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n];
		for(int i=1;i<=n;i++)
			a[nextInt()]++;
		long ans=1;
		for(int i=n-1;i>=1;i-=2)
		{
			if(a[i]!=2)
			{
				out.println(0);
				return;
			}
			ans=(ans*2)%mod;
		}
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