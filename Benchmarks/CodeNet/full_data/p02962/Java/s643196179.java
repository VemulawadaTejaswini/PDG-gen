import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}
	
	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		String s = fs.next();
		String t = fs.next();
		StringBuilder ns = new StringBuilder();
		ns.append(s);
		while(ns.length() < 2*t.length()) ns.append(s);
		ns.append(ns.toString());
		int[] z = zValues(t+"#"+ns.toString());
		int max = 0;
		
		z = Arrays.copyOfRange(z, t.length()+1, z.length);
		int n = ns.length()/2;
		for(int i = 0; i < n; i++) {
			int runs = 0;
			int sub = 0;
			while(i < z.length && z[i] == t.length()) {
				runs++;
				sub = 1;
				i += z[i];
			}
			i -= sub;
			max = Math.max(max, runs);
		}
		int beat = ns.length()/2;
		if((long)t.length()*max >= beat) max = -1;
		
		
		out.println(max);
		out.close();
	}
	
	int[] zValues(String string) {
		int n = string.length();  char[] s = string.toCharArray();
		int[] z = new int[n];  z[0] = n;
		int L = 0, R = 0;
		int[] left = new int[n], right = new int[n];
		for(int i = 1; i < n; ++i) {
			if(i > R) {
				L = R = i;
				while(R < n && s[R-L] == s[R]) R++;
				z[i] = R - L;  R--;
			} else {
				int k = i-L;
				if(z[k] < R-i+1) z[i] = z[k];
				else {
					L = i;
					while(R < n && s[R-L] == s[R]) R++;
					z[i] = R - L;  R--;
				}
			}
			left[i] = L;  right[i] = R;
		}
		return z;
	}
	
	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}
		
	}

}