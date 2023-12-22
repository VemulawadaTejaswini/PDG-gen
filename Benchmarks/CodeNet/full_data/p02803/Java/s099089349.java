import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMazeMaster

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMazeMaster sc = new FastScannerMazeMaster(System.in);
		Bfs bfs = new Bfs();

		try {
			int H = sc.nextInt();
			int W = sc.nextInt();

			String s;
			String[][] ss = new String[H][W];
			for (int h = 0; h < H; h++) {
				s = sc.next();
				for (int w = 0; w < W; w++) {
					ss[h][w] = s.substring(w, w + 1);
				}
			}

			int max = 0;
			int[][] d = new int[H][W];
			int INF = -100000000;
			for (int h = 0; h < H; h++) {
				Arrays.fill(d[h], INF);//初期化
			}
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (!ss[h][w].equals("#")) {

						Bfs value = bfs.BfsMaze(new Point(w, h), H, W, ss, d.clone(), INF);
						//System.out.println(h + " " + w + " " + value.max + " " + Arrays.deepToString(value.result));
						if (value.max > max) {
							max = value.max;
						}
					}
				}
			}
			System.out.println(max);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}

//幅優先探索
class Bfs {
	public int max;
	public int[][] result;

	/*
	 * 迷路用の幅優先探索
	 * s  : 始点
	 * H  : 迷路の高さ
	 * W  : 迷路の幅
	 * ss : 迷路の中身の文字列
	 */
	public Bfs BfsMaze(Point s, int H, int W, String[][] ss, int[][] d, int INF) {

		int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions
		ArrayDeque<Point> q = new ArrayDeque<>();

		int sx = s.x, sy = s.y; //Startを指定

		q.offer(new Point(sx, sy));
		d[sy][sx] = 0;

		Bfs bfs = new Bfs();
		bfs.max = 0;
		while (q.size() > 0) {
			Point p = q.poll();
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					//4 directions
					for (int i = 0; i < 4; i++) {
						int nx = p.x + dx[i], ny = p.y + dy[i];
						if (nx >= 0 && nx < W && ny >= 0 && ny < H && !ss[ny][nx].equals("#") && d[ny][nx] == INF) {
							q.offer(new Point(nx, ny));
							d[ny][nx] = d[p.y][p.x] + 1;
							if (bfs.max < d[ny][nx]) {
								bfs.max = d[ny][nx];
							}
						}
					}
				}
			}
		}
		bfs.result = d;
		return bfs;
	}
}

//高速なScanner
class FastScannerMazeMaster {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMazeMaster(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
