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
	
	static int n,component[];
	static ArrayList<Integer> al[];
	static boolean visited[];
	static HashMap<Integer,Integer> hm;	//component-->size
	
	static void dfs()
	{
		int c=0;
		for(int i=1;i<=n;++i)
		{
			c++;
			if(!visited[i]) dfsUtil(i,c);
		}
	}
	
	static void dfsUtil(int node,int c)
	{
		visited[node]=true;
		component[node]=c;
		for(int child:al[node])
		{
			if(!visited[child]) dfsUtil(child,c);
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
		
		n=sc.nextInt();
		int m=sc.nextInt(),k=sc.nextInt();
		hm=new HashMap<Integer,Integer>();
		visited=new boolean[n+1];
		component=new int[n+1];
		al=new ArrayList[n+1];
		for(int i=0;i<=n;++i) al[i]=new ArrayList<Integer>();
		for(int i=0;i<m;++i)
		{
			int a=sc.nextInt(),b=sc.nextInt();
			al[a].add(b);
			al[b].add(a);
		}
		
		dfs();
		for(int i=1;i<=n;++i)
		{
			hm.put(component[i],hm.getOrDefault(component[i],0)+1);
		}
		
		int block[]=new int[n+1];
		for(int i=0;i<k;++i)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(component[a]==component[b])
			{
				block[a]++;
				block[b]++;
			}
		}
		
		//System.out.println(hm);
		//System.out.println(Arrays.toString(block));
		
		for(int i=1;i<=n;++i)
		{
			int ans=hm.get(component[i])-al[i].size()-block[i]-1;
			w.print(ans+" ");
		}
		
        System.out.flush();
        w.close();
    }
}