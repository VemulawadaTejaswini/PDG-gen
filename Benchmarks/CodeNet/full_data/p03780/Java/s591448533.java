import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	static long ans;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] A=sc.nextIntArray(N);
		boolean[][] dp1=new boolean[N+1][5001];
		boolean[][] dp2=new boolean[N+1][5001];
		dp1[0][0]=true;
		dp2[N][0]=true;
		int ans=N;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= 5000; j++) {
				dp1[i][j]=dp1[i-1][j];
				if (j-A[i-1]>=0) {
					dp1[i][j]|=dp1[i-1][j-A[i-1]];
				}
			}
		}
		for (int i = N-1; i >= 0; i--) {
			for (int j = 0; j <= 5000; j++) {
				dp2[i][j]=dp2[i+1][j];
				if (j-A[i]>=0) {
					dp2[i][j]|=dp2[i+1][j-A[i]];
				}
			}
		}
		int[][] bool=new int[N+1][5001];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= 5000; j++) {
				if (dp2[i][j]) {
					bool[i][j]=1;
				}
				if (j>=1) {
					bool[i][j]+=bool[i][j-1];	
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				boolean flag=false;
				if (Math.max(0, K-A[i])-j-1<0) {
					if (bool[i+1][K-1-j]>=1) {
						flag=true;
					}
				}else {
					if (bool[i+1][K-1-j]-bool[i+1][Math.max(0, K-A[i])-j-1]>=1) {
						flag=true;
					}
				}
				if (dp1[i][j]&&flag) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
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
