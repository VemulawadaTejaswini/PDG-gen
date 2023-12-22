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
			final int M = sc.nextInt();
			
			long[] ds = new long[M];
			long[] as = new long[M];
			
			
			long[][] cycle_nexts = new long[10][];
			long[][] cycle_ops = new long[10][];
			long[] cycle_ops_sum = new long[10];
			
			for(int d = 0; d <= 9; d++) {
				
				int cycle = 1, current = d;
				while(true) {
					int next = ((current + d) / 10) + ((current + d) % 10);
					
					if(next == d) { break; }
					
					current = next;
					cycle++;
				}
				
				cycle_nexts[d] = new long[cycle];
				cycle_ops[d] = new long[cycle];
				
				cycle_nexts[d][0] = d;
				cycle_ops[d][0] = 0;
				for(int i = 1; i < cycle; i++) {
					final long next = ((cycle_nexts[d][i - 1] + d) / 10) + ((cycle_nexts[d][i - 1] + d) % 10);
					final boolean over = cycle_nexts[d][i - 1] + d >= 10;
					
					cycle_nexts[d][i] = next;
					cycle_ops[d][i] = over ? 2 : 1;
					cycle_ops_sum[d] += cycle_ops[d][i];
				}
				cycle_ops_sum[d] += ((cycle_nexts[d][cycle - 1] + d) >= 10 ? 2 : 1);
				//System.out.println(d + " " + cycle_ops_sum[d]);
				
				/*
				System.out.println(Arrays.toString(cycle_nexts[d]));
				System.out.println(Arrays.toString(cycle_ops[d]));
				*/
				//System.out.println(d + " "  + cycle);
			}
			
			for(int i = 0; i < M; i++) {
				final int d = sc.nextInt();
				final long c = sc.nextLong();
				
				final long added = c - 1;
				
				final int cycles = cycle_nexts[d].length;
				final int rem = (int)(added % cycles);
				
				ds[i] = cycle_nexts[d][rem];
				as[i] = (added / cycles) * cycle_ops_sum[d];
				for(int j = 1; j <= rem; j++) {
					as[i] += cycle_ops[d][j];
				}
				
				// System.out.println(d + " " + ds[i] + " " + rem + " "  + (added / cycles)  + "/" +cycle_ops_sum[d]);
			}
			
			/*
			System.out.println(Arrays.toString(ds));
			System.out.println(Arrays.toString(as));
			*/
			
			long answer = Arrays.stream(as).sum();
			{
				long current = ds[0];
				for(int i = 1; i < M; i++) {
					long next = ds[i];
					
					answer += current + next >= 10 ? 2 : 1;
					current = ((current + next) / 10) + ((current + next) % 10); 
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