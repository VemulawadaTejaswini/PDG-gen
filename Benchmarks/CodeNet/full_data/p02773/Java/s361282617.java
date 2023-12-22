import java.io.*;
import java.util.*;
public class Main
{
	final long mod=(long)(1e9+7);
	final int maxn=(int)(1e6);
	
	private void solve()throws IOException
	{
		HashMap<String,Integer> map=new HashMap<>();
		int n=nextInt();
		for(int i=1;i<=n;i++)
		{
			String s=nextLine();
			map.put(s,map.getOrDefault(s,0)+1);
		}
		int max=0;
		ArrayList<String> list=new ArrayList<>();
		for(String s:map.keySet())
		{
			int x=map.get(s);
			if(x>max)
			{
				list=new ArrayList<String>();
				list.add(s);
				max=x;
			}
			else if(x==max)
				list.add(s);
		}
		Collections.sort(list);
		for(String s:list)
			out.println(s);
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