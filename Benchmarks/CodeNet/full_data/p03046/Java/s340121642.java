import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt(), k = fs.nextInt();
		int mx = (1<<n) - 1;
		if(k > mx) {
			System.out.println(-1);
			return;
		}
		
		if(k == 0) {
			for(int i = 0; i < 1<<n; i++) {
				if(i > 0) out.print(" ");
				out.print(i + " " + i);
			}
			out.println();
			out.close();
			return;
		}
		
		Pair[] a = new Pair[(1<<n)/2];
		int idx = 0;
		boolean[] used = new boolean[1<<n];
		for(int i = 0; i < used.length; i++) if(!used[i]) {
			int o = k ^ i;
			a[idx++] = new Pair(i, o);
			used[i] = used[o] = true;
		}
		if(a.length%2 == 1) {
			System.out.println(-1);
			return;
		}
		Arrays.sort(a);
		int[] res = new int[1<<(n+1)];
		
		int[] order1 = {0, 1, 0, 2, 3, 1, 3, 2};
		int[] order2 = {0, 2, 3, 0, 1, 3, 2, 1};
		idx = 0;
		for(int i = 0; i < a.length; i += 2) {
			int[] it = {a[i].a, a[i].b, a[i+1].a, a[i+1].b};
			if(i == 0) {
				for(int v : order1) res[idx++] = it[v];
			}
			else {
				for(int v : order2) res[idx++] = it[v];
			}
		}
		for(int i = 0; i < res.length; i++) {
			if(i > 0) out.print(" ");
			out.print(res[i]);
		}
		out.println();
		
		out.close();
	}
	
	class Pair implements Comparable<Pair> {
		int a, b;
		Pair(int x, int y) { a = x; b = y; }
		public int compareTo(Pair p) {
			return Integer.compare(a, p.a);
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