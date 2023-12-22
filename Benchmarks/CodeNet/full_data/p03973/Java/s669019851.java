import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		long[] array = new long[N];
		
		for(int i = 0; i < N; i++){
			array[i] = sc.nextLong();
		}
		
		//Arrays.sort(array);
		
		long count = array[0] - 1;
		long min_limit = 1;
		
		for(int i = 1; i < N; i++){
			final long limit = (array[i] - 1) / min_limit;
			final long last = array[i] - limit * min_limit;
			
			//System.out.println(array[i] + " : " + min_limit);
			
			if(last == min_limit){
				final long next_limit = (array[i] - 1) / (min_limit + 1);
				final long next_last = array[i] - next_limit * (min_limit + 1);
				count += next_limit;
				min_limit = Math.max(min_limit, next_last + 1);
			}else{
				count += limit;
				min_limit = Math.max(min_limit, last + 1);
			}
			
		}
		
		System.out.println(count);
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}