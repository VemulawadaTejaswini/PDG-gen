import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			int[] as = new int[M];
			int[] bs = new int[M];
			
			for(int i = 0; i < M; i++) {
				final int a = sc.nextInt();
				final int b = sc.nextInt();
				
				as[i] = a;
				bs[i] = 0;
				for(int j = 0; j < b; j++) { 
					bs[i] |= (1 << (sc.nextInt() - 1));
				}
			}
			
			final long INF = Long.MAX_VALUE / 2 - 1;
			long[] moneys = new long[1 << N];
			Arrays.fill(moneys, INF);
			moneys[0] = 0;
			for(int key = 0; key < M; key++) {
				for(int bit = 0; bit < (1 << N); bit++) {
					if(moneys[bit] >= INF) { continue; }
					
					final int next_bit = bit | bs[key];
					moneys[next_bit] = Math.min(moneys[next_bit], moneys[bit] + as[key]);
				}
			}
			
			System.out.println(moneys[(1 << N) - 1] >= INF ? -1 : moneys[(1 << N) - 1]);
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