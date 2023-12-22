import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main
{
	static class Pair implements Comparable
	{
		int first;
		double second;
		
		public Pair(int f, double s)
		{
			first = f;
			second = s;
		}
		
		public String toString()
		{
			return first + " " + second;
		}
		
		public int compareTo(Object o)
		{
			Pair p2 = (Pair)o;
			if(this.first < p2.first)
				return -1;
			if(this.first > p2.first)
				return 1;
			if(this.second < p2.second)
				return -1;
			if(this.second > p2.second)
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
	
	public static void main(String[] args) throws IOException
	{
		int h = in.nextInt();
		int w = in.nextInt();
		int[] v = new int[200];
		for(int i = 0; i < h; i ++)
		{
			char[] s = in.next().toCharArray();
			for(int j = 0; j < w; j ++)
			{
				v[s[j]] ++;
			}
		}
		Vector <Integer> c = new Vector <Integer> ();
		for(int i = 'a'; i <= 'z'; i ++)
			if(v[i] > 0)
				c.add(v[i]);
		Collections.sort(c);
		boolean ans = true;
		boolean[][] done = new boolean[h][w];
		for(int i = 0; i < h && ans; i ++)
		{
			if(h % 2 != 0 && i == h / 2)
				continue;
			for(int j = 0; j < w && ans; j ++)
			{
				if(w % 2 != 0 && j == w / 2)
					continue;
				if(done[i][j])
					continue;
				boolean f = false;
				for(int x = c.size() - 1; x >= 0; x --)
				{
					if(c.get(x) >= 4)
					{
						f = true;
						c.set(x, c.get(x) - 4);
						done[i][j] = true;
						done[i][w - 1 - j] = true;
						done[h - 1 - i][w - 1 - j] = true;
						done[h - 1 - i][j] = true;
						break;
					}
				}
				//sop(i + " " + j + " " + f + "\n");
				ans = f;
			}
		}
		//sop(ans + "\n");
		if(h % 2 != 0)
		{
			for(int j = 0; j < w && ans; j ++)
			{
				if(w % 2 != 0 && j == w / 2)
					continue;
				if(done[h / 2][j])
					continue;
				boolean f = false;
				for(int x = c.size() - 1; x >= 0; x --)
				{
					if(c.get(x) >= 2)
					{
						f = true;
						c.set(x, c.get(x) - 2);
						done[h / 2][j] = true;
						done[h / 2][w - 1 - j] = true;
						break;
					}
				}
				ans = f;
			}
		}
		//sop(ans + "\n");
		if(w % 2 != 0)
		{
			for(int i = 0; i < h && ans; i ++)
			{
				if(h % 2 != 0 && i == h / 2)
					continue;
				if(done[i][w / 2])
					continue;
				boolean f = false;
				for(int x = c.size() - 1; x >= 0; x --)
				{
					if(c.get(x) >= 2)
					{
						f = true;
						c.set(x, c.get(x) - 2);
						done[i][w / 2] = true;
						done[h - 1 - i][w / 2] = true;
						break;
					}
				}
				ans = f;
			}
		}
		//sop(ans + "\n");
		if(h % 2 != 0 && w % 2 != 0)
		{
			boolean f = false;
			for(int x = c.size() - 1; x >= 0; x --)
			{
				if(c.get(x) >= 1)
				{
					f = true;
					break;
				}
			}
			ans = f;
		}
		sop(ans ? "Yes" : "No");
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