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
		int n=sc.nextInt(),x=sc.nextInt();int[] a=new int[n];long res=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]>x)
		{
			res+=a[0]-x;a[0]=x;
		}
		for(int i=1;i<n;i++)
		{
			if(a[i]+a[i-1]>x)
			{
				int curr=x-a[i-1];
				res+=(a[i]-curr);a[i]=curr;
			}
		}
		out.println(res);out.close();
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