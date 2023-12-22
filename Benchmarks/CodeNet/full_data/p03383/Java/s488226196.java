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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static int GeneralMatching(boolean[][] adj){
		final int n = adj.length;

		int[] DP = new int[1 << n];
		DP[0] = 0;

		for(int bit = 0; bit < (1 << n); bit++){
			// 立ってない最初の bit だけ立ててて O(N) ループ節約
			int i = 0; for(; (bit & (1 << i)) != 0; i++);
			final int fst = 1 << i;

			for(int j = i + 1; j < n; j++){
				if((bit & (1 << j)) != 0){ continue; }

				final int snd = 1 << j;
				final int next_bit = bit | fst | snd;
				DP[next_bit] = Math.max(DP[next_bit], DP[bit] + (adj[i][j] ? 1 : 0));
			}
		}

		return DP[(1 << n) - 1];
	}
	
	public static int FindOne(boolean[][] adj){
		final int n = adj.length;

		int[] DP = new int[1 << n];
		int[] prev = new int[1 << n];
		DP[0] = 0;
		prev[0] = -1;

		for(int bit = 0; bit < (1 << n); bit++){
			// 立ってない最初の bit だけ立ててて O(N) ループ節約
			int i = 0; for(; (bit & (1 << i)) != 0; i++);
			final int fst = 1 << i;

			for(int j = i + 1; j < n; j++){
				if((bit & (1 << j)) != 0){ continue; }

				final int snd = 1 << j;
				final int next_bit = bit | fst | snd;
				final int next_DP = DP[bit] + (adj[i][j] ? 1 : 0);
				if(DP[next_bit] < next_DP){
					DP[next_bit] = next_DP;
					prev[next_bit] = bit;
				}
			}
		}
		
		int bit = (1 << n) - 1;
		while(prev[bit] >= 0){
			final int change_bits = Integer.bitCount(bit & (~(prev[bit])));
			if(change_bits == 1){
				return Integer.numberOfTrailingZeros(bit & (~(prev[bit])));
			}
			
			//System.out.println(Integer.toBinaryString(prev[bit]) + " " + Integer.toBinaryString(bit & (~(prev[bit]))));
			bit = prev[bit];
		}

		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			final int ALPHA = 26;
			
			final char[][] board = new char[H][];
			for(int i = 0; i < H; i++){ board[i] = sc.next().toCharArray(); }
			boolean[][] reflective = new boolean[H][H];
			
			for(int fst = 0; fst < H; fst++){
				for(int snd = fst + 1; snd < H; snd++){
					int[][] adj = new int[ALPHA][ALPHA];
					
					for(int index = 0; index < W; index++){
						final int fst_alpha = board[fst][index] - 'a';
						final int snd_alpha = board[snd][index] - 'a';
						
						adj[fst_alpha][snd_alpha]++;
					}
					
					int two_pass = 0, one_pass = 0;
					for(int fst_alpha = 0; fst_alpha < ALPHA; fst_alpha++){
						for(int snd_alpha = 0; snd_alpha < ALPHA; snd_alpha++){
							if(adj[fst_alpha][snd_alpha] > 0 && adj[snd_alpha][fst_alpha] > 0){
								final int min = Math.min(adj[fst_alpha][snd_alpha], adj[snd_alpha][fst_alpha]);
								
								if(fst_alpha == snd_alpha){
									two_pass += min / 2;
									one_pass += min % 2;
									adj[fst_alpha][snd_alpha] -= min;
								}else{
									two_pass += min;
									adj[fst_alpha][snd_alpha] -= min;
									adj[snd_alpha][fst_alpha] -= min;
								}
							}
						}
					}
					
					if(two_pass * 2 + one_pass == W && one_pass <= 1){
						reflective[fst][snd] = reflective[snd][fst] = true;
					}
				}
			}
			
			//System.out.println(Arrays.deepToString(reflective));
			
			final int two_match = GeneralMatching(reflective);
			final int one_match = H - 2 * two_match;
			//System.out.println(two_match + " " + one_match);
			
			if(H == 1){
				System.out.println(reflective[0][0] ? "YES" : "NO");
			}else if(H % 2 == 0){
				if(two_match * 2 == H){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				if(two_match * 2 == H - 1 && one_match == 1){
					final int one_pos = FindOne(reflective);
					//System.out.println(one_pos);
					boolean ok = true;
					for(int i = 0; i < W; i++){
						if(board[one_pos][i] != board[one_pos][(W - 1) - i]){ ok = false; break; }
					}
					
					System.out.println(ok ? "YES" : "NO");
				}else{
					System.out.println("NO");
				}
			}
			
			
			/*
			try(final PrintWriter pw = new PrintWriter(System.out)){
				
			}
			//*/
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