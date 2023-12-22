import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		int H = Integer.parseInt(line.split(" ")[0]);
		int W = Integer.parseInt(line.split(" ")[1]);
		int[][] squares = new int[H][W];
		boolean[][] done = new boolean[H][W];
		int blocks = 0;
		for (int i = 0; i < H; i++) {
			line = sc.nextLine();
			for (int j = 0; j < W; j++) {
				if (line.substring(j, j + 1).equals("#")) {
					squares[i][j] = -1;
					blocks++;
				}
			}
		}
		Queue<P> q = new LinkedList<>();
		q.add(new P(0, 0, 0));
		while (!q.isEmpty()) {
			P p = q.poll();

			if (p.x < 0 || p.x >= H || p.y < 0 || p.y >= W)
				continue;
			if (squares[p.x][p.y] < 0)
				continue;
			if (done[p.x][p.y])
				continue;

			q.add(new P(p.x + 1, p.y, p.dist + 1));
			q.add(new P(p.x - 1, p.y, p.dist + 1));
			q.add(new P(p.x, p.y + 1, p.dist + 1));
			q.add(new P(p.x, p.y - 1, p.dist + 1));

			squares[p.x][p.y] = p.dist;
			done[p.x][p.y] = true;

			if (p.x == W - 1 && p.y == H - 1)
				break;
		}

		System.out.println(H * W - squares[H - 1][W - 1] + 1 - blocks);
	}
}

class P {
	int x;
	int y;
	int dist;

	P(int x, int y, int dist) {
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
}