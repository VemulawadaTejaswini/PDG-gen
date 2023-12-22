import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	static long ret( int i , int x[] ,long mm[] )
	{
		if ( i == x.length )
			return 0 ;
		if ( i == x.length - 1 )
			return 0 ;
		if ( mm[i] != -1 )
			return mm[i] ;
		long op = Math.abs(x[i]-x[i+1])+ret(i+1,x,mm) , op2 = (long)1e17 ;
		if ( i < x.length - 2 )
			op2 = Math.abs(x[i]-x[i+2])+ret(i+2,x,mm) ;
//		out.println(op+" " + op2);
		return mm[i] = Math.min(op, op2);
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		LetsDoIt in = new LetsDoIt();
//		Scanner in = new Scanner(System.in) ;
//		FastReaderFile in = new FastReaderFile(new FileInputStream("leaves.in")) ;
//		out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("coffee.in")), true) ;
		out = new PrintWriter(new BufferedOutputStream(System.out), true) ;
		int n = in.nextInt() ;
		int x[] = new int[n] ;
		long xx[] = new long[n] ;
		Arrays.fill(xx, -1);
		for ( int i = 0 ; i < n ; ++i )
			x[i] = in.nextInt() ;
		out.println(ret(0,x,xx));
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