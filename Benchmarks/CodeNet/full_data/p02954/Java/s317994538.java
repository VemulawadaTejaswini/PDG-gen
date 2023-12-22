import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			char[] chs = sc.next().toCharArray();
			final int N = chs.length;
			
			final int INF = Integer.MAX_VALUE / 2 - 1;
			int[] dists = new int[N];
			int[] moves = new int[N];
			Arrays.fill(dists, INF);
			
			for(int i = 0; i < N - 1; i ++) {
				if(chs[i + 0] == 'R' && chs[i + 1] == 'L') {
					dists[i + 0] = dists[i + 1] = 0;
					moves[i + 0] = moves[i + 1] = 0;
				}
			}
			
			for(int i = 0; i < N; i++) {
				if(chs[i] == 'R') {
					if(dists[i] > dists[i + 1] + 1) {
						dists[i] = dists[i + 1] + 1;
						moves[i] = moves[i + 1] + 1;
					}
				}else {
					if(dists[i] > dists[i - 1] + 1) {
						dists[i] = dists[i - 1] + 1;
						moves[i] = moves[i - 1] - 1;
					}
				}
			}
			for(int i = N - 1; i >= 0; i--) {
				if(chs[i] == 'R') {
					if(dists[i] > dists[i + 1] + 1) {
						dists[i] = dists[i + 1] + 1;
						moves[i] = moves[i + 1] + 1;
					}
				}else {
					if(dists[i] > dists[i - 1] + 1) {
						dists[i] = dists[i - 1] + 1;
						moves[i] = moves[i - 1] - 1;
					}
				}
			}
			
			int[] answer = new int[N];
			for(int i = 0; i < N; i++) {
				if(moves[i] > 0) {
					final int pos = i + moves[i] + (Math.abs(moves[i]) % 2);
					answer[pos] += 1;
				}else {
					final int pos = i + moves[i] - (Math.abs(moves[i]) % 2);
					answer[pos] += 1;
				}
			}
			
			for(int i = 0; i < N; i++) {
				System.out.print((i == 0 ? "" : " ") + answer[i]);
			}
			System.out.println();
			
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