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

	public static class Result implements Comparable<Result> {
		int index;
		long dist;
		int deme;

		
		public Result(int index, long dist, int deme) {
			this.index = index;
			this.dist = dist;
			this.deme = deme;
		}

		@Override
		public int compareTo(Result o) {
			if(Long.compare(this.dist, o.dist) != 0) {
				return Long.compare(this.dist, o.dist);
			}else {
				return Integer.compare(this.index, o.index);
				// return Integer.compare(this.deme, o.deme);
			}
		}
		
		@Override
		public String toString() {
			return "{" + this.index + " : " + this.dist + " : " + this.deme + "}";
		}
	}
	
	public static class SegTree {
		int n;
		Result[] dat;

		public SegTree(int n_) {
			int n = 1;
			while(n < n_){ n *= 2; }

			this.n = n;
			dat = new Result[this.n * 2 - 1];
			for(int i = 0; i < this.n * 2 - 1; i++){ 
				dat[i] = new Result(i, Integer.MAX_VALUE, Integer.MAX_VALUE);
			}
		}

		public void update(int k, long a, int d){
			k += n - 1;
			dat[k].index = (k - (n - 1));
			dat[k].dist = a;
			dat[k].deme = d;

			while(k > 0){
				k = (k - 1) / 2;
				
				if(dat[k * 2 + 1].compareTo(dat[k * 2 + 2]) < 0) {
					dat[k].index = dat[k * 2 + 1].index;
					dat[k].dist = dat[k * 2 + 1].dist;
					dat[k].deme = dat[k * 2 + 1].deme;
				}else {
					dat[k].index = dat[k * 2 + 2].index;
					dat[k].dist = dat[k * 2 + 2].dist;
					dat[k].deme = dat[k * 2 + 2].deme;
				}
			}
		}
				
		public Result query(int a, int b, int k, int l, int r){
			if(r <= a || b <= l){
				return (new Result(k, Integer.MAX_VALUE, Integer.MAX_VALUE));
			}else if(a <= l && r <= b){
				return dat[k];
			}else {
				final Result fst = query(a, b, k * 2 + 1, l, (l + r) / 2);
				final Result snd = query(a, b, k * 2 + 2, (l + r) / 2, r);
				
				if(fst.compareTo(snd) < 0) {
					return fst;
				} else {
					return snd;
				}
			}
		}
		public Result query(int a, int b) {
			return query(a, b, 0, 0, this.n);
		}
		
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			final char[] chs = sc.next().toCharArray();
			
			SegTree seg = new SegTree(N + 1);
			seg.update(N, 0, 0);
			
			for(int i = N - 1; i >= 0; i--) {
				if(chs[i] == '1') { continue; }
				
				final Result result = seg.query(i + 1, Math.min((i + 1) + M, N + 1));
				
				// System.out.println(i + " : " + result.index + " " + result.dist);
				seg.update(i, result.dist + 1, result.index - i);
			}
			if(seg.query(0, 1).dist >= Integer.MAX_VALUE) {
				System.out.println(-1);
				return;
			}
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			{
				int pos = 0;
				while(pos < N) {
					final Result result = seg.query(pos, pos + 1);
					// System.out.println(pos + " : " + result.index + " " + result.dist + " " + result.deme);
					list.addLast(result.deme);
					pos += result.deme;
				}
			}
			
			{
				boolean first = true;
				for(final int l : list) {
					System.out.print((first ? "" : " ") + l);
					first = false;
				}
				System.out.println();
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