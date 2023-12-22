import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
		
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			final int K = sc.nextInt();
			
			int[][] board = new int[H][W];
			for(int i = 0; i < H; i++) {
				final char[] chs = sc.next().toCharArray();
				for(int j = 0; j < W; j++) {
					board[i][j] = chs[j] - '0';
				}
			}
			
			long answer = Long.MAX_VALUE;
			
			LOOP:
			for(int bit = 0; bit < (1 << (H + 1)); bit++) {
				final int sliced_H = Integer.bitCount(bit);

				int sliced_W = 0;
				boolean[] is_sliced = new boolean[W];
				long[] counts = new long[sliced_H + 1];

				for(int j = 0; j < W; j++) {
					boolean sliced = false;
					
					int begin_H = 0, h_count = 0;
					for(int end_H = 1; end_H <= H; end_H++) {
						if((bit & (1 << (end_H - 1))) == 0) { continue; }
						//System.out.println(bit + " [" + begin_H + ", " + end_H + ")");
						
						if(is_sliced[j]) { counts[h_count] = 0; }
						
						long current_count = 0;
						for(int i = begin_H; i < end_H; i++) {
							current_count += board[i][j];
						}
					
						if(current_count > K) { continue LOOP; }
						if(counts[h_count] + current_count > K) {
							sliced = true;
						}
					
						begin_H = end_H;
						h_count++;
					}
					
					if(begin_H < H){
						//System.out.println(bit + " [" + begin_H + ", " + H + ")");	
						if(is_sliced[j]) { counts[h_count] = 0; }
							
						long current_count = 0;
						for(int i = begin_H; i < H; i++) {
							current_count += board[i][j];
						}
						
						if(counts[h_count] + current_count > K) {
							sliced = true;
						}
					}
					
					if(sliced) {
						is_sliced[j] = true;
						sliced_W += 1;
					}
					
					begin_H = 0; h_count = 0;
					for(int end_H = 1; end_H <= H; end_H++) {
						if((bit & (1 << (end_H - 1))) == 0) { continue; }
						//System.out.println(bit + " [" + begin_H + ", " + end_H + ")");
						
						if(is_sliced[j]) { counts[h_count] = 0; }
						
						long current_count = 0;
						for(int i = begin_H; i < end_H; i++) {
							current_count += board[i][j];
						}
					
						if(current_count > K) { continue LOOP; }
						counts[h_count] += current_count;
					
						begin_H = end_H;
						h_count++;
					}
					
					if(begin_H < H){
						//System.out.println(bit + " [" + begin_H + ", " + H + ")");	
						if(is_sliced[j]) { counts[h_count] = 0; }
							
						long current_count = 0;
						for(int i = begin_H; i < H; i++) {
							current_count += board[i][j];
						}
						
						if(current_count > K) { continue LOOP; }
						counts[h_count] += current_count;
					}
					
					
				}
				
				answer = Math.min(answer, sliced_W + sliced_H);
			}
			
			System.out.println(answer);
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
