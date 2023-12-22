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
	
	public static BigDecimal sqrt(BigDecimal x, BigDecimal a, int scale){
		if(scale < 0) { return x; }
		
		final BigDecimal TWO = BigDecimal.valueOf(2);
		return sqrt(x.subtract(x.multiply(x).subtract(a).divide(x.multiply(TWO), BigDecimal.ROUND_HALF_EVEN)), a, scale - 1);
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long a = sc.nextLong();
			final long b = sc.nextLong();
			final long c = sc.nextLong();
			
			final BigDecimal _a = sqrt(BigDecimal.valueOf(Math.sqrt(a)), BigDecimal.valueOf(a), 5);
			final BigDecimal _b = sqrt(BigDecimal.valueOf(Math.sqrt(b)), BigDecimal.valueOf(b), 5);
			final BigDecimal _c = sqrt(BigDecimal.valueOf(Math.sqrt(c)), BigDecimal.valueOf(c), 5);
			
			//System.out.println(_a + " " + _b + " " + _c);
			
			System.out.println(_a.add(_b).compareTo(_c) < 0 ? "Yes" : "No");
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
