import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long N = sc.nextLong();
			
			/*
			for(long k = 2; k <= N; k++) {
				long curr = N;
				while(curr % k == 0) { curr /= k; }
				while(curr >= k) { curr -= k; }
				
				if(curr == 1) {
					System.out.println(k);
				}
			}
			*/

			HashSet<Long> values = new HashSet<Long>();
			values.add(N);
			
			for(long x = 2; x * x <= N; x++) {
				if(N % x != 0) { continue; }
				
				long curr = N;
				while(curr % x == 0) { curr /= x; }
				if(curr % x == 1) {
					values.add(x);
				}
			}
			
			for(long x = 1; x * x <= (N - 1); x++) {
				if((N - 1) % x != 0) { continue; }
				
				if(x != 1) { values.add(x); }
				values.add((N - 1) / x);
			}
			
			// System.out.println(values);
			System.out.println(values.size());
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}
