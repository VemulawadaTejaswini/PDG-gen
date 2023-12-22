import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int INF = Integer.MAX_VALUE;
	static int h, w;
	static String[][] s;
	static Point start, goal;
	static String barrior = "#";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		s = new String[h][w];
		int count = 0;
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().split("");
			for (int j = 0; j < w; j++)
				if(s[i][j].equals("."))
					count++;
		}
		start = new Point(0, 0);
		goal = new Point(h - 1, w - 1);
		int ans = bfs();
		if (ans != -1)
			ans = count - ans;
		System.out.println(ans);
	}

	public static int bfs() {
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		int[][] d = new int[h][w];
		for (int i = 0; i < h; i++)
			Arrays.fill(d[i], INF);
		d[start.x][start.y] = 1;
		Deque<Point> p = new ArrayDeque<Point>();
		p.add(start);
		while(!p.isEmpty()) {
			Point q = p.pop();
			int x = q.x, y = q.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i], ny = y + dy[i];
				if (nx < 0 || nx >= h || ny < 0 || ny >= w || s[nx][ny].equals(barrior) || d[nx][ny] != INF)
					continue;
				d[nx][ny] = d[x][y] + 1;
				if (nx == goal.x && ny == goal.y)
					return d[nx][ny];
				p.add(new Point(nx, ny));
			}
		}
		return -1;
	}
}