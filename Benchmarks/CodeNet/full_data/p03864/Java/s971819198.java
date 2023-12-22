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
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final long x = sc.nextLong();
		
		long[] array = new long[N];
		for(int i = 0; i < N; i++){
			array[i] = sc.nextLong();
		}
		
		long answer = 0;
		for(int i = 1; i < N; i++){
			final long value = array[i - 1] + array[i];
			
			//System.out.println(array[i - 1] + " " + array[i] + " " + value);
			if(value > x){
				final long diff = Math.min(value - x, array[i]);
				array[i] -= diff;
				answer += diff;
			}
		}
		
		if(array[0] + array[1] > x){
			answer += (array[0] + array[1]) - x;
			array[0] -= (array[0] + array[1]) - x;
		}
		if(array[N - 2] + array[N - 1] > x){
			answer += (array[N - 2] + array[N - 1]) - x;
			array[N - 1] -= (array[N - 2] + array[N - 1]) - x;
		}
		
		System.out.println(answer);
		//System.out.println(Arrays.toString(array));
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