import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

import javax.crypto.Cipher;
import javax.naming.InitialContext;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[][] A=new int[H][W];
		int[][] B=new int[H][W];
		for (int i = 0; i < B.length; i++) {
			A[i]=sc.nextIntArray(W);
		}
		for (int i = 0; i < B.length; i++) {
			B[i]=sc.nextIntArray(W);
		}
		boolean[][][] dp=new boolean[H][W][(H+W)*80+1];//
		dp[0][0][Math.abs(A[0][0]-B[0][0])]=true;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i+1<H) {
					int k=Math.abs(A[i+1][j]-B[i+1][j]);
					for (int j2 = 0; j2 <= (H+W)*80 ; j2++) {
						if (Math.abs(j2+k)<=(H+W)*80) {
							dp[i+1][j][Math.abs(j2+k)]|=dp[i][j][j2];
						}
						dp[i+1][j][Math.abs(j2-k)]|=dp[i][j][j2];
					}
				}
				if (j+1<W) {
					int k=Math.abs(A[i][j+1]-B[i][j+1]);
					for (int j2 = 0; j2 <= (H+W)*80 ; j2++) {
						if (Math.abs(j2+k)<=(H+W)*80) {
							dp[i][j+1][Math.abs(j2+k)]|=dp[i][j][j2];
						}
						dp[i][j+1][Math.abs(j2-k)]|=dp[i][j][j2];
					}
				}
			}
		}
		for (int i = 0; i <(H+W)*80; i++) {
			if (dp[H-1][W-1][i]) {
				System.out.println(i);
				return;
			}
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