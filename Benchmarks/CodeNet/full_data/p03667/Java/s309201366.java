import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int m=nextInt();
		int a[]=new int[n+1];
		int freq[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			freq[a[i]]++;
		}
		int covered[]=new int[n+1];
		for(int i=n;i>=1;i--)
		{
			if(freq[i]!=0)
				for(int j=0;j<freq[i] && i-j>=1;j++)
					covered[i-j]++;
		}
		int uncovered=0;
		for(int i=1;i<=n;i++)
			if(covered[i]==0)
				uncovered++;
		for(int i=1;i<=m;i++)
		{
			int x=nextInt();
			int y=nextInt();
			int l=a[x]-freq[a[x]]+1;
			if(l>=1 && covered[l]<=1)
				uncovered++;
			if(l>=1)
				covered[l]--;
			freq[a[x]]--;
			freq[y]++;
			l=y-freq[y]+1;
			if(l>=1 && covered[l]==0)
				uncovered--;
			if(l>=1)
				covered[l]++;
			a[x]=y;
			out.println(uncovered);
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