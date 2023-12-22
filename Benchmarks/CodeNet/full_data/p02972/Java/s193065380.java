import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			int[] as = new int[N];
			for(int i = 0; i < N; i++) { as[i] = sc.nextInt(); }
			
			int answer = 0;
			int[] counts = new int[N + 1];
			
			for(int i = N; i >= 1; i--) {
				int already = 0;
				
				for(int j = i * 2; j <= N; j += i) {
					already += counts[j];
					already %= 2;
				}
				
				if(as[i - 1] == already) {
					counts[i] = 0;
				}else {
					answer++;
					counts[i] = 1;
				}
			}
			
			for(int i = 1; i <= N; i++) {
				int calced = 0;

				for(int j = i; j <= N; j += i) {
					calced += counts[j];
					calced %= 2;
				}
				
				if(as[i - 1] != calced) {
					System.out.println(-1);
					return;
				}
			}
			
			System.out.println(answer);
			boolean first = true;
			for(int i = 1; i <= N; i++) {
				if(counts[i] == 0) { continue; }
				
				if(first) {
					System.out.print(i);
					first = false;
				}else {
					System.out.print(" " + i);
				}
			}
			if(answer > 0) { System.out.println(); } 
			
			/*
				System.out.println(Arrays.toString(counts));
			*/
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