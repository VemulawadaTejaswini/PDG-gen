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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static class Cake{
		long x, y, z;
		
		public Cake(long x, long y, long z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	public static long calc(final int N, final int M, Cake[] array, final long x_sig, final long y_sig, final long z_sig) {
		long x_sum = 0, y_sum = 0, z_sum = 0;

		Arrays.sort(array, new Comparator<Cake>() {
			@Override
			public int compare(Cake o1, Cake o2) {
				final long o1_sum = o1.x * x_sig + o1.y * y_sig + o1.z * z_sig;
				final long o2_sum = o2.x * x_sig + o2.y * y_sig + o2.z * z_sig;
				
				return -Long.compare(o1_sum, o2_sum);
			}
		});
		
		for(int i = 0; i < M; i++) {
			x_sum += array[i].x;
			y_sum += array[i].y;
			z_sum += array[i].z;
		}
		
		return Math.abs(x_sum) + Math.abs(y_sum) + Math.abs(z_sum);
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			Cake[] array = new Cake[N];
			for(int i = 0; i < N; i++) {
				array[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
			}
			
			long ret = 0;
			ret = Math.max(ret, calc(N, M, array, +1, +1, +1));
			ret = Math.max(ret, calc(N, M, array, -1, +1, +1));
			ret = Math.max(ret, calc(N, M, array, +1, -1, +1));
			ret = Math.max(ret, calc(N, M, array, -1, -1, +1));
			ret = Math.max(ret, calc(N, M, array, +1, +1, -1));
			ret = Math.max(ret, calc(N, M, array, -1, +1, -1));
			ret = Math.max(ret, calc(N, M, array, +1, -1, -1));
			ret = Math.max(ret, calc(N, M, array, -1, -1, -1));
			
			System.out.println(ret);
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