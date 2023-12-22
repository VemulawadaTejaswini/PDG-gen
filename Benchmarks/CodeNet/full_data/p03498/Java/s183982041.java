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
			
			long[] array = new long[N];
			for(int i = 0; i < N; i++){
				array[i] = sc.nextLong();
			}
			
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			int min_pos = -1, max_pos = -1;
			for(int i = 0; i < N; i++){
				if(array[i] < min){ min = array[i]; min_pos = i; }
				if(array[i] > max){ max = array[i]; max_pos = i; }
			}
			
			LinkedList<String> answer = new LinkedList<String>();
			if(Math.abs(max) >= Math.abs(min)){
				for(int i = 0; i < N; i++){
					if(array[i] >= 0){ continue; }
					
					array[i] += array[max_pos];
					answer.add((max_pos + 1) + " " + (i + 1));
				}
				
				for(int i = 1; i < N; i++){
					array[i] += array[i - 1];
					answer.add((i) + " " + (i + 1));
				}
			}else{
				for(int i = 0; i < N; i++){
					if(array[i] <= 0){ continue; }
					
					array[i] += array[min_pos];
					answer.add((min_pos + 1) + " " + (i + 1));
				}
				
				for(int i = N - 2; i >= 0; i--){
					array[i] += array[i + 1];
					answer.add((i + 2) + " " + (i + 1));
				}
			}
			//System.out.println(Arrays.toString(array));
			
			System.out.println(answer.size());
			for(final String str : answer){ System.out.println(str); }
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