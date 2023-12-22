import java.io.*;
import java.util.*;

public class Main {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	static int n;
	static int[] a, b;
	static Pair[] ps;
	static long ans=Long.MAX_VALUE;
	
	public static void main(String[] args) {
		n=in.nextInt();
		a = new int[n];
		b = new int[n];
		ps = new Pair[n];
		for(int i=0; i<n; ++i) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
			ps[i] = new Pair(a[i], i);
		}
		test();
		for(int i=0; i<n; ++i)
			ps[i] = new Pair(-a[i], i);
		test();
		for(int i=0; i<n; ++i)
			ps[i] = new Pair(b[i], i);
		test();
		for(int i=0; i<n; ++i)
			ps[i] = new Pair(-b[i], i);
		test();
		/*Pair[] ps = new Pair[2*n];
		for(int i=0; i<2*n; ++i)
			ps[i]=new Pair(in.nextInt(), i);
		Arrays.sort(ps);
		long ans=0;
		List<Integer>[] ls = new List[2];
		for(int i=0; i<2; ++i)
			ls[i] = new ArrayList<Integer>();
		long[][] w = new long[n][2];
		for(int i=0; i<n; ++i) {
			ans+=ps[i].a;
			ls[ps[i].b%2].add(ps[i].b/2);
			w[ps[i].b/2][0]=ps[i].a;
		}
		for(int i=n; i<2*n; ++i)
			w[ps[i].b/2][1]=ps[i].a;
		if(ls[0].isEmpty()||ls[1].isEmpty()) {
			System.out.println(ans);
			return;
		}*/
		out.println(ans);
		out.close();
	}
	
	static void test() {
		Arrays.sort(ps);
		long a1=Math.min(a[ps[0].b], b[ps[n-1].b]);
		for(int i=n-1; i>0; --i)
			a1+=Math.min(a[ps[i].b], b[ps[i-1].b]);
		ans=Math.min(a1, ans);
	}
	
	static class Pair implements Comparable<Pair> {
		int a, b;
		Pair(int a, int b) {
			this.a=a;
			this.b=b;
		}
		public int compareTo(Pair o) {
			return a-o.a;
		}
	}
	
	static class StdIn {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;
		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public StdIn(InputStream in) {
			try{
				din = new DataInputStream(in);
			} catch(Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public String next() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == ' ' || c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c=read();
			}
			return s.toString();
		}
		public String nextLine() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c = read();
			}
			return s.toString();
		}
		public int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}
		public int[] readIntArray(int n, int os) {
			int[] ar = new int[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextInt()+os;
			return ar;
		}
		public long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		public long[] readLongArray(int n, long os) {
			long[] ar = new long[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextLong()+os;
			return ar;
		}
		public double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
		private byte read() {
			try{
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			} catch(IOException e) {
				throw new RuntimeException();
			}
		}
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}