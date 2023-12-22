import java.io.*;
import java.util.*;
public class Main
{
	String s;
	int n;
	boolean visited[];
	int finalpos[],walk[];
	private void solve()throws IOException
	{
		s=nextLine();
		n=s.length();
		visited=new boolean[n+1];
		finalpos=new int[n+1];
		walk=new int[n+1];
		for(int i=1;i<=n;i++)
			if(visited[i]==false)
				dfs(i);
		int count[]=new int[n+1];
		for(int i=1;i<=n;i++)
			count[finalpos[i]]++;
		for(int i=1;i<=n;i++)
			out.print(count[i]+" ");
		out.println();
	}
	void dfs(int v)
	{
		visited[v]=true;
		if(s.charAt(v-1)=='L')
		{
			if(s.charAt(v-2)=='R')
			{
				walk[v]=0;
				finalpos[v]=v;
				if(visited[v-1]==false)
					dfs(v-1);
			}
			else
			{
				if(visited[v-1]==false)
					dfs(v-1);
				walk[v]=1+walk[v-1];
				if(walk[v]%2==0)
					finalpos[v]=finalpos[v-walk[v]];
				else
					finalpos[v]=finalpos[v-walk[v]]-1;
			}
		}
		else
		{
			if(s.charAt(v)=='L')
			{
				walk[v]=0;
				finalpos[v]=v;
				if(visited[v+1]==false)
					dfs(v+1);
			}
			else
			{
				if(visited[v+1]==false)
					dfs(v+1);
				walk[v]=1+walk[v+1];
				if(walk[v]%2==0)
					finalpos[v]=finalpos[v+walk[v]];
				else
					finalpos[v]=finalpos[v+walk[v]]+1;
			}
		}
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