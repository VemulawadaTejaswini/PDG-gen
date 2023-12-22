import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		StdIn in = new StdIn();
		String s=in.next();
		Manacher manacher = new Manacher(s);
		long t=1+(long)s.length()*(s.length()+1)/2;
		/*for(int i=1; i<manacher.p.length-1; ++i)
			t-=(manacher.p[i]*2+1+(i+1)%2)/4;
		System.out.println(t);*/
		//System.out.println(Arrays.toString(manacher.p));
		int[] cnt = new int[26];
		for(char c : s.toCharArray())
			++cnt[c-'a'];
		for(int i=0; i<26; ++i)
			t-=(long)cnt[i]*(cnt[i]+1)/2;
		System.out.println(t);
	}
	
	static class Manacher {
	    public int[]  p;  // p[i] = length of longest palindromic substring of t, centered at i
	    private String s;  // original string
	    private char[] t;  // transformed string

	    public Manacher(String s) {
	        this.s = s;
	        preprocess();
	        p = new int[t.length];

	        int center = 0, right = 0;
	        for (int i = 1; i < t.length-1; i++) {
	            int mirror = 2*center - i;

	            if (right > i)
	                p[i] = Math.min(right - i, p[mirror]);
	 
	            // attempt to expand palindrome centered at i
	            while (t[i + (1 + p[i])] == t[i - (1 + p[i])])
	                p[i]++;
	 
	            // if palindrome centered at i expands past right,
	            // adjust center based on expanded palindrome.
	            if (i + p[i] > right) {
	                center = i;
	                right = i + p[i];
	            }
	        }

	    }

	    // Transform s into t.
	    // For example, if s = "abba", then t = "$#a#b#b#a#@"
	    // the # are interleaved to avoid even/odd-length palindromes uniformly
	    // $ and @ are prepended and appended to each end to avoid bounds checking
	    private void preprocess() {
	        t = new char[s.length()*2 + 3];
	        t[0] = '$';
	        t[s.length()*2 + 2] = '@';
	        for (int i = 0; i < s.length(); i++) {
	            t[2*i + 1] = '#';
	            t[2*i + 2] = s.charAt(i);
	        }
	        t[s.length()*2 + 1] = '#';
	    }
	 
	    // longest palindromic substring
	    public String longestPalindromicSubstring() {
	        int length = 0;   // length of longest palindromic substring
	        int center = 0;   // center of longest palindromic substring
	        for (int i = 1; i < p.length-1; i++) {
	            if (p[i] > length) {
	                length = p[i];
	                center = i;
	            }
	        }
	        return s.substring((center - 1 - length) / 2, (center - 1 + length) / 2);
	    }

	    // longest palindromic substring centered at index i/2
	    public String longestPalindromicSubstring(int i) {
	        int length = p[i + 2];
	        int center = i + 2;
	        return s.substring((center - 1 - length) / 2, (center - 1 + length) / 2);
	    }
	}
	
	interface Input {
		public String next();
		public String nextLine();
		public int nextInt();
		public long nextLong();
		public double nextDouble();
	}
	static class StdIn implements Input {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public StdIn(String filename) {
			try{
				din = new DataInputStream(new FileInputStream(filename));
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
			{
				ret = ret * 10 + c - '0';
			}  while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}
		
		public int[] readIntArray(int n) {
			int[] ar = new int[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextInt();
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
			do {
				ret = ret * 10 + c - '0';
			}
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public long[] readLongArray(int n) {
			long[] ar = new long[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextLong();
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