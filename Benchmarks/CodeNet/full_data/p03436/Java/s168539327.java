import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static final int[][] move_dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	public static boolean in_range(int x, int y, int W, int H){
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			char[][] board = new char[H][];
			for(int i = 0; i < H; i++){
				board[i] = sc.next().toCharArray();
			}
				
			boolean[][] visited = new boolean[H][W];
			boolean[][] used = new boolean[H][W];
			int[][] prev_x = new int[H][W];
			int[][] prev_y = new int[H][W];
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(0); queue.add(0);
			visited[0][0] = true;
			
			while(!queue.isEmpty()){
				final int x = queue.poll();
				final int y = queue.poll();
				
				for(final int[] move : move_dirs){
					final int nx = x + move[0];
					final int ny = y + move[1];
					
					if(!in_range(nx, ny, W, H)){ continue; }
					if(board[ny][nx] == '#'){ continue; }
					if(visited[ny][nx]){ continue; }
					
					prev_x[ny][nx] = x;
					prev_y[ny][nx] = y;
					visited[ny][nx] = true;
					queue.add(nx); queue.add(ny);
				}
			}
			
			if(!visited[H - 1][W - 1]){
				System.out.println(-1);
				return;
			}
			
			{
				int x = W - 1, y = H - 1;
				used[y][x] = true;
				
				while(true){
					final int nx = prev_x[y][x];
					final int ny = prev_y[y][x];
					//System.out.println(nx + " " + ny);
					
					if(x == nx && y == ny){ break; }
					used[ny][nx] = true;
					x = nx; y = ny;
				}
			}
			
			int count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(board[i][j] == '.' && !used[i][j]){
						count++;
					}
				}
			}
			
			System.out.println(count);
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