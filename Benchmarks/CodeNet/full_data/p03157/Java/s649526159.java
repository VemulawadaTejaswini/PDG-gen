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
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static class UnionFind {
		int[] par; //

		public UnionFind(int n) {
			par = new int[n];
			for(int i = 0; i < n; i++){
				par[i] = -1;
			}
		}

		public int find(int x) {
			if(par[x] < 0){
				return x;
			}else{
				return par[x] = find(par[x]);
			}
		}

		public boolean union(int x, int y) {
			x = find(x);
			y = find(y);

			if(x != y){
				if(par[y] < par[x]){ // 多い方が根になるようにスワップする.
					int tmp = x;
					x = y;
					y = tmp;
				}
				par[x] += par[y];
				par[y] = x;
				return true;
			}else{
				return false;
			}
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		public int size(int x) {
			return -par[find(x)];
		}
	}
	
	public static int[][] move_dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();

			char[][] colors = new char[H][];
			for(int i = 0; i < H; i++){
				colors[i] = sc.next().toCharArray();
			}
			
			UnionFind uf = new UnionFind(H * W);
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					final int id = i * W + j;
					
					for(final int[] moves : move_dirs) {
						final int ni = i + moves[0];
						final int nj = j + moves[1];
						final int nid = ni * W + nj;
						
						if(0 <= ni && ni < H && 0 <= nj && nj < W && colors[i][j] != colors[ni][nj]) {
							//System.out.println(i + " " + j + " " + ni + " " + nj);
							uf.union(id, nid);
						}
					}
				}
			}
			
			HashSet<Integer> keys = new HashSet<Integer>();
			HashMap<Integer, Integer> whites = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> blacks = new HashMap<Integer, Integer>();
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					final int id = uf.find(i * W + j);
					
					
					keys.add(id);
					if(!whites.containsKey(id)) { whites.put(id, 0); }
					if(!blacks.containsKey(id)) { blacks.put(id, 0); }
					if(colors[i][j] == '.') {
						whites.put(id, whites.get(id) + 1);
					}else {
						blacks.put(id, blacks.get(id) + 1);
					}
				}
			}
			//System.out.println(blacks);
			
			long answer = 0;
			for(final int id : keys) {
				answer += blacks.get(id) * whites.get(id);
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