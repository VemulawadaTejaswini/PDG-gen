import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int h = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[1]);
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = br.readLine().toCharArray();
		}
		br.close();

		boolean[][] flg = new boolean[h][w];
		Queue<Obj> que = new ArrayDeque<Obj>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') {
					flg[i][j] = true;
					Obj o = new Obj();
					o.x = i;
					o.y = j;
					o.v = 0;
					que.add(o);
				}
			}
		}

		int ans = 0;
		int[] x = {-1, 0, 0, 1};
		int[] y = {0, -1, 1, 0};
		while (!que.isEmpty()) {
			Obj cur = que.poll();
			for (int i = 0; i < 4; i++) {
				int nx = cur.x + x[i];
				int ny = cur.y + y[i];
				ans = Math.max(ans, cur.v);
				if (nx < 0 || h <= nx || ny < 0 || w <= ny) {
					continue;
				}
				if (!flg[nx][ny]) {
					flg[nx][ny] = true;
					Obj o = new Obj();
					o.x = nx;
					o.y = ny;
					o.v = cur.v + 1;
					que.add(o);
				}
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int x, y, v;
	}
}
