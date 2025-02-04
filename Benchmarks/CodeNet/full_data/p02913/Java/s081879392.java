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
			final String s = sc.next();
			
			String[] suffixs = new String[N];
			for(int i = 0; i < N; i++) {
				suffixs[i] = s.substring(i);
			}
			
			Arrays.sort(suffixs);
			
			int answer = 0;
			for(int i = 0; i < N - 1; i++) {
				final int curr = i;
				
				for(int j = i + 1; j < N; j++) {
					final int next = j;
					if(suffixs[curr].charAt(0) != suffixs[next].charAt(0)) { break; }
					
					final int curr_start_index = (N - suffixs[curr].length());
					final int next_start_index = (N - suffixs[next].length());
					final int start_index_diff = Math.abs(curr_start_index - next_start_index);
					//System.out.println(suffixs[curr] + " " + curr_start_index + " " + start_index_diff);
					
					int same = 0;
					while(same < suffixs[curr].length() && same < suffixs[next].length()){
						if(suffixs[curr].charAt(same) != suffixs[next].charAt(same)) { break; }
						if(same >= start_index_diff) { break; }
						
						same++;
					}
					
					answer = Math.max(same, answer);
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