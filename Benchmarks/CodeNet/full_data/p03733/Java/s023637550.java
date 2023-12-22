import java.io.*;
import java.util.*;
import java.math.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static ArrayList<Integer>[] al;
	static boolean[] v;
	static Pair[] a;
	static List<Integer> list;
	
	static void dfs(int u)
	{
		list.add(u);v[u]=true;
		
		for(int x:al[u])
		{
			if(!v[x])
			{
				dfs(x);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();long t=sc.nextLong();a=new Pair[n];al=new ArrayList[n];
		
		for(int i=0;i<n;i++)
		{	
			long num=sc.nextLong();
			
			a[i]=new Pair(num,num+t);
			
			al[i]=new ArrayList<Integer>();
		}
		
		long res=0;int last=0;
		
		for(int i=0;i<n;i++)
		{	
			if(i+1<n && a[i].r>=a[i+1].l)
			{
				al[i].add(i+1);
			}
		}
		
		v=new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			if(!v[i])
			{
				list=new ArrayList<Integer>();
				
				dfs(i);
				
				res=res+a[list.get(list.size()-1)].r-a[list.get(0)].l;
			}
		}
		
		out.println(res);out.close();
    }
}

class Pair
{
	long l,r;
	
	public Pair(long l,long r)
	{
		this.l=l;this.r=r;
	}
}

class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}