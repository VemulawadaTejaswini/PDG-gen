import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
	
	public static class Range implements Comparable<Range> {
		long x, l;
		
		public Range (long x, long l) {
			this.x = x;
			this.l = l;
		}

		@Override
		public int compareTo(Range o) {
			return Long.compare(this.x + this.l, o.x + o.l);
		}
	}
	
	public static class LazyAddSumSegmentTree{
		int n;
		long[] dat, lazy;

		public LazyAddSumSegmentTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2;} this.n = n;
			dat = new long[this.n * 2 - 1];
			lazy = new long[this.n * 2 - 1];
		}

		private void evaluate_lazy(int k, int l, int r){
			dat[k] += lazy[k] * (r - l);
			if(k < n - 1){
				lazy[2 * k + 1] += lazy[k]; lazy[2 * k + 2] += lazy[k];
			}
			lazy[k] = 0;
		}

		public void update_node(int k){ dat[k] = dat[2*k+1] + dat[2*k+2]; }

		public void add(long v, int a, int b){ add(v, a, b, 0, 0, this.n); }
		public void add(long v, int a, int b, int k, int l, int r){
			evaluate_lazy(k, l, r);

			if(r <= a || b <= l){ return;
			}else if(a <= l && r <= b){
				lazy[k] += v; evaluate_lazy(k, l, r);
			}else {
				add(v, a, b, k * 2 + 1, l , (l + r) / 2);
				add(v, a, b, k * 2 + 2, (l + r) / 2, r);
				update_node(k);
			}
		}

		public long sum(int a, int b){ return sum(a, b, 0, 0, this.n); }
		public long sum(int a, int b, int k, int l, int r){
			evaluate_lazy(k, l, r);

			if(r <= a || b <= l){ return 0;
			}else if(a <= l && r <= b){ return dat[k];
			}else {
				long v1 = sum(a, b, k * 2 + 1, l , (l + r) / 2);
				long v2 = sum(a, b, k * 2 + 2, (l + r) / 2, r);
				update_node(k); return v1 + v2;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] xs = new long[N];
			long[] ls = new long[N];
			Range[] ranges = new Range[N];
			
			TreeSet<Long> set = new TreeSet<Long>();
			for(int i = 0; i < N; i++) {
				xs[i] = sc.nextLong();
				ls[i] = sc.nextLong();
				
				ranges[i] = new Range(xs[i], ls[i]);

				set.add(xs[i] - (ls[i] - 0));
				set.add(xs[i] - (ls[i] - 1));
				set.add(xs[i]);
				set.add(xs[i] + (ls[i] - 1));
				set.add(xs[i] + (ls[i] - 0));
			}
			
			Arrays.sort(ranges);
			
			ArrayList<Long> list = new ArrayList<Long>(set);
			final int size = list.size();
			LazyAddSumSegmentTree seg = new LazyAddSumSegmentTree(size);
			
			int answer = 0;
			for(final Range range: ranges) {
				final long l = range.x - (range.l - 1);
				final long r = range.x + (range.l);
				
				final int l_index = Collections.binarySearch(list, l);
				final int r_index = Collections.binarySearch(list, r);
				
				// System.out.println(l + " " + r + " " + seg.sum(l_index, r_index));
				
				if(seg.sum(l_index, r_index) == 0) {
					answer++;
					seg.add(1, l_index, r_index);
				}
			}
			
			System.out.println(answer);
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