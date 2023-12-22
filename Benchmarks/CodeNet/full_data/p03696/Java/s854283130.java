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
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();char[] a=sc.next().toCharArray();
		
		ArrayDeque<Character> ad=new ArrayDeque<>();int curr=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==')')
			{
				curr--;
			}
			
			else
			{
				curr++;
			}
			
			if(curr<0)
			{
				ad.addFirst('(');curr++;
			}
			
			ad.addLast(a[i]);
		}
		
		while(curr>0)
		{
			ad.addLast(')');curr--;
		}
		
		for(char ch:ad)
		{
			out.print(ch);
		}
		
		out.println("");out.close();
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