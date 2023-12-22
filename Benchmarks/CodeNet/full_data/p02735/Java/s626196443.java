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
	
	static Point find(int dist[][], boolean visited[][], int r, int c)
	{
		int min=Integer.MAX_VALUE;
		int x=-1,y=-1;
		
		for(int i=0;i<r;++i)
		{
			for(int j=0;j<c;++j)
			{
				if(!visited[i][j] && dist[i][j]<min)
				{
					min=dist[i][j];
					x=i;
					y=j;
				}
			}
		}
		
		return new Point(x,y,dist[x][y]);
	}
	
	static void BFS(char ch[][], int dist[][], int r,int c)
	{
		boolean visited[][]= new boolean[r][c];
		
		for(int i=0;i<(r*c)-1;++i)
		{
			
			Point p=find(dist,visited,r,c);
			int x=p.x;
			int y=p.y;
			int d=p.d;
			//System.out.println("x:"+x+" y:"+y);
			
			visited[x][y]=true;
			
			if((x+1)<r)
			{
				if(ch[x+1][y]=='#') dist[x+1][y]=Math.min(dist[x+1][y],d+1);
				else dist[x+1][y]=Math.min(dist[x+1][y],d);
			}
			
			if((y+1)<c)
			{
				if(ch[x][y+1]=='#') dist[x][y+1]=Math.min(dist[x][y+1],d+1);
				else dist[x][y+1]=Math.min(dist[x][y+1],d);
			}
			
			//for(int j=0;j<r;++j) System.out.println(Arrays.toString(dist[j]));
			//System.out.println("*******************");
		}
		
		
		
		/*while(!queue.isEmpty())
		{
			Point p=queue.pollFirst();
			int x=p.x;
			int y=p.y;
			int d=p.d;
			
			
			if(x>=0&&x<r && y>=0 && y<c && !visited[x][y])
			{
				visited[x][y]=true;
				if(ch[x][y]=='#') d++;
				dist[x][y]=Math.min(dist[x][y],d);
				queue.add(new Point(x+1,y,dist[x][y]));
				queue.add(new Point(x,y+1,dist[x][y]));
			}
			
			for(int i=0;i<r;++i) System.out.println(Arrays.toString(dist[i]));
			System.out.println("*******************");
		}*/
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
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		char ch[][]= new char[r][c];
		for(int i=0;i<r;++i) ch[i]=sc.next().toCharArray();
		
		int dist[][]= new int[r][c];
		for(int i=0;i<r;++i) Arrays.fill(dist[i],Integer.MAX_VALUE);
		
		if(ch[0][0]=='#') dist[0][0]=1;
		else dist[0][0]=0;
		
		BFS(ch,dist,r,c);
		w.println(dist[r-1][c-1]);
		
		
		
        System.out.flush();
        w.close();
    }
}

class Point
{
	int x,y,d;
	Point(int i, int j, int dist)
	{
		x=i;
		y=j;
		d=dist;
	}
}