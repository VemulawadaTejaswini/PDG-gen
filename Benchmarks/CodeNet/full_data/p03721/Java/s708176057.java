import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static class Pair implements Comparable<Pair> {
		long num, count;
		
		public Pair(long num, long count){
			this.num = num;
			this.count = count;
		}
		
		public int compareTo(Pair p){
			return Long.compare(this.num, p.num);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final long K = sc.nextLong();
			
			Pair[] pairs = new Pair[N];
			for(int i = 0; i < N; i++){
				pairs[i] = new Pair(sc.nextLong(), sc.nextLong());
			}
			Arrays.sort(pairs);
			
			long[] num = new long[N + 1];
			long[] sum = new long[N + 1];
			for(int i = 1; i <= N; i++){
				num[i] = pairs[i - 1].num;
				sum[i] = pairs[i - 1].count;
			}
			
			for(int i = 1; i <= N; i++){
				sum[i] += sum[i - 1];
			}
			
			for(int i = 1; i <= N; i++){
				if(sum[i - 1] < K && sum[i] >= K){
					System.out.println(num[i]);
					break;
				}
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