import java.io.*;
import java.util.*;
public class Main
{
	int n,bigmask;
	char s[];
	HashMap<String,Integer> map;
	long ans;
	private void solve()throws IOException
	{
		n=nextInt();
		s=(" "+nextLine()).toCharArray();
		bigmask=(1<<n)-1;
		map=new HashMap<>();
		ans=0;
		init();
		find();
		out.println(ans);
	}
	void init()
	{
		for(int mask=0;mask<=bigmask;mask++)
		{
			StringBuilder red=new StringBuilder();
			StringBuilder blue=new StringBuilder();
			for(int i=1;i<=n;i++)
				if(((mask>>(i-1))&1)==1)
					red.append(s[i]);
				else
					blue.append(s[i]);
			String str=red+"#"+blue;
			map.put(str,map.getOrDefault(str,0)+1);
		}
	}
	void find()
	{
		for(int mask=0;mask<=bigmask;mask++)
		{
			StringBuilder red=new StringBuilder();
			StringBuilder blue=new StringBuilder();
			for(int i=1;i<=n;i++)
				if(((mask>>(i-1))&1)==1)
					red.append(s[n+i]);
				else
					blue.append(s[n+i]);
			String str=blue.reverse()+"#"+red.reverse();
			ans+=map.getOrDefault(str,0);
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