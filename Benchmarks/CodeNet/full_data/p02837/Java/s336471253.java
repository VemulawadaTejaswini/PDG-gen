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
			
			int[] as = new int[N];
			int[][] xs = new int[N][];
			int[][] ys = new int[N][];
			
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextInt();
				
				xs[i] = new int[as[i]];
				ys[i] = new int[as[i]];
				for(int j = 0; j < as[i]; j++) {
					final int x = sc.nextInt() - 1;
					final int y = sc.nextInt();
					
					xs[i][j] = x;
					ys[i][j] = y;
				}	
			}
			
			final int ALL = 1 << N;
			boolean[] isHonests = new boolean[N];
			int answer = 0;
			LOOP:
			for(int honest_bit = 0; honest_bit < ALL; honest_bit++) {
				
				for(int person = 0; person < N; person++) {
					boolean isHonest = (honest_bit & (1 << person)) != 0;
					isHonests[person] = isHonest;
				}
				
				for(int from_person = 0; from_person < N; from_person++) {
					boolean fromIsHonest = (honest_bit & (1 << from_person)) != 0;
					
					if(!fromIsHonest) { continue; }
					
					for(int a = 0; a < as[from_person]; a++) {
						final int to_person = xs[from_person][a];
						final boolean toTellHonest = ys[from_person][a] == 1; 
						final boolean toBitHonest = (honest_bit & (1 << to_person)) != 0;
						
						if(toTellHonest != toBitHonest) { 
							continue LOOP; 
						}
					}
				}
				
				answer = Math.max(Integer.bitCount(honest_bit), answer);
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