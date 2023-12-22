import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt(), m = fs.nextInt();
		ArrayList<Integer>[] adj = new ArrayList[n];
		for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			adj[u].add(v);
		}
		int s = fs.nextInt()-1, t = fs.nextInt()-1;
		int[][] dist = new int[3][n];
		for(int[] a : dist) Arrays.fill(a, -1);
		dist[0][s] = 0;
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(0); dq.add(s);
		while(!dq.isEmpty()) {
			int j = dq.poll();
			int u = dq.poll();
			for(int v : adj[u]) {
				int j2 = (j+1); if(j2 >= 3) j2 -= 3;
				if(dist[j2][v] == -1) {
					dist[j2][v] = (j2 == 0 ? 1 : 0)+dist[j][u];
					dq.add(j2); dq.add(v);
				}
			}
		}
		out.println(dist[0][t]);
		
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