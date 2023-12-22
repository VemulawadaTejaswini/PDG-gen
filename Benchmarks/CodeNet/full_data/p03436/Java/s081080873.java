import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		int blankCount = 0;

		for (int i = 0; i < h; i++) {
			String str = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = str.charAt(j);
				if (s[i][j] == '.') {
					blankCount++;
				}
			}
		}

		// BFS
		Queue<Pos> queue = new LinkedList<Pos>();
		queue.add(new Pos(0, 0, 0));
		s[0][0] = '/';
		int totalStep = -1;
		while(queue.peek() != null) {
			Pos p = queue.poll();
			if (p.y == h - 1 && p.x == w - 1) {
				totalStep = p.step;
				break;
			} else {
				// Up
				if (p.y - 1 >= 0 && s[p.y - 1][p.x] == '.') {
					s[p.y - 1][p.x] = '/';
					queue.add(new Pos(p.y - 1, p.x, p.step + 1));
				}
				// Down
				if (p.y + 1 < h && s[p.y + 1][p.x] == '.') {
					s[p.y + 1][p.x] = '/';
					queue.add(new Pos(p.y + 1, p.x, p.step + 1));
				}
				// Left
				if (p.x - 1 >= 0 && s[p.y][p.x - 1] == '.') {
					s[p.y][p.x - 1] = '/';
					queue.add(new Pos(p.y, p.x - 1, p.step + 1));
				}
				// Right
				if (p.x + 1 < w && s[p.y][p.x + 1] == '.') {
					s[p.y][p.x + 1] = '/';
					queue.add(new Pos(p.y, p.x + 1, p.step + 1));
				}
			}
		}

		if (totalStep == -1) {
			System.out.println(totalStep);
		} else {
			System.out.println(blankCount - totalStep - 1);
		}
	}

	private static class Pos {
		int y;
		int x;
		int step;

		Pos(int y, int x, int step) {
			this.y = y;
			this.x = x;
			this.step = step;
		}
	}
}
