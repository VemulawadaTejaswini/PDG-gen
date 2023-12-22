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
	
	static TreeSet<Integer> indices[]= new TreeSet[3];
	
	static long function(int i, int j, int suf[], int n)
	{
		long ans=0;
		
		for(int c1_index: indices[i])
		{
			for(int c2_index: indices[j])
			{
				if(c2_index>c1_index)
				{
					int diff=c2_index-c1_index;
					if(c2_index+diff>=n) ans+=suf[c2_index];
					else
					{
						ans+=suf[c2_index]-suf[c2_index+diff];
						ans+=suf[c2_index+diff+1];
					}
				}
				
				//System.out.println("c1_index:"+c1_index+" c2_index:"+c2_index+" ans:"+ans);
			}
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
		
		int n=sc.nextInt();
		char ch[]=sc.next().toCharArray();
		for(int i=0;i<3;++i) indices[i]= new TreeSet<Integer>();
		/*TreeSet<Integer> rIndices = new TreeSet<>();
		TreeSet<Integer> gIndices = new TreeSet<>();
		TreeSet<Integer> bIndices = new TreeSet<>();*/
		
		int blue_counter[]= new int[n+1];
		int green_counter[]= new int[n+1];
		int red_counter[]= new int[n+1];
		
		for(int i=n-1;i>=0;--i)
		{
			if(ch[i]=='B') blue_counter[i]=blue_counter[i+1]+1;
			else blue_counter[i]=blue_counter[i+1];
			
			if(ch[i]=='R') red_counter[i]=red_counter[i+1]+1;
			else red_counter[i]=red_counter[i+1];
			
			if(ch[i]=='G') green_counter[i]=green_counter[i+1]+1;
			else green_counter[i]=green_counter[i+1];
		}
		
		//System.out.println(Arrays.toString(blue_counter));
		
		for(int i=0;i<ch.length;++i)
		{
			if(ch[i]=='R') indices[0].add(i);
			if(ch[i]=='G') indices[1].add(i);
			if(ch[i]=='B') indices[2].add(i);
		}
		
		
		long ans=0;
		
		
		/*for(int r_index: rIndices)
		{
			for(int g_index: gIndices)
			{
				//System.out.println("r_index:"+r_index+" g_index:"+g_index);
				
				if(g_index>r_index)
				{
					
					int diff=g_index-r_index;
					if(g_index+diff>=n) ans+=blue_counter[g_index];
					else
					{
						ans+=blue_counter[g_index]-blue_counter[g_index+diff];
						ans+=blue_counter[g_index+diff+1];
					}
					
				}
			}
		}*/
		
		
		//0 red
		//1 greed
		// 2 blue
		ans+=function(0,1,blue_counter,n);
		ans+=function(0,2,green_counter,n);
		ans+=function(1,0,blue_counter,n);
		ans+=function(1,2,red_counter,n);
		ans+=function(2,0,green_counter,n);
		ans+=function(2,1,red_counter,n);
		
		w.println(ans);
		
        System.out.flush();
        w.close();
    }
}