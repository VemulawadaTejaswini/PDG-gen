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
	
	
	// if modulo is required set value accordingly
	public static long[][] matrixMultiply2dL(long t[][],long m[][])
	{
		long res[][]= new long[t.length][m[0].length];
		
		for(int i=0;i<t.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				res[i][j]=0;
				for(int k=0;k<t[0].length;k++)
				{
					res[i][j]+=t[i][k]+m[k][j];
				}
			}
		}
		
		return res;
	}
	
	static long combination(long n,long r)
	{
		long ans=1;
		for(long i=0;i<r;i++)
		{
			ans=(ans*(n-i))/(i+1);
		}
		return ans;
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
		
		int a[][]= new int[3][3];
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j) a[i][j]=sc.nextInt();
		}
		boolean b[][]= new boolean[3][3];
		int n=sc.nextInt();
		while(n-->0)
		{
			int q=sc.nextInt();
			
			outer:
			for(int i=0;i<3;++i)
			{
				for(int j=0;j<3;++j)
				{
					if(a[i][j]==q)
					{	
						b[i][j]=true;
						break;
					}
				}
			}
		}
		
		boolean isBingo=false;
		for(int i=0;i<3;++i)
		{
			if(b[i][0] && b[i][1] && b[i][2])
			{
				isBingo=true;
				break;
			}
			
			if(b[0][i] && b[1][i] && b[2][i])
			{
				isBingo=true;
				break;
			}
			
		}
		
		if(b[0][0] && b[1][1] && b[2][2]) isBingo=true;
		else if(b[0][2] && b[1][1] && b[2][0]) isBingo=true;
		
		if(isBingo) w.println("Yes");
		else w.println("No");
		
        System.out.flush();
        w.close();
    }
}