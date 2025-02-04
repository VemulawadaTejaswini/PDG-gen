import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

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

		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
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
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args){

		solve_abc160_d();
	}

  	public static void solve_abc160_d(){

		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int[][] d = new int[N][N];
		//for(int i=0;i<N;i++) Arrays.fill(d[i], 2000);
		
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				int d1 = Math.abs(i - j);
				int d2 = Math.abs(X-1-i) + 1 + Math.abs(Y-1 - j);
				int d3 = Math.abs(Y-1-i) + 1 + Math.abs(X-1 - j);
				d[i][j] = Math.min(Math.min(d1, d2), d3);
			}
		}
		
		
	    for(int i=0;i<N;i++){
	    	for(int j=0;j<N;j++){
	    		System.out.print(d[i][j] + " ");
	    	}
	    	System.out.println();
	    }
		
	    int[] sum = new int[N];
	    
	    for(int i=0;i<N;i++){
	    	for(int j=i+1;j<N;j++){
	    		if(d[i][j] < N){
	    			sum[d[i][j]] += 1;
	    		}
	    	}
	    }
	    
	    for(int i=1;i<N;i++){
	    	System.out.println(sum[i]);
	    }
	}
}