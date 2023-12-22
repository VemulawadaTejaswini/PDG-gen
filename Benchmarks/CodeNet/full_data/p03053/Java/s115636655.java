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
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][] cs=new char[H][];
		for (int i = 0; i < cs.length; i++) {
			cs[i]=sc.next().toCharArray();
		}
		ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
		int[][] d=new int[H][W];
		for (int i = 0; i < d.length; i++) {
			Arrays.fill(d[i],-1);
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (cs[i][j]=='#') {
					d[i][j]=0;
					arrayDeque.addLast(kumi(i, j, W));
				}
			}
		}
		int[] dx= {1,-1,0,0};
		int[] dy= {0,0,1,-1};
		while (!arrayDeque.isEmpty()) {
			int x=arrayDeque.pollFirst();
			int i=x/W;
			int j=x%W;
			for (int j2 = 0; j2 < dy.length; j2++) {
				if (j+dx[j2]>=0&&j+dx[j2]<W&&i+dy[j2]>=0&&i+dy[j2]<H) {
					if (d[i+dy[j2]][j+dx[j2]]!=-1) {
						continue;
					}
					d[i+dy[j2]][j+dx[j2]]=d[i][j]+1;
					arrayDeque.addLast(kumi(i+dy[j2], j+dx[j2], W));
				}
			}
		}
		int max=0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				max=Math.max(max, d[i][j]);
			}
		}
		System.out.println(max);
		System.exit(0);
	}
	static int kumi(int i, int j, int W){
        return i*W+j;//W列の２次配列を一次元にする
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
