import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		char s[]=(" "+nextLine()).toCharArray();
		int freq[]=new int[128];
		for(int i=1;i<=n;i++)
			freq[s[i]]++;
		long ans=1l*freq['R']*freq['G']*freq['B'];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;i-j>=1 && i+j<=n;j++)
				if(s[i]!=s[i-j] && s[i]!=s[i+j] && s[i-j]!=s[i+j])
					ans--;
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