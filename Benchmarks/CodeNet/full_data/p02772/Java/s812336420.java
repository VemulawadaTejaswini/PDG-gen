import java.io.*;
import java.util.*;
public class Main
{
	final long mod=(long)(1e9+7);
	final int maxn=(int)(1e6);
	
	private void solve()throws IOException
	{
		int n=nextInt();
		boolean flag=true;
		for(int i=1;i<=n;i++)
		{
			int a=nextInt();
			if(a%2==0)
			{
				if(a%3==0 || a%5==0)
					continue;
				else
					flag=false;
			}
		}
	out.println(flag?"APPROVED":"DENIED");
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