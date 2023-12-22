import java.io.*;
import java.util.*;
public class Main
{
	int n,c,ans[],set[];
	ArrayList<Integer> list[];
	private void solve()throws IOException
	{
		n=nextInt();
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<n;i++)
		{
			int u=nextInt();
			int v=nextInt();
			list[u].add(v);
			list[v].add(u);
		}
		ans=new int[n+1];
		ans[0]=1;
		set=new int[3];
		set[0]=3;set[1]=1;set[2]=2;
		dfs(1,0);
		for(int i=1;i<=n;i++)
			out.print(ans[i]+" ");
	}
	void dfs(int v,int p)
	{
		if(ans[p]%3==1)
			ans[v]=next(2);
		else if(ans[p]%3==2)
			ans[v]=next(1);
		else
			ans[v]=next(0);
		if(ans[v]==-1)
		{
			System.out.println(-1);
			System.exit(0);
		}
		for(int vv:list[v])
		{
			if(vv!=p)
				dfs(vv,v);
		}
	}
	int next(int x)
	{
		if(set[x]>n)
			x=0;
		if(set[x]>n)
			return -1;
		set[x]+=3;
		return set[x]-3;
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