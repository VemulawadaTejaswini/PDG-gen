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
	
	public static class State implements Comparable<State> {
		long pos;
		long value;
		
		public State(long pos, long value) {
			this.pos = pos;
			this.value = value;
		}
		
		public int compareTo(State another) {
			return -Long.compare(this.value, another.value);
		}
	}
	
	public static class Position implements Comparable<Position> {
		long x, h;
		
		public Position(long x, long h) {
			this.x = x;
			this.h = h;
		}

		@Override
		public int compareTo(Position o) {
			return Long.compare(this.x, o.x);
		}
	}
	
	public static class LazyAddSumSegmentTree{
		int n;
		long[] dat, max, lazy;

		public LazyAddSumSegmentTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2;} this.n = n;
			dat = new long[this.n * 2 - 1];
			max = new long[this.n * 2 - 1];
			lazy = new long[this.n * 2 - 1];
		}

		private void evaluate_lazy(int k, int l, int r){
			dat[k] += lazy[k] * (r - l);
			max[k] += lazy[k];
			if(k < n - 1){
				lazy[2 * k + 1] += lazy[k]; lazy[2 * k + 2] += lazy[k];
			}
			lazy[k] = 0;
		}

		public void update_node(int k){
			dat[k] = dat[2*k+1] + dat[2*k+2];
			max[k] = Math.max(max[2*k+1], max[2*k+2]);
		}

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

		public long max(int a, int b){ return max(a, b, 0, 0, this.n); }
		public long max(int a, int b, int k, int l, int r){
			evaluate_lazy(k, l, r);

			if(r <= a || b <= l){ return 0;
			}else if(a <= l && r <= b){ return max[k];
			}else {
				long v1 = max(a, b, k * 2 + 1, l , (l + r) / 2);
				long v2 = max(a, b, k * 2 + 2, (l + r) / 2, r);
				update_node(k); return Math.max(v1, v2);
			}
		}
	}
	
	public static int upper_bound(long[] as, long key) {
		final int ret = Arrays.binarySearch(as, key);
		if(ret < 0) {
			return -(ret + 1);
		}else {
			return ret;
		}
	}
	public static int lower_bound(long[] as, long key) {
		final int ret = Arrays.binarySearch(as, key);
		if(ret < 0) {
			return -(ret + 2);
		}else {
			return ret;
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final long D = sc.nextLong();
			final long A = sc.nextLong();
			
			Position[] positions = new Position[N];
			for(int i = 0; i < N; i++) {
				final long x = sc.nextLong();
				final long h = sc.nextLong();
				positions[i] = new Position(x, h);
			}
			Arrays.sort(positions);
			
			long[] xs = new long[N];
			for(int i = 0; i < N; i++) {
				xs[i] = positions[i].x;
			}
			
			LazyAddSumSegmentTree segs = new LazyAddSumSegmentTree(N);
			for(int i = 0; i < N; i++) {
				segs.add(positions[i].h, i, i + 1);
			}
			
			long answer = 0;
			
			for(int i = 0; i < N; i++) {
				final long x = positions[i].x;
				final int l = lower_bound(xs, x + 0);
				final int r = lower_bound(xs, x + 2 * D);
				
				final long max = segs.max(l, l + 1);
				if(max <= 0) { continue; }
				//System.out.println(max + " " + A);
				
				final long times = (max + A - 1) / A;
				final long v = times * A;
				
				segs.add(-v, l, r + 1);
				//System.out.println(i + " " + + (x + D) + " " + max + " " + times);
				answer += times;
			}
			
			/*
			while(!queue.isEmpty()) {
				final State state = queue.poll();
				{
					final int l = upper_bound(xs, state.pos - D);
					final int r = lower_bound(xs, state.pos + D);
					final long value = segs.sum(l, r + 1);
					if(state.value != value) {
						if(value > 0) { queue.add(new State(state.pos, segs.sum(l, r + 1))); }
						continue;
					}
				}
				answer += 1;
				
				{
					final int l = upper_bound(xs, state.pos - D);
					final int r = lower_bound(xs, state.pos + D);
					segs.add(-A, l, r + 1);
					
					final long value = segs.sum(l, r + 1);
					System.out.println(state.value + " " + value);
					if(value > 0) { queue.add(new State(state.pos, value)); }
				}
			}
			*/
			
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