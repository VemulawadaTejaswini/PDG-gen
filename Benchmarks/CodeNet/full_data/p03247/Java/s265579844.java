import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int N = fs.nextInt();
		long parity = -1;
		int[][] pts = new int[N][2];
		for(int i = 0; i < N; i++) {
			long sum = 0;
			for(int j = 0; j < 2; j++) {
				pts[i][j] = fs.nextInt();
				sum += pts[i][j];
			}
			if(i == 0) parity = Math.abs(sum)%2;
			else if(Math.abs(sum)%2 != parity) {
				System.out.println(-1);
				return;
			}
		}
		
		int K = 31;
		long sum = 0;
		long[] d = new long[K];
		int ptr = 0;
		if(parity == 0) {
			K++;
			d = new long[K];
			d[ptr++] = 1L;
		}
		long val = 1L;
		while(ptr < K) {
			d[ptr++] = val;
			val *= 2L;
		}
		for(int i = 0; i < K; i++) sum += d[i];
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		char[] map = {'L', 'R', 'D', 'U'};
		
		out.println(K);
		for(int i = 0; i < K; i++) {
			if(i > 0) out.print(" ");
			out.print(d[i]);
		}
		out.println();
		for(int i = 0; i < N; i++) {
			char[] res = new char[K];
			long curX = pts[i][0], curY = pts[i][1];
			long curSum = sum;
			for(int j = K-1; j >= 0; j--) {
				curSum -= d[j];
				boolean did = false;
				for(int k = 0; k < 4; k++) {
					long nX = curX+dx[k]*d[j];
					long nY = curY+dy[k]*d[j];
					long par = (Math.abs(nX)+Math.abs(nY)) % 2;
					if((Math.abs(nX)+Math.abs(nY) > curSum) && !(nX == 0 && nY == 0)) continue;
					if(par != parity && !(nX == 0 && nY == 0)) continue;
					curX = nX;
					curY = nY;
					res[j] = map[k^1];
					did = true;
					break;
				}
				if(!did) break;
			}
			String print = "";
			for(int j = 0; j < res.length; j++) if(res[j] != 0) print += res[j];
			if(parity == 0) {
				int moves = 0;
				while(curX != 0) {
					moves++;
					if(curX > 0) {
						print = "R"+print;
						curX--;
					}
					else if(curX < 0) {
						curX++;
						print = "L"+print;
					}
				}
				while(curY != 0) {
					if(curY > 0) {
						print = "U"+print;
						curY--;
					}
					else if(curY < 0) {
						print = "D"+print;
						curY++;
					}
					moves++;
				}
				if(moves > 2) throw new RuntimeException();
			}
			out.println(print);
		}
		
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