import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		boolean[][] memo = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		solve(map, memo);
	}

	private static void solve(char[][] map, boolean[][] memo) {
		int cnt = -1;
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { -1, 0, 1, 0 };
		int w = map[0].length;
		int h = map.length;
		Queue<Point> queue = new ArrayDeque<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == '#') {
					queue.add(new Point(j, i));
					memo[i][j] = true;
				}
			}
		}

		while (!queue.isEmpty()) {
			int stop = queue.size();
			for (int k = 0; k < stop; k++) {
				Point p = queue.poll(); //先頭の座標を取得後、削除
				for (int i = 0; i < 4; i++) { //forループで、上下左右に分岐させる
					int x = p.x + dx[i];
					int y = p.y + dy[i];

					//分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
					if (x >= 0 && x < w && y >= 0 && y < h) {
						if (map[y][x] != '#' && !memo[y][x]) {
							queue.add(new Point(x, y));
							memo[y][x] = true; //追加した座標を探索済みにする
						}
					}
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}