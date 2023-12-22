import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static class Move {
		int fx, fy, gx, gy;
		
		public Move(int fx, int fy, int gx, int gy) {
			this.fx = fx;
			this.fy = fy;
			this.gx = gx;
			this.gy = gy;
		}
		
		public String toString() {
			return this.fy + " " + this.fx + " " + this.gy + " " + this.gx;
		}
	}
	
	public static int[][] move_dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	public static boolean in_range(int x, int y, int W, int H) {
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			int[] xs = new int[N];
			int[] ys = new int[N];
			int[] hs = new int[N];
			for(int i = 0; i < N; i++) {
				xs[i] = sc.nextInt();
				ys[i] = sc.nextInt();
				hs[i] = sc.nextInt();
			}		
			
			final int H = 100 + 1;
			final int W = 100 + 1;
			for(int item = 0; item < N; item++) {
				for(int y = 0; y < H; y++) {
					LOOP: for(int x = 0; x < W; x++) {
						final int height = hs[item] + Math.abs(x - xs[item]) + Math.abs(y - ys[item]);
								
						for(int other = 0; other < N; other++) {
							final int h_ = Math.max(0, height - Math.abs(x - xs[other]) - Math.abs(y - ys[other]));
								
							if(h_ != hs[other]) { 
								continue LOOP;
							}
						}
						
						System.out.println(x + " " + y + " " + height);
						return;
					}	
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