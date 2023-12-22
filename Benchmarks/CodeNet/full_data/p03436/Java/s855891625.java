

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static class C {
		int x, y, d;

		C(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] s = new char[h][];
		boolean[][] wall = new boolean[h][w];
		int count = 0;

		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					count++;
					wall[i][j] = true;
				}
			}
		}

		Deque<C> dq = new ArrayDeque<>();
		boolean[][] vid = new boolean[h][w];
		vid[0][0] = true;

		dq.addLast(new C(0, 0, 1));
		int ans = 0;

		while (!dq.isEmpty()) {
			C current = dq.pollFirst();
			int x = current.x;
			int y = current.y;
			int d = current.d;

			if ((x == h - 2 && y == w - 1) || (x == h - 1 && y == w - 2)) {
				ans = d + 1;
				break;
			}

			if (x != 0) {
				if (!wall[x - 1][y] && !vid[x - 1][y]) {
					dq.addLast(new C(x - 1, y, d + 1));
					vid[x - 1][y] = true;
				}
			}
			if (x != h - 1) {
				if (!wall[x + 1][y] && !vid[x + 1][y]) {
					dq.addLast(new C(x + 1, y, d + 1));
					vid[x + 1][y] = true;
				}
			}

			if (y != 0) {
				if (!wall[x][y - 1] && !vid[x][y - 1]) {
					dq.addLast(new C(x, y - 1, d + 1));
					vid[x][y - 1] = true;
				}
			}
			if (y != w - 1) {
				if (!wall[x][y + 1] && !vid[x][y + 1]) {
					dq.addLast(new C(x, y + 1, d + 1));
					vid[x][y + 1] = true;
				}
			}
		}

		if (ans == 0) {
			System.out.println(-1);
		} else {
			System.out.println(h * w - ans - count);
		}

	}

}
