import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import static java.lang.Math.*;
 
public class Main
{
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
	static LinkedList <Integer> adj[];
    static int co=0,f=0;
    public Main(int n){
        adj=new LinkedList[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new LinkedList();
        }
        
    }
    static void add(int i,int j){
        
        adj[i].add(j);
        adj[j].add(i);
        
    }

    


public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner in=new Scanner(System.in);
    InputReader in=new InputReader(System.in);		
		PrintWriter w=new PrintWriter(System.out);
		
       int n=in.nextInt();
        Main g=new Main(n);
        
      int m=in.nextInt();
        
        for(int i=0;i<m;i++){
            int c=in.nextInt();
            int d=in.nextInt();
            g.add(c,d);
        }
   // w.println(n);
    
    
    int q=in.nextInt();
    
    int ans[]=new int[n+1];
    for(int y=0;y<q;y++){
        
        
        int v[]=new int[n+1];
        int s=in.nextInt();
        int d=in.nextInt();
        int col=in.nextInt();
        ans[s]=col;
        
        
        
        Queue <node> f=new LinkedList();
        node de=new node(s,0);
        f.add(de);
        
        int lvl=0;
        while(!f.isEmpty()){
            
            
            node gl=f.poll();
            
            
            
            Iterator <Integer> it=adj[gl.df].iterator();
            lvl=gl.lvl+1;
            if(lvl>d){
                break;
            }
            while(it.hasNext()){
                int ne=it.next();
                if(v[ne]==0){
                    node fg=new node(ne,lvl);
                    f.add(fg);
                    ans[ne]=col;
         //           w.println(ne+" "+y+" "+gl);
                }
                
                
            }
            
            
            
            
            
            
        }
        
        
        
        
    /*      for(int i=1;i<=n;i++){
        w.println(ans[i]);
    }
  w.println("-----");
      */  
        
        
    }
    
    for(int i=1;i<=n;i++){
        w.println(ans[i]);
    }
   w.close();     
}
    
    
    
    static class node{
        
        int df;
            int lvl;
        node(int x,int y){
            df=x;
            lvl=y;
        }
        
        
    }
    
}