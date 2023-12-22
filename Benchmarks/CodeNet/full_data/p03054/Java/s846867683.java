import java.util.*;
import java.io.*;
import static java.lang.Math.*;

/* spar5h */

public class Main implements Runnable{    
	
	public void run() {
		
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		int r = s.nextInt(), c = s.nextInt(), n = s.nextInt();
		
		int xi = s.nextInt() - 1, xj = s.nextInt() - 1;
		
		char[] a = s.next().toCharArray();
		char[] b = s.next().toCharArray();
		
		boolean res = true;
		
		int curr = xi;
		
		//D
		for(int i = 0; i < n; i++) {
		
			if(a[i] == 'D')
				curr++;
			
			if(curr == r) {
				res = false; break;
			}
			
			if(b[i] == 'U' && curr - 1 >= 0)
				curr--;	
		}
		
		curr = xi;
		
		//U
		for(int i = 0; i < n; i++) {
			
			if(a[i] == 'U')
				curr--;
			
			if(curr == -1) {
				res = false; break;
			}
			
			if(b[i] == 'D' && curr + 1 < r)
				curr++;	
		}
		
		curr = xj;
		
		//R
		for(int i = 0; i < n; i++) {
			
			if(a[i] == 'R')
				curr++;
			
			if(curr == c) {
				res = false; break;
			}
			
			if(b[i] == 'L' && curr - 1 >= 0)
				curr--;
		}
		
		curr = xj;
		
		//L
		for(int i = 0; i < n; i++) {
			
			if(a[i] == 'L')
				curr--;
			
			if(curr == -1) {
				res = false; break;
			}
			
			if(b[i] == 'R' && curr + 1 < c)
				curr++;
		}
		
		if(res)
			w.println("YES");
		else
			w.println("NO");
		
		w.close();
	}
	
	static class InputReader {
		
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
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
    
	public static void main(String args[]) throws Exception
	{
		new Thread(null, new Main(),"Main",1<<26).start();
	}
}