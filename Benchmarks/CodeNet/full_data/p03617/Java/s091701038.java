import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
public class Main
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
			return 0;
		}
	}
	
	final static int MAXN = (int)1E5;
	
	static int log2(int a)
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
	
	static void print(int[] v)
	{
		if(v == null)
		{
			sop("-\n");
			return;
		}
		for(int i = 0; i < v.length; i ++)
		{
			sop(v[i] + " ");
		}
		sop("\n");
	}
	
	static long[] linearCombination(long a, long b, long[] n1, long[] n2, long[] n3, long q)
	{
		long qq = a / b;
		long rr = a % b;
		if(rr == 0)
		{
			if(n2 == null)
			{
				return new long[] {0, 1};
			}
			return new long[] {n2[0] - q * n3[0], n2[1] - q * n3[1]};
		}
		if(n2 == null)
		{
			return linearCombination(b, rr, n2, n3, new long[] {0, 1}, qq);
		}
		return linearCombination(b, rr, n2, n3, new long[] {n2[0] - q * n3[0], n2[1] - q * n3[1]}, qq);
	}
	
	public static void main(String[] args) throws IOException
	{
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int n = in.nextInt();
		double[] v = {4 * a, 2 * b, c};
		Arrays.sort(v);
		sop(Math.min((long)(v[0] * n), (long)(d / 2.0 * (n - n % 2) + (n % 2 != 0 ? v[0] : 0))));
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