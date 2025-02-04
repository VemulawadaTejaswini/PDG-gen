
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/C1";

	FastScanner in;
	PrintWriter out;

	boolean[][] visited;
	boolean[][] isPainted;
	
	int[][] prevX, prevY;
	char[][] blue, red;
	
	boolean inside(int x, int y, int M, int N) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}
	
	void restorePath(int curX, int curY, char[][] map) {
		{
			map[curY][curX] = '#';
			int nextY = prevY[curY][curX];
			int nextX = prevX[curY][curX];
			curX = nextX; curY = nextY;
		}
		
		while (curY != -1 && prevY[curY][curX] != -1 && map[curY][curX] != '#') {
			isPainted[curY][curX] = true;
			map[curY][curX] = '#';
			int nextY = prevY[curY][curX];
			int nextX = prevX[curY][curX];
			curX = nextX; curY = nextY;
		}
	}
	
	int[] vx = {-1, 0, 1, 0};
	int[] vy = {0, -1, 0, 1};
	void bfs(char[][] map, char[][] original) {
		int H = map.length, W = map[0].length;
		Queue<Point> q = new LinkedList<>(); 
		for (int i = 0; i < H; i++) {
			Arrays.fill(visited[i], false);
			for (int j = 0; j < W; j++) {
				prevX[i][j] = -1;
				prevY[i][j] = -1;
				if (map[i][j] == '#') q.add(new Point(j, i));
			}
		}
		
		while (!q.isEmpty()) {
			Point p = q.poll();
			if (original[p.y][p.x] == '#') {
				restorePath(p.x, p.y, map);
			}
			for (int d = 0; d < vx.length; d++) {
				int nx = p.x + vx[d];
				int ny = p.y + vy[d];
				
				if (inside(nx, ny, W, H) && !visited[ny][nx] && !isPainted[ny][nx]) {
					prevX[ny][nx] = p.x;
					prevY[ny][nx] = p.y;
					visited[ny][nx] = true;
					q.add(new Point(nx, ny));
				}
			}
		}
	}
	
	public void solve() {
		int H = in.nextInt(), W = in.nextInt();
		char[][] a = new char[H][];
		for (int i = 0; i < H; i++) {
			a[i] = in.next().toCharArray();
		}
		
		isPainted = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(isPainted[i], false);
		}

		visited = new boolean[H][W];
		prevX = new int[H][W];
		prevY = new int[H][W];
		
		blue = new char[H][W];
		red = new char[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(blue[i], '.');
			Arrays.fill(red[i], '.');
			for (int j = 0; j < W; j++) {
				if (i == 0 || j == 0) {
					red[i][j] = '#';
					isPainted[i][j] = true;
				} else if (i == H - 1 || j == W - 1) {
					blue[i][j] = '#';
					isPainted[i][j] = true;
				}
			}
		}
		
		bfs(blue, a);
		bfs(red, a);
		
		for (int i = 0; i < H; i++) {
			out.println(String.valueOf(red[i]));
		}
		out.println();
		for (int i = 0; i < H; i++) {
			out.println(String.valueOf(blue[i]));
		}
		out.close();
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		Thread t = new Thread(null, new Runnable() {
			
			@Override
			public void run() {
				solve();
			}
		}, "lul", 1 << 30);
		t.start();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}


