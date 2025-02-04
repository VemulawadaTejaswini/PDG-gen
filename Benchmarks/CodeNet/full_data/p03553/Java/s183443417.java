import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.Segment;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			
			final long[] as = sc.nextLongArray(N);
			boolean[] valid = new boolean[N];
			Arrays.fill(valid, true);
			
			while(true){
				int min_i = -1;
				long min_in_plus = Long.MAX_VALUE;
				
				for(int i = N; i >= 1; i--){
					long sum = 0;
					long in_plus = 0;
					
					for(int j = i; j <= N; j += i){
						final int index = j - 1;
						if(!valid[index]){ continue; }
						
						sum += as[index];
						if(as[index] > 0){ in_plus = as[index]; }
					}
					
					if(sum < 0 && min_in_plus >= in_plus){
						min_i = i;
						min_in_plus = in_plus;
						//System.out.println(i + " " + sum + " " + in_plus);
					}	
				}
				
				if(min_i < 0){ break; }
				
				for(int j = min_i; j <= N; j += min_i){
					final int index = j - 1;
					valid[index] = false;
				}
			}
			
			
			long answer = 0;
			for(int i = 0; i < N;i ++){ 
				if(!valid[i]){ continue; }
				answer += as[i];
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
			while (!hasNext()) {
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}