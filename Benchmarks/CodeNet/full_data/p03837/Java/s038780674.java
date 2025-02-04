import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] X=new int[M];
		int[] Y=new int[M];
		int[] Z=new int[M];
		minigraph G=new minigraph(N);
		for (int i = 0; i < M; i++) {
			X[i]=sc.nextInt()-1;
			Y[i]=sc.nextInt()-1;
			Z[i]=sc.nextInt();
			G.addEdge(X[i], Y[i], Z[i]);
			G.addEdge(Y[i], X[i], Z[i]);
		}
		int[][] d=G.WarshallFloyd();
		int ans=0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (j==X[i]||j==Y[i]) {
					continue;
				}
				if (d[X[i]][j]+d[j][Y[i]]<=Z[i]) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
	static class minigraph {
        int n;
        int[][] distance;
        int INF = Integer.MAX_VALUE / 3;//到達不能点においてはINFとなる
        int[] color;
        public minigraph(int N) {
            n = N;
            color =new int[n];
            distance=new int[n][n];
            for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i==j) {
						distance[i][j]=0;
					}
					else {
						distance[i][j]=INF;
					}
				}
			}
        }
        public void addEdge(int from, int to, int cost) {
            distance[from][to] = cost;
        }
        public int[][] WarshallFloyd() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        distance[j][k] = Math.min(distance[j][k], distance[j][i] + distance[i][k]);
                    }
                }
            }
            return distance;
        }
    }
		static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
