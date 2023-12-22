import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			
			//final int W = 100;
			final int W = 100;
			final int H = 100;
			final int half_H = 50;
			ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
			for(int i = 0; i < H; i++){
				board.add(new ArrayList<Character>());
			}
			
			// A
			for(int i = 0; i < half_H; i++){
				for(int j = 0; j < W; j++){ board.get(i).add('#'); }
			}
			// B
			for(int i = half_H; i < H; i++){
				for(int j = 0; j < W; j++){ board.get(i).add('.'); }
			}
			
			
			
			int curr_A = 1;
			int curr_B = 1;
			
			LOOP_A:
			for(int i = 0; i < half_H; i += 2){
				for(int j = 1; j < W; j += 2){
					board.get(i).set(j, '.');
					curr_A++;
					
					if(curr_A == A){ break LOOP_A; }
				}
			}
			
			LOOP_B:
			for(int i = H - 1; i >= half_H; i -= 2){
				for(int j = 1; j < W; j += 2){
					board.get(i).set(j, '#');
					curr_B++;
					
					if(curr_B == B){ break LOOP_B; }
				}
			}
			
			
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.println(H + " " + W);
				for(ArrayList<Character> line : board){
					for(int i = 0; i < W; i++){
						pw.print(line.get(i));
					}
					pw.println();
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