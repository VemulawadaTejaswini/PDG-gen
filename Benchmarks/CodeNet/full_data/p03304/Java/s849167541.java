import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
	
	public static long naive(long n, long m, long d, long comb, int deep, long prev) {
		if(deep >= m) { return comb; }
		
		long ret = 0;
		for(long curr = 1; curr <= n; curr++) {
			if(prev >= 1 && Math.abs(prev - curr) == d) {
				ret += naive(n, m, d, comb + 1, deep + 1, curr);
			}else {
				ret += naive(n, m, d, comb + 0, deep + 1, curr);
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final long n = sc.nextLong();
			final long m = sc.nextLong();
			final long d = sc.nextLong();
			
			if(n < 10 && m < 10) {
				long all = 1;
				for(int i = 0; i < m; i++) { all *= n; }
				System.out.printf("%.10f\n", (double)(naive(n, m, d, 0, 0, 0) / (double)(all)));
			}else {
				System.out.printf("%.10f\n", (double)(m) / (double)(n));
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