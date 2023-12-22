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
	
	public static class Point implements Comparable<Point> {
		int x, y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if(Integer.compare(this.x, o.x) != 0){
				return Integer.compare(this.x, o.x);
			}else{
				return Integer.compare(this.y, o.y);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			Point[] rs = new Point[N];
			Point[] bs = new Point[N];
			for(int i = 0; i < N; i++){
				rs[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			for(int i = 0; i < N; i++){
				bs[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(rs);
			Arrays.sort(bs);
			
			int count = 0;
			boolean[] r_used = new boolean[N];
			for(int b = 0; b < N; b++){
				int min_index = -1;
				
				for(int r = N - 1; r >= 0; r--){
					if(r_used[r]){ continue; }
					if(rs[r].compareTo(bs[b]) >= 0){ continue; }
					
					min_index = r;
				}
				
				//System.out.println(b + " " + min_index);
				
				if(min_index >= 0){
					r_used[min_index] = true;
					count++;
				}
			}
			
			
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.println(count);
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