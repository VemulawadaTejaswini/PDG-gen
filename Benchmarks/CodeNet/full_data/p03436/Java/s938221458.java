import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static class P {
		int x;
		int y;
		int d;

		P(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();

		int[][] visited = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(visited[i], Integer.MAX_VALUE);
		}

		char[][] a = new char[h][w];
		int count = 0;
		for (int hi = 0; hi < h; hi++) {
			String s = sc.nextLine();
			a[hi] = s.toCharArray();
			for (int i = 0; i < w; i++) {
				if (a[hi][i] == '#') count++;
			}
		}

		Queue<P> q = new LinkedList<>();
		q.offer(new P(0, 0, 1));
		while (!q.isEmpty()) {
			P p = q.poll();
			if (p.x < 0 || p.y < 0 || p.x >= w || p.y >= h) continue;
			if (a[p.y][p.x] == '#') continue;
			if (visited[p.y][p.x] <= p.d) continue;
			visited[p.y][p.x] = p.d;
			q.offer(new P(p.x + 1, p.y, p.d + 1));
			q.offer(new P(p.x, p.y + 1, p.d + 1));
			q.offer(new P(p.x - 1, p.y, p.d + 1));
			q.offer(new P(p.x, p.y - 1, p.d + 1));
		}

		//for (int i = 0; i < h; i++) {
		//	for (int j = 0; j < w; j++) {
		//		System.out.print(visited[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		if (visited[h - 1][w - 1] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(h * w - count - visited[h - 1][w - 1]);
		}
	}
}
