import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static final int LIMIT = 30000;
	
	public static boolean solve_naive(final int N, int deep, int[] use){
		if(deep == N){
			int gcd = use[0];
			for(int i = 1; i < N; i++){ gcd = gcd(gcd, use[i]); }
			
			//System.out.println(gcd + " : " + Arrays.toString(use));
			if(gcd > 1){ return false; } 
			
			//System.out.println(Arrays.toString(use));
			return true;
		}
		
		int sum = 0;
		for(int i = 0; i < deep; i++){ sum += use[i]; }
		
		LOOP:
		for(int x = 2; x <= LIMIT; x++){
			if(deep >= 2){
				if(gcd(sum, x) == 1){ continue LOOP; }
			
				for(int i = 0; i < deep; i++){
					if(use[i] == x){ continue LOOP; }
					if(gcd(sum - use[i] + x, use[i]) == 1){ continue LOOP; }
				}
			}
			
			use[deep] = x;
			if(solve_naive(N, deep + 1, use)){ return true; }
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			int[] use = new int[N];
			use[0] = 29999;
			use[1] = 29998;
			//use[0] = sc.nextInt();
			//use[1] = sc.nextInt();
			
			final int N_force = Math.min(N, 500);
			
			solve_naive(N_force, 2, use);
			
			Arrays.sort(use);
			boolean[] used = new boolean[LIMIT + 1];
			
			for(int i = 0; i < N_force; i++){
				System.out.print((i == 0 ? "" : " ") + use[(N - 1) - i]);
				used[use[(N - 1) - i]] = true;
			}
			//System.out.println();
			
			for(int i = 2, cnt = N_force; i <= LIMIT && cnt < N; i += 2, cnt++){
				if(used[i]){ continue; }
				System.out.print(" " + i);
			}
			System.out.println();
			
			/*
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.println();
			}
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