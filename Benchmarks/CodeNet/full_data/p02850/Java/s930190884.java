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
            while (!isSpaceChar(c) && c != '.') {
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
	// **just change the name of class from Main to reuquired**
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		
		int n=sc.nextInt();
		ArrayList<Integer> al[]= new ArrayList[n+1];
		for(int i=0;i<=n;++i) al[i]=new ArrayList<Integer>();
	
		int max=0;
		int edge[][]=new int[n-1][2];
		for(int i=0;i<n-1;++i)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			edge[i][0]=a;
			edge[i][1]=b;
			al[a].add(b);
			al[b].add(a);
			max=Math.max(al[a].size(),max);
			max=Math.max(al[b].size(),max);
		}
		
		HashMap<Pair,Integer> ans = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();
		queue.add(new Pair(1,0));
		boolean visited[]= new boolean[n+1];
		visited[1]=true;
		
		while(!queue.isEmpty())
		{
			Pair p=queue.pollFirst();
			int node=p.node;
			int color=p.edgeColor;
			
			int c=1;
			for(int child:al[node])
			{
				if(!visited[child])
				{
					if(color==c) c++;
					ans.put(new Pair(node,child),c);
					queue.add(new Pair(child,c));
					visited[child]=true;
					c++;
				}
			}
		}
		
		w.println(max);
		
		for(int i=0;i<n-1;++i)
		{
			if(ans.containsKey(new Pair(edge[i][0],edge[i][1]))) w.println(ans.get(new Pair(edge[i][0],edge[i][1])));
			else w.println(ans.get(new Pair(edge[i][1],edge[i][0])));
		}
		
        System.out.flush();
        w.close();
    }
}

class Pair
{
	int node,edgeColor;
	Pair(int n, int e)
	{
		node=n;
		edgeColor=e;
	}
	
	public int hashCode()
	{
		return node*31+edgeColor;
	}
	
	public boolean equals(Object other)
	{
		if(other instanceof Pair)
		{
			Pair p=(Pair)other;
			if(this.node==p.node && this.edgeColor==p.edgeColor) return true;
			else return false;
		}
		else return false;
	}
}