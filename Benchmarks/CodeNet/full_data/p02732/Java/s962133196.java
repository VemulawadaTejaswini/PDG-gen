import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int hash[]=new int[n+1];
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			hash[a[i]]++;
		}
		long ans=0;
		for(int i=1;i<=n;i++)
			ans+=1l*hash[i]*(hash[i]-1)/2;
		for(int i=1;i<=n;i++)
		{

			out.println(ans-(1l*hash[a[i]]*(hash[a[i]]-1)/2)+(1l*(hash[a[i]]-1)*(hash[a[i]]-2)/2));
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