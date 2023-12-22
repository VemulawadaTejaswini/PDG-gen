import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int N = fs.nextInt();
		int M = fs.nextInt();
		int[] req = new int[M];
		for(int i = 0; i < M; i++) {
			int k = fs.nextInt();
			while(k-->0) {
				int x = fs.nextInt()-1;
				req[i] |= 1 << x;
			}
		}
		int res =0;
		int[] p = fs.nextIntArray(M);
		for(int mask = 0; mask < (1<<N); mask++) {
			boolean good = true;
			for(int i = 0; i < M; i++) {
				int cnt = 0;
				for(int j = 0; j < N; j++) {
					int on = (1<<j)&mask;
					if(on == 0) continue;
					on = (1<<j) & req[i];
					if(on == 0) continue;
					cnt++;
				}
				good &= (cnt%2) == p[i];
			}
			if(good) res++;
		}
		out.println(res);
		
		out.close();
	}
	
	class X implements Comparable<X>{
		String name;
		int id, score;
		X(String s, int a, int b) {
			name = s;
			id = a; score = b;
		}
		public int compareTo(X x) {
			int comp = name.compareTo(x.name);
			if(comp == 0) comp = Integer.compare(x.score, score);
			return comp;
		}
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