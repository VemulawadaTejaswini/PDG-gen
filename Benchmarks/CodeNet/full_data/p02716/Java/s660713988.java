import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=998244353;//1000000007;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		long[] A=sc.nextLongArray(N);
		if (N%2==0) {
			long[][] dp=new long[N+1][2];//余分に開けた回数
			dp[1][0]=A[0];
			dp[1][1]=Integer.MIN_VALUE;
			dp[2][1]=A[1];
			dp[2][0]=dp[1][0];
			for (int i = 3; i < dp.length; i++) {
				dp[i][0]=dp[i-2][0]+A[i-1];
				dp[i][1]=Math.max(dp[i-3][0],dp[i-2][1])+A[i-1];
			}
			System.out.println(Math.max(dp[N-1][0], dp[N][1]));
		}else {
			long[][] dp=new long[N+1][3];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					dp[i][j]=Integer.MIN_VALUE;
				}
			}
			dp[1][0]=A[0];
			dp[2][1]=A[1];
			dp[3][2]=A[2];
			for (int i = 4; i < dp.length; i++) {
				dp[i][0]=dp[i-2][0]+A[i-1];
				dp[i][1]=Math.max(dp[i-3][0],dp[i-2][1])+A[i-1];
				dp[i][2]=Math.max(dp[i-2][2], Math.max(dp[i-3][1], dp[i-4][0]))+A[i-1];
			}
			System.out.println(Math.max(dp[N][2], Math.max(dp[N-1][1], dp[N-2][0])));
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
