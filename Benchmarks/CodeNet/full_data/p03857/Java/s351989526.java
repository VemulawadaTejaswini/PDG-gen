import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static Node[] a,b;
	static int[] parent1,parent2;
	static long size[];
	
	static int find1(int u)
	{
		if(parent1[u]==u)
		{
			return u;
		}
		else
		{
			int val=find1(parent1[u]);parent1[u]=val;return val;
		}
	}
	
	static int find2(int u)
	{
		if(parent2[u]==u)
		{
			return u;
		}
		else
		{
			int val=find2(parent2[u]);parent2[u]=val;return val;
		}
	}
	
	static void merge1(int u,int v)
	{
		parent1[v]=u;
	}
	
	static void merge2(int u,int v)
	{
		parent2[v]=u;size[u]+=size[v];
	}
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();a=new Node[m];b=new Node[k];parent1=new int[n+1];parent2=new int[n+1];size=new long[n+1];
		for(int i=1;i<=n;i++)
		{
			parent1[i]=parent2[i]=i;size[i]=1;
		}
		for(int i=0;i<m;i++)
		{
			a[i]=new Node(sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<k;i++)
		{
			b[i]=new Node(sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<m;i++)
		{
			int x=find1(a[i].l),y=find1(a[i].r);
			if(x!=y)
			{
				merge1(x,y);
			}
		}
		for(int i=0;i<k;i++)
		{
			int x=find2(b[i].l),y=find2(b[i].r);
			if(x!=y)
			{
				int x1=find1(x),y1=find1(y);
				if(x1==y1)
				{
					merge2(x,y);
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			long val=size[find2(i)];out.print(val+" ");
		}
		out.println("");out.close();
    }
}
class Node
{
	int l,r;
	public Node(int l,int r)
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