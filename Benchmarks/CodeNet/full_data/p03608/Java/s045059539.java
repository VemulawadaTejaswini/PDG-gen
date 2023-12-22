import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main
{
	static class Pair
	{
		int first, second;
		public Pair(int f, int s)
		{
			first = f;
			second = s;
		}
		
		public String toString()
		{
			return first + " " + second;
		}
	}
	
	static class PairComparator implements Comparator <Pair>
	{
		public int compare(Pair p1, Pair p2)
		{
			if(p1.first < p2.first)
				return -1;
			if(p1.first > p2.first)
				return 1;
			if(p1.second < p2.second)
				return -1;
			if(p1.second > p2.second)
				return 1;
			return 0;
		}
	}
	
	static int log2(double a)
	{
		return (int)(Math.log(a) / Math.log(2));
	}
	
	static long gcd(long a, long b)
	{
		long r;
		while((r = a % b) > 0)
		{
			a = b;
			b = r;
		}
		return b;
	}
	
	static class TrieNode
	{
		TrieNode z, o;
		boolean end;
		long count;
		
		public TrieNode()
		{
			 z = null;
			 o = null;
			 count = 0;
			 end = false;
		}
		
		
	}
	
	static int n, m, r;
	static int[] c;
	static int[][] d, g;
	
	static void dijkstra(int startingNode, int currentNode, int previousNode)
	{
		Vector <Integer> toDo = new Vector <Integer> ();
		for(int i = 0; i <= n; i ++)
		{
			if(g[currentNode][i] != Integer.MAX_VALUE && i != previousNode)
			{
				if(d[startingNode][currentNode] + g[currentNode][i] < d[startingNode][i])
				{
					d[startingNode][i] = d[startingNode][currentNode] + g[currentNode][i];
					toDo.add(i);
				}
			}
		}
		for(int i = 0; i < toDo.size(); i ++)
			dijkstra(startingNode, toDo.get(i), currentNode);
	}
	
	static long fun(int currentNode, boolean[] done)
	{
		long ans = Integer.MAX_VALUE;
		for(int i = 0; i < done.length; i ++)
		{
			if(!done[i])
			{
				done[i] = true;
				ans = Math.min(ans, fun(c[i], done) + d[currentNode][c[i]]);
				done[i] = false;
			}
		}
		if(ans == Integer.MAX_VALUE)
		{
			ans = 0;
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException
	{
		n = in.nextInt();
		m = in.nextInt();
		r = in.nextInt();
		c = new int[r];
		d = new int[n + 1][n + 1];
		g = new int[n + 1][n + 1];
		for(int i = 0; i <= n; i ++)
		{
			Arrays.fill(d[i], Integer.MAX_VALUE);
			Arrays.fill(g[i], Integer.MAX_VALUE);
		}
		for(int i = 0; i < r; i ++)
		{
			c[i] = in.nextInt();
		}
		for(int i = 0; i < m; i ++)
		{
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			g[A][B] = C;
			g[B][A] = C;
		}
		for(int i = 0; i < r; i ++)
		{
			d[c[i]][c[i]] = 0;
			dijkstra(c[i], c[i], -1);
		}
		long ans = Integer.MAX_VALUE;
		boolean[] done = new boolean[r];
		for(int i = 0; i < r; i ++)
		{
			done[i] = true;
			ans = Math.min(ans, fun(c[i], done));
			done[i] = false;
		}
		sop(ans);
	}
    
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
	
    static FastReader in = new FastReader();
  
    public static void sop(Object o)
    {
    	System.out.print(o);
    }
}