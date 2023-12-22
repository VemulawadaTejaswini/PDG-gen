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
		private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

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
		new Thread(null, new Main(),"Main",1<<26).start();
	}
    long min(long a,long b)
    {   
        if(a<b)
            return a;
        else
            return b;
    }
    int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
	public void run()
	{
		InputReader sc= new InputReader(System.in);
		PrintWriter w= new PrintWriter(System.out);
        int  x1=sc.nextInt();
        int  y1=sc.nextInt();
        int  x2=sc.nextInt();
        int  y2=sc.nextInt();
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {   
            map.put(sc.nextInt(),sc.nextInt());        
        }
        double ans=(long)(Math.abs(x2-x1)+Math.abs(y2-y1));
        ans*=100;
        if((x1==x2)||(y1==y2))
        {
        
            if(y1>y2)
            {
                int temp=y2;
                y2=y1;
                y1=temp;
            }
            if(x1>x2)
            {
                int temp=x2;
                x2=x1;
                x1=temp;
            }
            if(x1==x2)
            {
                if(map.get(x1)!=null&&map.get(x1)>=y1&&map.get(x1)<=y2)
                    ans=ans+((double)Math.PI*(double)10)-((double)20);
            }
            else
            {
                for(int i=x1;i<=x2;i++)
                {
                    if(map.get(i)!=null&&map.get(i)==y1)
                    ans=ans+((double)Math.PI*(double)10)-((double)20);
                }
            }
            w.println(ans);
            w.close();
            return;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int a[]=new int[1],size=0;
        if(y1<y2&&x1<x2)
        {
            for(int i=x1;i<=x2;i++)
            {
                if(map.get(i)!=null&&map.get(i)>=y1&&map.get(i)<=y2)
                    list.add(map.get(i));
            }
            size=list.size();
            if(size==0)
            {
                w.println(ans);
                w.close();
                return;
            }
            else
            {
                a=new int[list.size()];
                for(int i=0;i<list.size();i++)
                    a[i]=list.get(i);
            }
        }
        if(y1<y2&&x1>x2)
        {
            for(int i=x1;i>=x2;i--)
            {
                if(map.get(i)!=null&&map.get(i)>=y1&&map.get(i)<=y2)
                    list.add(map.get(i));
            }
            size=list.size();
            if(size==0)
            {
                w.println(ans);
                w.close();
                return;
            }
            else
            {
                a=new int[list.size()];
                for(int i=0;i<list.size();i++)
                    a[i]=list.get(i);
             }
        }
        if(y1>y2&&x1>x2)
        {
            for(int i=x1;i>=x2;i--)
            {
                if(map.get(i)!=null&&map.get(i)<=y1&&map.get(i)>=y2)
                    list.add(map.get(i));
            }
            size=list.size();
            if(size==0)
            {
                w.println(ans);
                w.close();
                return;
            }
            else
            {
                a=new int[list.size()];
                for(int i=list.size()-1;i>=0;i--)
                    a[list.size()-1-i]=list.get(i);
             }
        }
        if(y1>y2&&x1<x2)
        {
            for(int i=x1;i<=x2;i++)
            {
                if(map.get(i)!=null&&map.get(i)<=y1&&map.get(i)>=y2)
                    list.add(map.get(i));
            }
            size=list.size();
            if(size==0)
            {
                w.println(ans);
                w.close();
                return;
            }
            else
            {
                a=new int[list.size()];
                for(int i=list.size()-1;i>=0;i--)
                    a[list.size()-1-i]=list.get(i);
            }
        }
        double lent=(double)LIS.LongestIncreasingSubsequenceLength(a,size);
        //w.println(ans);
        ans-=(lent*(double)2*(double)10);
        //w.println(ans);
        ans+=(lent*(double)Math.PI*(double)5);
        w.println(ans);
        w.close();		
	}
}
class LIS
{
    // Binary search (note boundaries in the caller)
    // A[] is ceilIndex in the caller
    static int CeilIndex(int A[], int l, int r, int key)
    {
        while (r - l > 1)
        {
            int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
        }
 
        return r;
    }
 
    static int LongestIncreasingSubsequenceLength(int A[], int size)
    {
        // Add boundary case, when array size is one
 
        int[] tailTable   = new int[size];
        int len; // always points empty slot
 
        tailTable[0] = A[0];
        len = 1;
        for (int i = 1; i < size; i++)
        {
            if (A[i] < tailTable[0])
                // new smallest value
                tailTable[0] = A[i];
 
            else if (A[i] > tailTable[len-1])
                // A[i] wants to extend largest subsequence
                tailTable[len++] = A[i];
 
            else
                // A[i] wants to be current end candidate of an existing
                // subsequence. It will replace ceil value in tailTable
                tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
        }
 
        return len;
    }
}