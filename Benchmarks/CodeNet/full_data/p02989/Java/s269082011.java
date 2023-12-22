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
			
			int[] ds = new int[N];
			for(int i = 0; i < N; i++) { ds[i] = sc.nextInt(); }
			Arrays.sort(ds);
			//System.out.println(Arrays.toString(ds));
			
			int answer_min = 0, answer_max = -1;
			
			int prev = -1;
			for(int i = 0; i < N; i++) {
				final int curr = ds[i];
				if(prev == curr) { continue; }
				prev = curr;
				
				final int ABC = i;
				final int ARC = N - ABC;
				
				//System.out.println(ABC + " " + ARC);
				
				if(ABC == ARC) { answer_max = curr; }
				if(ABC < ARC && curr > answer_min) { answer_min = curr; }
			}
			
			//System.out.println(answer_max + " " + answer_min);
			
			if(answer_max < 0) {
				System.out.println(0);
			}else {
				System.out.println(answer_max - answer_min);
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