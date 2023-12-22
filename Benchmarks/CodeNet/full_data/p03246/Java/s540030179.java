import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		LetsDoIt in = new LetsDoIt();
//      Scanner in = new Scanner(System.in) ;
//      FastReaderFile in = new FastReaderFile(new FileInputStream("coffee.in")) ;
//      out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("coffee.in")), true) ;
		out = new PrintWriter(new BufferedOutputStream(System.out), true) ;
		int n = in.nextInt() , t = n ;
		Map <Integer , Integer> l = new HashMap() ;
		Map <Integer , Integer> r = new HashMap() ;
		Map <Integer , Integer> rr = new HashMap() ;
		while ( t-- > 0 )
		{
			int a = in.nextInt() ;
			if ( t % 2 == 0 )
			{
				if ( l.containsKey(a) )
					l.put(a, l.get(a) + 1) ;
				else
					l.put(a, 1) ;
			}
			else
			{
				if ( r.containsKey(a) )
					r.put(a, r.get(a) + 1) ;
				else
					r.put(a, 1) ;
			}
			rr.put(a, 1) ;
		}
		int rrr = 0 ,lm = 0 , rm = 0 , lll = 0;
		for ( Map.Entry<Integer, Integer> e : r.entrySet() )
		{
			if ( e.getValue() > rm )
			{
				rm = e.getValue() ;
				rrr = e.getKey()  ;
			}
		}
		for ( Map.Entry<Integer, Integer> e : l.entrySet() )
		{
			if ( e.getValue() > lm )
			{
				lm = e.getValue() ;
				lll = e.getKey() ;
			}
		}
		n /= 2 ;
		if ( lm > n )
			lm = n ;
		if ( rm > n )
			rm = n ;
//		out.println(rm + " " + lm);
		if ( lll == rrr )
		{
			int rmm = 0 , lmm = 0 ;
			for ( Map.Entry<Integer, Integer> e : r.entrySet() )
			{
				if ( e.getValue() > rmm && e.getKey() != lll )
				{
					rmm = e.getValue() ;
					rrr = e.getKey() ;
				}
			}
			for ( Map.Entry<Integer, Integer> e : l.entrySet() )
			{
				if ( e.getValue() > rmm && e.getKey() != lll )
				{
					lmm = e.getValue() ;
					lll = e.getKey() ;
				}
			}
//			out.println(lmm + " " + rmm);
			out.println( 2 * n - Math.max( lm + rmm , rm+lmm) );
			return ;
		}
		if ( rr.size() == 1 )
		{
			out.println(n/2);
			return ;
		}
		out.println(2*n-lm-rm);
	}

    static long nCk( long n, long k )
    {
	    if (k > n) return 0;
	    if (k * 2 > n) k = n-k;
	    if (k == 0) return 1;
	
	    long result = n;
	    for( long i = 2; i <= k; ++i ) {
	        result *= (n-i+1);
	        result /= i;
	    }
	    return result;
    }
    static  boolean isPrime( long n)
    {
        if (n < 2)  return false;
        if (n < 4)  return true;
        
        if (n%2 == 0 || n%3 == 0) return false;

        for (long i = 5 ; i * i <= n ; i = i + 6 )
            if ( n % i == 0 || n % ( i + 2 ) == 0)
                return false ;

        return true;
    }
    static long gcd(long a, long b) 
    {
        return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
    }
    static long lcm(long a, long b)
    {
        long lcm = (a / gcd(a, b)) * b;
        return lcm > 0 ? lcm : -lcm ;
    }
	public static class FastReaderFile
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReaderFile(InputStream in)
        {
            br = new BufferedReader(new
            InputStreamReader(in));
            
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
    public static class LetsDoIt
    {
        BufferedReader br;
        StringTokenizer st;

        public LetsDoIt()
        {
            br = new BufferedReader(new
                                     InputStreamReader(System.in));
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
    public static PrintWriter out;
}