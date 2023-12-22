
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;


class Main implements Runnable {
	
	long gcd(long a,long b)
    {
    	if(a==0)
    		return b;
    	else
    		return gcd(b%a,a);
    }
	
	class pa
	{
		int x;
		int y;
		int x1;
		int y1;
		
		pa(int a,int b,int c,int d)
		{
			x=a;
			y=b;
			x1=c;
			y1=d;
		}
	}
	public void run(){
		
		InputReader in =  new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int[] xa= {0,1};
		int[] ya= {1,0};
		ArrayList<pa> al=new ArrayList<>();
		int n=in.nextInt();
		int m=in.nextInt();
		
		int[][] a=new int[n+1][m+1];
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
				a[i][j]=in.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(a[i][j]%2!=0)
				{
					for(int k=0;k<2;k++)
					{
						int xx=i+xa[k];
						int yy=j+ya[k];
						
						if(xx>=1 && xx<=n && yy>=1 && yy<=m)
						{
							a[xx][yy]+=1;
							a[i][j]-=1;
							al.add(new pa(i,j,xx,yy));
							break;
						}
					}
				}
			}
		}
		
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
				w.print(a[i][j]+" ");
			
			w.println();
		}*/
		
		
		w.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			pa p=al.get(i);
			w.println(p.x+" "+p.y+" "+p.x1+" "+p.y1);
		}
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
