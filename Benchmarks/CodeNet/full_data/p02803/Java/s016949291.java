import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();

			boolean[][] board = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				final char[] chs = sc.next().toCharArray();
				for(int j = 0; j < W; j++) {
					board[i][j] = chs[j] != '#';
				}
			}
			
			final int INF = Integer.MAX_VALUE / 2 - 1;
			
			long[][] adj = new long[H * W][H * W];
			for(int i = 0; i < H * W; i++) {
				for(int j = 0; j < H * W; j++) {
					adj[i][j] = i == j ? 0 : INF;
				}
			}
		
			for(int sy = 0; sy < H; sy++) {
				for(int sx = 0; sx < W; sx++) {
					if(!board[sy][sx]) { continue; }
					
					final int from_index = sy * W + sx;
					
					for(int dy = -1; dy <= 1; dy++) {
						for(int dx = -1; dx <= 1; dx++) {
							if(Math.abs(dx) + Math.abs(dy) != 1) { continue; }
							
							final int nx = sx + dx, ny = sy + dy; 
							if(0 > nx || nx >= W || 0 > ny || ny >= H) { continue; }
							if(!board[ny][nx]) { continue; }
							
							final int to_index = (sy + dy) * W + (sx + dx);
							
							adj[from_index][to_index] = 1;
						}
					}
				}
			}
			
			for(int k = 0; k < H * W; k++) {
				for(int i = 0; i < H * W; i++) {
					for(int j = 0; j < H * W; j++) {
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			
			long answer = 0;
			for(int i = 0; i < H * W; i++) {
				for(int j = 0; j < H * W; j++) {
					if(adj[i][j] >= INF) { continue; }
					answer = Math.max(answer, adj[i][j]);
				}
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