import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable 
{
	static class InputReader 
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
		new Thread(null, new Main(),"Main",1<<27).start();
	}	
	
	static class Pair
	{
		int p,d;
		public Pair(int p,int d)
		{
			this.p = p;
			this.d = d;
		}
	}
	
	public static void BFS(int i,ArrayList<ArrayList<Integer>> g,HashMap<Integer,Integer> map,boolean visited[])
	{
		visited[i] = true;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(i,0));
		while(q.size()!=0)
		{
			Pair p = q.poll();
			i = p.p;
			Iterator<Integer> it = g.get(i).listIterator();
			while(it.hasNext())
			{
				int x = it.next();
				if(!visited[x])
				{
					visited[x] = true;
					q.add(new Pair(x,p.d+1));
					map.put(p.d+1,map.getOrDefault(p.d+1,0)+1);
				}
			}
		}
	}
	
	public void run()	
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int i,j,k;
		ArrayList<ArrayList<Integer>> g = new ArrayList<>();
		for(i=0;i<=n;i++)
		{
			g.add(new ArrayList<>());
		}
		g.get(x).add(y);
		g.get(y).add(x);
		for(i=1;i<n;i++)
		{
			g.get(i).add(i+1);
			g.get(i+1).add(i);
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(i=1;i<=n;i++)
		{
			boolean visited[] = new boolean[n+1];
			BFS(i,g,map,visited);
		}
		for(i=1;i<=n-1;i++)
		{
			w.println(map.getOrDefault(i,0)/2);
		}
		w.flush();
		w.close();
	}
}