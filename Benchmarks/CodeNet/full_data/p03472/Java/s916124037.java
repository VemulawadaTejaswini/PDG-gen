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
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			final long H = sc.nextLong();
			
			PriorityQueue<Long> a_queue = new PriorityQueue<Long>(N, Collections.reverseOrder());
			PriorityQueue<Long> b_queue = new PriorityQueue<Long>(N, Collections.reverseOrder());
			
			for(int i = 0; i < N; i++){
				final long a = sc.nextLong();
				final long b = sc.nextLong();
				
				a_queue.add(a);
				b_queue.add(b);
			}
			
			int b_count = 0;
			long b_sum = 0;
			long min = Long.MAX_VALUE;
			while(!a_queue.isEmpty()){
				final long a = a_queue.poll();
				
				while(b_sum < H && !b_queue.isEmpty()){
					if(b_queue.peek() < a){ break; }
					b_count++;
					b_sum += b_queue.poll();
				}
				//System.out.println(a + " " + b_sum);
				
				final long a_count = (Math.max(0, H - b_sum) + (a - 1)) / a;
				min = Math.min(min, b_count + a_count); 
			}
			
			System.out.println(min);
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