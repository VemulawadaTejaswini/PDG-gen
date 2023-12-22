import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] mazi = new String[h];
		for (int i = 0; i < h; i++) {
			mazi[i] = sc.next();
		}
		sc.close();
		char[][] maze = new char[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				if (i == 0 || i == h + 1 || j == 0 || j == w + 1) {
					maze[i][j] = '#';
				} else {
					maze[i][j] = mazi[i - 1].charAt(j - 1);
				}
			}
		}
		char[][] copy = new char[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				copy[i][j] = maze[i][j];
			}
		}

		Point start = new Point(0, 0);
		Point goal = new Point(0, 0);
		int max = 0;
		for (int is = 1; is <= h; is++) {
			for (int js = 1; js <= w; js++) {
				start = new Point(js, is);
				for (int ig = 1; ig <= h; ig++) {
					for (int jg = 1; jg <= w; jg++) {
						goal = new Point(jg, ig);
						int tmp = solve(h + 2, w + 2, start, goal, maze);
						if (tmp > max) {
							max = tmp;
						}
						for (int i = 0; i < h + 2; i++) {
							for (int j = 0; j < w + 2; j++) {
								maze[i][j] = copy[i][j];
							}
						}
					}
				}
			}
		}
		System.out.println(max);
	}

	static int solve(int h, int w, Point start, Point goal, char[][] map) {
		Point[] D4 = { new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0) };

		// Queueを用意し、スタート地点を入れる
		ArrayDeque<Point> dq = new ArrayDeque<>();
		dq.add(start);

		// 各地点のスタート地点からの距離を記録する二次元配列
		int[][] moves = new int[h][w];

		// スタート地点を"#"で埋めて、探索済みにする
		map[start.getY()][start.getX()] = '#';

		// 幅優先探索
		while (dq.size() > 0) {

			// Queueの先頭の座標を取り出し＆削除して、その四方を探索する。
			Point p = dq.removeFirst();

			for (int i = 0; i < 4; i++) {

				int x = p.getX() + D4[i].getX();
				int y = p.getY() + D4[i].getY();

				if (map[y][x] == '.') {

					// "."であれば探索可能なので、Queueの末尾に追加する
					dq.addLast(new Point(x, y));

					// 探索が終わった座標を"#"で埋めて、次回以降探索しないようにする
					map[y][x] = '#';

					// 座標pからpの四方の座標への移動距離は、pまでの移動距離+1
					moves[y][x] = moves[p.getY()][p.getX()] + 1;

				}

			}

		}

		// ゴール地点に相当するmovesの値が答え
		try {
			return moves[goal.getY()][goal.getX()];
		} catch (Exception e) {
			System.out.println(goal.getY() + " " + goal.getX());
			return 0;
		}
	}

	public static long modFactorial(long n, long mod) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}

class Point {

	private int x;
	private int y;

	Point(int a, int b) {
		x = a;
		y = b;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int n) {
		x = n;
	}

	void setY(int n) {
		y = n;
	}

}