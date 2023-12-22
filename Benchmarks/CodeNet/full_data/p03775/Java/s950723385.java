import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	
    public static void main(String args[]) throws Exception
    {
		long n=sc.nextLong();long min=Long.MAX_VALUE;
		
		
		for(long i=1;i*i<=n;i++)
		{
			
			if(n%i==0)
			{
				min=Math.min(min,Math.max(Long.toString(i).length(),Long.toString(n/i).length()));
			}
		}
		
		out.println(min);out.close();
		
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