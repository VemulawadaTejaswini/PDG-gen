import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();

		int fact[]=new int[n+1];
		fact[0]=1;
		for(int i=1;i<=n;i++)
			fact[i]=fact[i-1]*i;
		
		int p[]=new int[n+1];
		for(int i=1;i<=n;i++)
			p[i]=nextInt();

		int q[]=new int[n+1];
		for(int i=1;i<=n;i++)
			q[i]=nextInt();

		int posp=1,posq=1;
		boolean visited[]=new boolean[n+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<p[i];j++)
			{
				if(visited[j])
					continue;
				posp+=fact[n-i];
			}
			visited[p[i]]=true;
		}

		visited=new boolean[n+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<q[i];j++)
			{
				if(visited[j])
					continue;
				posq+=fact[n-i];
			}
			visited[q[i]]=true;
		}

		out.println(Math.abs(posp-posq));
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}