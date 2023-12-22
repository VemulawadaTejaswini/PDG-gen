import java.io.*;
import java.util.*;
public class Main
{
	static StringBuilder ans = new StringBuilder();
	public static void main(String[] args) throws IOException
	{
		Reader in=new Reader();
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		int index = -1;
		int ans =0;
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
			if(a[i] == 1)
			{
				index = i+1;
			}
		}
		int temp = index;
		if(index - k<=0 && index!=1)
		{
			ans += 1;
		}
		else if(index!=1)
		{
			temp = index-k;
			ans+=1;
			ans += (int)Math.ceil(temp/(k-1));
		}
		if(index!=n && index+k>=n)
		{
			ans+=1;
		}
		else if(index!=n)
		{
			temp = n - index +1;
			temp = n - index;
			ans+=1;
			ans += (int)Math.ceil(temp/(k-1));
		}
		if(k == n)
			ans = 1;
		System.out.println(ans);
	}


	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
    //String multiplication
	static String pr(String a, long b)
	{
		String c="";
		while(b>0)
		{
			if(b%2==1)
				c=c.concat(a);
			a=a.concat(a);
			b>>=1;
		}
		return c;
    }
    // (a^b)%m
    static long powm(long a, long b, long m)
	{
		long an=1;
		long c=a;
		while(b>0)
		{
			if(b%2==1)
				an=(an*c)%m;
			c=(c*c)%m;
			b>>=1;
		}
		return an;
	}
	static class Reader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
        	return Long.parseLong(next());
        }
        public double nextDouble() { 
            return Double.parseDouble(next());
        }
    }
}