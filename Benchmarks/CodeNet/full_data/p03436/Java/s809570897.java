import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h + 2][w + 2];
		for (int i = 1; i <= h; i++) {
			char[] a = sc.next().toCharArray();
			System.arraycopy(a, 0, s[i], 1, a.length);
		}
		sc.close();

		Queue<Obj> que = new ArrayDeque<Obj>();
		Obj fst = new Obj();
		fst.x = 1;
		fst.y = 1;
		fst.v = 1;
		que.add(fst);

		int[] dx = {-1, 0, 0, 1};
		int[] dy = {0, -1, 1, 0};
		boolean[][] flg = new boolean[h + 2][w + 2];
		flg[1][1] = true;
		int val = 0;
		while (!que.isEmpty()) {
			Obj o = que.poll();
			if (o.x == h && o.y == w) {
				val = o.v;
				break;
			}
			for (int i = 0; i < 4; i++) {
				int nx = o.x + dx[i];
				int ny = o.y + dy[i];
				if (!flg[nx][ny] && s[nx][ny] == '.') {
					Obj next = new Obj();
					next.x = nx;
					next.y = ny;
					next.v = o.v + 1;
					que.add(next);
					flg[nx][ny] = true;
				}
			}
		}

		if (!flg[h][w]) {
			System.out.println(-1);
			return;
		}

		int blk = 0;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (s[i][j] == '#') {
					blk++;
				}
			}
		}
		System.out.println(h * w - blk - val);
	}

	static class Obj {
		int x, y, v;
	}
}
