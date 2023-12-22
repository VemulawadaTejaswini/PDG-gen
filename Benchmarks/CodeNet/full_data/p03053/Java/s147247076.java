import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] path = new char[h][w];
		for (int i = 0; i < h; i++) {
			path[i] = sc.next().toCharArray();
		}
		Deque<int[]> check = new ArrayDeque<>(h * w);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (path[i][j] == '#') {
					int[] start = { i, j, 0 };
					check.addLast(start);
				}
			}
		}
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		int x = 0, y = 0;
		int time = 0;
		while (!check.isEmpty()) {
			int[] tmp = check.removeFirst();
			x = tmp[0];
			y = tmp[1];
			time = tmp[2];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 <= nx && nx < h && 0 <= ny && ny < w && path[nx][ny] == '.') {
					int[] next = { nx, ny, time + 1 };
					check.addLast(next);
					path[nx][ny] = '#';
				}
			}
		}
		System.out.println(time);
	}
}
