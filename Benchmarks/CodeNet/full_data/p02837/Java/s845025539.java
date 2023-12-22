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
		ArrayList<Pair> al[]= new ArrayList[n+1];
		for(int i=0;i<=n;++i) al[i]=new ArrayList<Pair>();
		
		for(int i=1;i<=n;++i)
		{
			int q=sc.nextInt();
			while(q-->0)
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				al[i].add(new Pair(x,y));
			}
		}
		
		int ans=0;
		int pwr=(int)Math.pow(2,n);
		for(int i=0;i<pwr;++i)
		{
			
			
			HashSet<Integer> honest = new HashSet<>();
			HashSet<Integer> unkind=new HashSet<>();
			boolean f=true;	//if there is any person in both set then set f=false
			int counter=0;
			
			for(int j=0;j<n;++j)
			{
				if((i&(1<<j))>0) 
				{
					counter++;
					honest.add((j+1));
				}
				else unkind.add((j+1));
			}
			
			outer:
			for(int j=0;j<n;++j)
			{
				if((i&(1<<j))>0)
				{
					for(int k=0;k<al[j+1].size();++k)
					{
						Pair p=al[j+1].get(k);
						
						if(p.y==1)
						{
							if(!honest.contains(p.x))
							{
								f=false;
								break outer;
							}
						}
						else
						{
							if(!unkind.contains(p.x))
							{
								f=false;
								break outer;
							}
						}
					}
				}
			}
			
			if(f) ans=Math.max(ans,counter);
			
		}
		w.println(ans);
		
        System.out.flush();
        w.close();
    }
}

class Pair
{
	//x--the number of person   y--the type of query 1 or 2
	int x,y;
	Pair(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
}