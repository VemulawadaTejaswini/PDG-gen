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

	public static final int V_MAX = 100 * 2;
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			
			int[] ts = new int[N];
			for(int i = 0; i < N; i++){ ts[i] = sc.nextInt(); }
			int[] vs = new int[N];
			for(int i = 0; i < N; i++){ vs[i] = sc.nextInt(); }
			
			for(int i = 0; i < N; i++){
				ts[i] *= 2;
				vs[i] *= 2;
			}
			
			final int sum = Arrays.stream(ts).sum();
			int[] ts_sum = new int[N];
			ts_sum[0] = ts[0];
			for(int i = 1; i < N; i++){
				ts_sum[i] += ts_sum[i - 1] + ts[i];
			}
			
			double answer = 0;
			
			for(int t = 0; t <= sum; t++){
				int v = t;
				
				for(int i = 0; i < N; i++){
					if(i == 0){
						if(0 > t){
							v = Math.min(v, vs[i] + Math.abs(t));
						}else if(ts_sum[i] < t){
							v = Math.min(v, vs[i] + Math.abs(ts_sum[i] - t));
						}else{
							v = Math.min(v, vs[i]);
						}
					}else{
						if(ts_sum[i - 1] > t){
							v = Math.min(v, vs[i] + Math.abs(ts_sum[i - 1] - t));
						}else if(ts_sum[i] < t){
							v = Math.min(v, vs[i] + Math.abs(ts_sum[i] - t));
						}else{
							v = Math.min(v, vs[i]);
						}
					}
				}
				
				v = Math.min(v, Math.abs(sum - t));
				
				//System.out.println(t + " " + v);
				answer += v;
			}
			
			System.out.printf("%.08f\n", answer / 4.0);
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