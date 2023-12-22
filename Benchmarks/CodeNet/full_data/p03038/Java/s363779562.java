// Working program using Reader Class 
import java.io.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 

public class Main 
{ 
	static class Reader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 

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
			} while ((c = read()) >= '0' && c <= '9'); 

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
	
	public static long power(long l, long m,long p) 
    { 
		//long p=mod;
        // Initialize result 
        long res = 1;      
         
        // Update x if it is more   
        // than or equal to p 
        l = l % p;  
      
        while (m > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((m & 1)==1) 
                res = (res * l) % p; 
      
            // y must be even now 
            // y = y / 2 
            m = m >> 1;  
            l = (l * l) % p;  
        } 
        return (long)res; 
    } 
	
	public static long mod=998244353;
	
	public static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
	public static long modMult(long a,long b) {
		return ((a%mod)*(b%mod))%mod;
	}
	
	public static long modAdd(long a,long b) {
		return ((a%mod)+(b%mod))%mod;
	}
	
	public static class Node implements Comparable<Node>{
		int left;
		int index;
		Node(int l,int r){
			left=l;
			index=r;
		}
		public int compareTo(Node n) {
			return this.left-n.left;
		}
	}
	
	public static void main(String[] args) throws IOException 
	{ 
		Reader scan=new Reader();
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int n=scan.nextInt();
		int m=scan.nextInt();
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int x=scan.nextInt();
			if(tm.containsKey(x)) {
				tm.put(x, tm.get(x)+1);
			}
			else {
				tm.put(x, 1);
			}
		}
		for(int i=0;i<m;i++) {
			int b=scan.nextInt();
			int c=scan.nextInt();
			while(tm.firstKey()<c && b>0) {
				int key=tm.firstKey();
				int val=tm.get(tm.firstKey());
				int newval=val-Math.min(val,b);
				if(newval==0) {
					tm.remove(tm.firstKey());
				}
				else {
					tm.put(key, newval);
				}
				if(tm.containsKey(c)) {
					tm.put(c,tm.get(c)+Math.min(val,b));
				}
				else {
					tm.put(c, Math.min(val,b));
				}
				b-=Math.min(val,b);
			}
		}
		long sum=0;
		while(tm.isEmpty()==false) {
			long key=(long)tm.firstKey();
			long val=(long)tm.get(tm.firstKey());
			tm.remove(tm.firstKey());
			sum+=key*val;
		}
		out.print(sum);
		out.close();
	} 
} 
