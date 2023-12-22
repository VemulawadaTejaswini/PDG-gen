import java.io.*;
import java.util.*;
class pers
{
	boolean isr=true;
	int par;
	long dist=0;
}
public class Main
{
	static void pars(int par, int chi, int dist)
	{
		if(pe[par].isr&&pe[chi].isr)
		{
	//		System.out.println("hola");
			pe[chi].isr=false;
	//		System.out.println(chi+" "+pe[chi].isr);
			pe[chi].par=par;
			pe[chi].dist=dist;
		}
		else if(fp(par)==fp(chi)&&(dist!=pe[chi].dist-pe[par].dist))
		{
				poss=false;
			
		}
		else if(pe[par].isr)
		{
			if(pe[chi].dist<dist)
			{pe[pe[chi].par].par=par;
			pe[pe[chi].par].isr=false;
			pe[pe[chi].par].dist=dist-pe[chi].dist;
			}
			else
			{
				pe[par].par=pe[chi].par;
				pe[par].isr=false;
				pe[par].dist=pe[chi].dist-dist;
			}
		}
		else if(pe[chi].isr)
		{
			pe[chi].isr=false;
			pe[chi].par=par;
			pe[chi].dist=dist;
		}
		
		else
		{
			if(pe[chi].dist>dist+pe[par].dist)
			{
				pe[pe[par].par].dist=pe[chi].dist-dist-pe[chi].dist;
				pe[pe[par].par].par=pe[chi].par;
			}
			else
			{
				pe[pe[chi].par].dist=dist+pe[par].dist-pe[chi].dist;
				pe[pe[chi].par].par=pe[par].par;
			}
		}
	}
	static boolean poss;
	static int fp(int a)
	{
		if(pe[a].isr)
			return a;
		else
		{
			int te=fp(pe[a].par);
		//	pe[a].par=fp(pe[a].par);
			pe[a].dist=pe[a].dist+pe[pe[a].par].dist;
			pe[a].par=te;
			return pe[a].par;
		}
	}
	static pers[] pe;
	public static void main(String[] args) throws IOException
	{
		Reader in=new Reader();
		poss=true;
		int n=in.nextInt();
		int m=in.nextInt();
	//	int a[]=new int[100000];
		pe=new pers[n+1];
		for(int i=0; i<=n; i++)
			pe[i]=new pers();
		int l,r,d;
		for(int i=0; i<m; i++)
		{
			l=in.nextInt();
			r=in.nextInt();
			d=in.nextInt();
			pars(l, r, d);
		//	for(int j=1; j<=n; j++)
		//	{
		//		System.out.println(pe[j].isr+" "+pe[j].dist+" "+pe[j].par);
		//	}
		}
		if(poss)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	static StringBuilder ans=new StringBuilder();
	static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        StringTokenizer st;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String next() throws IOException
        {
        	while(st==null||!st.hasMoreElements())
        	{
        		try
        		{
        			st=new StringTokenizer(readLine());
        		}
        		catch(IOException e)
        		{
        			e.printStackTrace();
        		}
        	}
        	return
        			st.nextToken();
        }
        public String readLine() throws IOException
        {
            byte[] buf = new byte[65535]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long l() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
}