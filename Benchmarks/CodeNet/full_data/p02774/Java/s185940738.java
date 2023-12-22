import java.io.*;
import java.util.*;
public class Main
{
	final long mod=(long)(1e9+7);
	final int maxn=(int)(1e6);
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int k=nextInt();
		int a[]=new int[n+1];
		int next[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=nextInt();
		Arrays.sort(a,1,n+1);
		for(int i=1;i<=n;i++)
		{
			if(a[i]<=0)
				next[i]=n;
			else
				next[i]=i+1;
		}
		PriorityQueue<Pair> queue=new PriorityQueue<>(n,new Comparator<Pair>(){
			public int compare(Pair p,Pair q){
				long x=1l*a[p.first]*a[p.second];
				long y=1l*a[q.first]*a[q.second];
				return x>y?1:-1;
			}
		});
		for(int i=1;i<=n;i++)
		{
			if(next[i]<=n && next[i]>i)
			{
				queue.add(new Pair(i,next[i]));
				if(a[i]<=0)
					next[i]--;
				else
					next[i]++;
			}
		}
		long ans=0;
		while(!queue.isEmpty())
		{
			Pair p=queue.remove();
			ans=(1l*a[p.first]*a[p.second]);
			// out.println(ans);
			k--;
			if(k==0)
				break;
			if(next[p.first]<=n && next[p.first]>p.first)
			{
				queue.add(new Pair(p.first,next[p.first]));
				if(a[p.first]>0)
					next[p.first]++;
				else
					next[p.first]--;
			}
		}
		out.println(ans);
	}
	class Pair{
	    int first,second;
	    Pair(int a,int b){
	        first=a;
	        second=b;
	    }
	    public String toString()
	    {
	    	return first+" "+second;
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