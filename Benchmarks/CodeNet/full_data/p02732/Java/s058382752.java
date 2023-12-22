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
			final int N = sc.nextInt();
			
			int[] array = new int[N]; 
			int[] values = new int[N + 1];
			
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextInt();
				values[array[i]]++;
			}
			
			long[] all = new long[N + 1];
			long[] selected = new long[N + 1];
			for(int i = 0; i <= N; i++) {
				final long v_0 = Math.max(0, values[i] - 0);
				final long v_1 = Math.max(0, values[i] - 1);
				final long v_2 = Math.max(0, values[i] - 2);
				
				all[i] = (v_0 * v_1) / 2;
				selected[i] = (v_1 * v_2) / 2;
			}
			
			final long sum = Arrays.stream(all).sum();
			
			for(int i = 0; i < N; i++){
				final int v = array[i];
				final long answer = sum - all[v] + selected[v];
				
				//System.out.println(sum + " " + all[v] + " " + selected[v]);
				System.out.println(answer);
			}
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
