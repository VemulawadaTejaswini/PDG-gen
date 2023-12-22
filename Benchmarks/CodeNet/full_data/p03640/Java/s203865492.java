import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int H = reader.nextInt();
		int W = reader.nextInt();
		int N = reader.nextInt();
		int[] A = new int[N+1];
		for(int i=0; i<N; i++) A[i] = reader.nextInt();

		solver(H, W, N, A);
	}
	
	public static void solver(int H, int W, int N, int[] A) {
		// write logic
		int[][] board = new int[H][W];
		int color = 0;
		int remain = 0;
		for(int i=0; i<H; i++) {
		    for(int j=0; j<W; j++) {
		        if(remain == 0) {
		            remain = A[color];
		            color++;
		        }
		        if(i%2 == 0) board[i][j] = color;
		        else board[i][W-1-j] = color;
		        remain--;
		    }
		}
		for(int i=0; i<H; i++) {
		    for(int j=0; j<W; j++) {
		        System.out.print(board[i][j]);
		        if(j != W-1) System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	
	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
