import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int maxn=(int)(3501);
	
	static long gcd(long a,long b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	
    public static void main(String args[]) throws Exception
    {
		double n=sc.nextDouble();int val1=-1,val2=-1,val3=-1;
		
		double[] arr=new double[maxn];
		
		for(int i=1;i<maxn;i++)
		{
			double curr=i;
			
			arr[i]=(1.0/curr);
		}
		
		outer:
		for(double i=1;i<maxn;i++)
		{
			for(double j=1;j<maxn;j++)
			{
				double now=(4.0/n)-(1.0/i)-(1.0/j);
				
				int low=1,high=maxn-1;
				
				while(low<high)
				{
					int mid=(low+high+1)>>1;
					
					if(arr[mid]>=now)
					{
						low=mid;
					}
					else
					{
						high=mid-1;
					}
				}
				
				if(arr[low]==now)
				{
					val1=(int)i;val2=(int)j;val3=low;
					
					break outer;
				}
			}
		}
		
		out.println(val1+" "+val2+" "+val3);out.close();
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