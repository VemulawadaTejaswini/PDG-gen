import java.util.*;
import java.io.*;
 
public class Main
{
/*static int min(int a, int b, int c)
	{
		return Math.min(a, Math.min(b, c));
	}
	static int max(int a, int b, int c)
	{
		return Math.max(a, Math.max(b, c));
	}
	static int max(int b, int c)
	{
		return Math.max(b, c);
	}
	static int min(int b, int c)
	{
		return Math.min(b, c);
	}*/
	public static void main(String[] args) throws IOException
	{
		Reader in=new Reader();
		int n=in.nextInt(),a=in.nextInt(),b=in.nextInt();
		if(n*a<b)
			System.out.println(n*a);
		else
			System.out.println(b);
		/*int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0; i<n; i++)
			{
				a[i]=in.nextInt();
			}
			if(n>4)
			{
				int i;
				for(i=0; i<n-3; i++)
				{
					if(a[i+1]!=a[i])
						b[i]=a[i+1];
					else
					{
						b[i]=a[i+2];
						b[i+1]=a[i+3];
						b[i+2]=a[i+1];
						i+=2;
					}
				}
				
				System.out.println(n);
				for(int i1=0; i1<n; i1++)
					System.out.print(b[i1]+" ");
				System.out.println();
			}
			else if(n==3)
			{
				if(a[0]!=a[1]&&a[1]!=a[2]&&a[0]!=a[2])
					System.out.println("3\n"+a[1]+" "+a[2]+" "+a[0]);
				else
					System.out.println("2\n"+a[1]+" "+a[2]+" "+a[0]);
			}
			else if(n==2)
			{
				if(a[0]!=a[1])
					System.out.println("2\n"+a[1]+" "+a[0]);
				else
					System.out.println("0\n"+a[1]+" "+a[0]);
			}
			else if(n==1)
				System.out.println("0\n"+a[0]);
			else if(n==4)
			{
				int temp=-1,a1=-1,a2=-1,temp2=-1;
				for(int i=0; i<4; i++)
					for(int j=i+1;j<4; j++)
						if(a[i]==a[j])
						{
							temp=a[i];
							break;
						}
				if(temp!=-1)
				{
					for(int i=0; i<4; i++)
					{
						if(temp2==a[i])
						{
							temp2=a[i];
							break;
						}
						if(a[i]!=temp)
							temp2=a[i];
					}
					if(temp2!=-1)
					{
						for(int i=0; i<4; i++)
						{
							if(a[i]==temp)
								b[i]=temp2;
							else
								b[i]=temp;
						}
					}
					else
					{
						for(int i=0; i<4; i++)
						{
							if(a[i]!=temp)
							{
								if(a1==-1)
									a1=a[i];
								else
									a2=a[i];
							}
						}
						for(int i=0; i<4; i++)
						{
							if(a[i]!=temp)
								b[i]=temp;
							else if(a1!=-1)
							{
								b[i]=a1;
								a1=-1;
							}
							else
								b[i]=a2;
						}
					}
				}
				else
				{
					b[0]=a[3];
					b[1]=a[0];
					b[2]=a[1];
					b[3]=a[2];
				}
				System.out.println("4\n"+b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
			}
		}*/
        in.close();
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
	            byte[] buf = new byte[64]; // line length
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
	 
	        public long nextLong() throws IOException
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