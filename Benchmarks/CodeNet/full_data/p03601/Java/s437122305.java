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
	
	public static final long INF = Long.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			final int D = sc.nextInt();
			
			final int E = sc.nextInt();
			final int F = sc.nextInt();
			
			int max_sweets = 0;
			int max_waters = 0;
			
			for(int a_t = 0; a_t <= 30; a_t++){
				for(int b_t = 0; b_t <= 30; b_t++){
					final int waters = 100 * A * a_t + 100 * B * b_t;
					if(waters > F){ continue; }
					final int limit_sweets = (A * a_t + B * b_t) * E;
					
					for(int c_t = 0; c_t <= 100; c_t++){
						for(int d_t = 0; d_t <= 100; d_t++){
							final int sweets = C * c_t + D * d_t;
							
							if(waters + sweets > F){ continue; }
							if(sweets > limit_sweets){ continue; }
							
							if(max_sweets == 0){
								max_sweets = sweets;
								max_waters = waters;
							}else{
								final int max_sum = max_sweets + max_waters;
								final int max_cur = waters + sweets;
								
								if(sweets * max_sum > max_cur * max_sweets){
									max_sweets = sweets;
									max_waters = waters;
								}
							}
						}
					}
				}
			}
			
			System.out.println((max_waters + max_sweets) + " " + max_sweets);
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