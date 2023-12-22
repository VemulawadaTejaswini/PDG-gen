import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main implements Runnable
{
	public static void main(String args[]) throws Exception
	{
		new Thread(null, new Main(),"Main",1<<28).start();
	}
  
	public void run()
	{
		InputReader sc = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);

		char c[]=sc.next().toCharArray();

		int n=c.length;
		long odd[]=new long[n];

		int l=0;
		int r=-1;

		for(int i=0;i<n;i++)
		{
			int k = (int)(i>r ? 0 : Math.min(odd[l+r-i], r-i)) + 1;
			while (i+k < n && i-k >= 0 && c[i+k] == c[i-k])  ++k;
			odd[i] = k--;
			if (i+k > r)
			{
				l = i-k; 
				r = i+k;
			}
		}

		long even[] =new long[n];
		l=0;
		r=-1;

		for (int i=0; i<n; ++i)
		{
			int k = (int)(i>r ? 0 : Math.min(even[l+r-i+1], r-i+1)) + 1;
			while (i+k-1 < n && i-k >= 0 && c[i+k-1] == c[i-k])  ++k;
			even[i] = --k;
			if (i+k-1 > r)
			{
				l = i-k;
				r = i+k-1;
			}
		}

		long total=n*(n+1)/2;
		long temp=0;

		for(long in:odd)
		{
			temp-=(in-1);
			total-=in;
		}

		for(long in:even)
		{
			temp-=in;
			total-=in;
		}

 		long freq[]=new long[26];

 		for(char ch:c)
 			freq[ch-'a']++;

 		for(int i=0;i<26;i++)
 			temp+=(freq[i]*(freq[i]-1))/2;

 		w.println(total-temp+1);
 		w.close();
 	}

 
 	static int gcd(int a,int b)
 	{
 		if(b==0)
 			return a;
 		return gcd(b,a%b);
 	}
 
	static class InputReader
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		
		public InputReader(InputStream stream)
		{
			this.stream = stream;
		}
		
		public int read()
		{
			if (numChars==-1) 
				throw new InputMismatchException();
			
			if (curChar >= numChars)
			{
				curChar = 0;
				try 
				{
					numChars = stream.read(buf);
				}
				catch (IOException e)
				{
					throw new InputMismatchException();
				}
				
				if(numChars <= 0)				
					return -1;
			}
			return buf[curChar++];
		}
	 
		public String nextLine()
		{
			String str = "";
	        try
	        {
				str=new BufferedReader(new InputStreamReader(stream)).readLine();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return str;
		}
		public int nextInt()
		{
			int c = read();
			
			while(isSpaceChar(c)) 
				c = read();
			
			int sgn = 1;
			
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			
			int res = 0;
			do 
			{
				if(c<'0'||c>'9') 
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c)); 
			
			return res * sgn;
		}
		
		public long nextLong() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			long res = 0;
			
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c));
				return res * sgn;
		}
		
		public double nextDouble() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') 
			{
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') 
			{
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) 
				{
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		
		public String readString() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
			
			return res.toString();
		}
	 
		public boolean isSpaceChar(int c) 
		{
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	 
		public String next() 
		{
			return readString();
		}
		
		public interface SpaceCharFilter 
		{
			public boolean isSpaceChar(int ch);
		}
	}
 
} 