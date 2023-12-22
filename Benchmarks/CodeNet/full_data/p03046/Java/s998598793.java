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
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int M = sc.nextInt();
			final int K = sc.nextInt();
			
			final int MAX_VALUE = (1 << M) - 1;
			
			if(K == 0) {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < (1 << (M + 1)); i++) {
					sb.append(i == 0 ? "" : " ");
					sb.append(i / 2);
				}
				System.out.println(sb);
			}else if(MAX_VALUE < K) {
				System.out.println(-1);
			}else {
				StringBuilder sb = new StringBuilder();
				sb.append(0 + " " + K + " " + 0);
				
				for(int i = 1; i <= MAX_VALUE; i++) {
					if(i == K){ continue; }
					sb.append(" " + i);
				}
				sb.append(" " + K);
				for(int i = MAX_VALUE; i >= 1; i--) {
					if(i == K){ continue; }
					sb.append(" " + i);
				}
				
				System.out.println(sb);
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