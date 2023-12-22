import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		char[] str = fs.next().toCharArray();
		int n = str.length;
		boolean[] has = new boolean[n];
		for(int i = 0; i < n-1; i++) {
			has[i] = str[i] == 'R' && str[i+1] == 'L';
			if(has[i]) {
				has[i+1] = true;
			}
		}
		int[] where = new int[n];
		for(int i = 0, last = -1; i < n; i++) {
			if(has[i]) last = i;
			if(str[i] == 'L') where[i] = last;
		}
		for(int i = n-1, last = -1; i >= 0; i--) {
			if(has[i]) last = i;
			if(str[i] == 'R') where[i] = last;
		}
		int[] res = new int[n];
		for(int i = 0; i < n; i++) {
			int dist = Math.abs(i-where[i]);
			if(dist % 2 == 1) {
				if(str[where[i]] == 'L') res[where[i]-1]++;
				else res[where[i]+1]++;
			}
			else {
				res[where[i]]++;
			}
		}
		for(int i = 0; i < n; i++) {
			if(i > 0) out.print(" ");
			out.print(res[i]);
		}
		out.println();
		
		out.close();
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