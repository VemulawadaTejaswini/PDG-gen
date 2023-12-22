import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	int h;
	int w;
	int map[][];
	int mapReplica[][];
	
	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		h = fs.nextInt();
		w = fs.nextInt();
		
		map = new int[h][w];
		mapReplica = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			String[] row = fs.next().split("");
			for(int j = 0; j < w; j++) {
				if(row[j].equals(".")) {
					map[i][j] = 0;
				}else {
					map[i][j] = -1;
				}
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == 0) {
					max = Math.max(max, bfs(i, j));
				}
			}
		}
		
		System.out.println(max);
	}
	
	
	int bfs(int x, int y) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				mapReplica[i][j] = map[i][j];
			}
		}
		
		ArrayDeque<Point> queue = new ArrayDeque<>();
		mapReplica[x][y] = -1;
		queue.add(new Point(x,y,0));
		int max = 0;
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			max = Math.max(max, point.depth);
			int point_x = point.x;
			int point_y = point.y;
			if(point_x > 0) {
				if(mapReplica[point_x-1][point_y] == 0) {
					mapReplica[point_x-1][point_y] = -1;
					queue.add(new Point(point_x-1, point_y, point.depth+1));
				}
			}
			if(point_x < h - 1) {
				if(mapReplica[point_x+1][point_y] == 0) {
					mapReplica[point_x+1][point_y] = -1;
					queue.add(new Point(point_x+1, point_y, point.depth+1));
				}
			}
			if(point_y > 0) {
				if(mapReplica[point_x][point_y-1] == 0) {
					mapReplica[point_x][point_y-1] = -1;
					queue.add(new Point(point_x, point_y-1, point.depth+1));
				}
			}
			if(point_y < w - 1) {
				if(mapReplica[point_x][point_y+1] == 0) {
					mapReplica[point_x][point_y+1] = -1;
					queue.add(new Point(point_x, point_y+1, point.depth+1));
				}
			}
		}
		
		return max;
	}

	class Point{
		int x;
		int y;
		int depth;
		
		Point(int x, int y, int depth){
			this.x = x;
			this.y = y;
			this.depth = depth;
		}
	}

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
