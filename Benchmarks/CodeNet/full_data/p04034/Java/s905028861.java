import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int m=nextInt();
		int cnt[]=new int[n+1];
		boolean red[]=new boolean[n+1];
		Arrays.fill(cnt,1);
		red[1]=true;
		for(int i=1;i<=m;i++)
		{
			int x=nextInt();
			int y=nextInt();
			cnt[x]--;
			cnt[y]++;
			if(red[x])
				red[y]=true;
			if(cnt[x]==0)
				red[x]=false;
		}
		int ans=0;
		for(int i=1;i<=n;i++)
			if(red[i])
				ans++;
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