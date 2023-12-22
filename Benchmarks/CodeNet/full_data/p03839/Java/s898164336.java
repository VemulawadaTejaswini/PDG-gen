import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
		final int K = sc.nextInt();
		
		long[] array = new long[N];
		for(int i = 0; i < N; i++){
			array[i] = sc.nextLong();
		}
		
		long[] in_prefix_sum = new long[N + 1];
		long[] ex_prefix_sum = new long[N + 1];
		for(int i = 0; i < N; i++){
			in_prefix_sum[i + 1] = array[i] + in_prefix_sum[i];
			ex_prefix_sum[i + 1] = Math.max(0, array[i]) + ex_prefix_sum[i];
		}
		
		long answer = 0;
		for(int first_offset = 0; first_offset <= (N - K); first_offset++){
			final int second_index = first_offset + K;
			
			final long first_sum  = ex_prefix_sum[first_offset];
			final long center_sum = Math.max(0, in_prefix_sum[second_index] - in_prefix_sum[first_offset]);
			final long last_sum   = ex_prefix_sum[N] - ex_prefix_sum[second_index];
			
			/*
			System.out.println(first_offset);
			System.out.printf("[0, %d) = %d\n", first_offset, first_sum);
			System.out.printf("[%d, %d) = %d\n", first_offset, second_index, center_sum);
			System.out.printf("[%d, %d) = %d\n", second_index, N, last_sum);
			//*/
			
			//System.out.println(first_sum + " " + center_sum + " " + last_sum);
			
			answer = Math.max(answer, first_sum + center_sum + last_sum);
		}
		
		System.out.println(answer);
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