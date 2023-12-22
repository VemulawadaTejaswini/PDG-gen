
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
	static int maxn=101;
	static Pair[] a;
	static Map<Long,Integer> m1=new HashMap<>();
	static Map<Integer,Long> m2=new HashMap<>();
	
	@SuppressWarnings("unchecked")
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt(),w=sc.nextInt(),ctr=0;a=new Pair[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=new Pair(sc.nextInt(),sc.nextInt());
			
			if(m1.get((long)a[i].a)==null)
			{
				
				m1.put((long)a[i].a,ctr);
				
				m2.put(ctr++,(long)a[i].a);
			}
		}
		
		while(m2.size()<4)
		{
			m1.put(0L,ctr);m2.put(ctr++,0L);
		}
		
	//System.out.println(m1+" "+m2);
		
		int m=4;al=new ArrayList[m];
		
		for(int i=0;i<m;i++)
		{
			al[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<n;i++)
		{
			int curr = m1.get((long)a[i].a);
			
			al[curr].add(a[i].b);
		}
		
		int[][] pre=new int[m][n+1];
		
		for(int i=0;i<m;i++)
		{
			Collections.sort(al[i],Collections.reverseOrder());int sum=0;
			
			for(int j=0;j<al[i].size();j++)
			{
				sum+=al[i].get(j);
				
				pre[i][j+1]=sum;
			}
		}
		
		long res=0;
		
		for(int i=0;i<=al[0].size();i++)
		{
			for(int j=0;j<=al[1].size();j++)
			{
				for(int k=0;k<=al[2].size();k++)
				{
					long val1=(m2.get(0)*i)+(m2.get(1)*j)+(m2.get(2)*k);
					
					if(val1<=w)
					{
						long now=w-val1;
						
						long curr = pre[0][i]+pre[1][j]+pre[2][k];res=Math.max(res,curr);
						
						for(int x=al[3].size();x>=0;x--)
						{
							if(pre[3][x]<=now)
							{
								res=Math.max(res,curr+pre[3][x]);
							}
						}
					}
				}
			}
		}
		
		out.println(res);out.close();
    }
}

class Pair
{
	int a,b;
	
	public Pair(int a,int b)
	{
		this.a=a;this.b=b;
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