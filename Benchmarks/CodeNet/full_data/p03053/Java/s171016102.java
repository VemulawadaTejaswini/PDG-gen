import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next();
		}
		int[][] kyori = new int[h][w];
		Queue<Integer> queue = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i].charAt(j) == '#') {
					visited[i][j] = true;
					queue.add(i * 10000 + j);
				}
			}
		}
		while (!queue.isEmpty()) {
			int tmp = queue.remove();
			int r = tmp / 10000;
			int c = tmp % 10000;
			int count = kyori[r][c];
			if (r > 0 && !visited[r - 1][c]) {
				kyori[r - 1][c] = count + 1;
				visited[r - 1][c] = true;
				queue.add(((r - 1) * 10000 + c));
			}
			if (r < h - 1 && !visited[r + 1][c]) {
				kyori[r + 1][c] = count + 1;
				visited[r + 1][c] = true;
				queue.add((r + 1) * 10000 + c);
			}
			if (c > 0 && !visited[r][c - 1]) {
				kyori[r][c - 1] = count + 1;
				visited[r][c - 1] = true;
				queue.add(r * 10000 + c - 1);
			}
			if (c < w - 1 && !visited[r][c + 1]) {
				kyori[r][c + 1] = count + 1;
				visited[r][c + 1] = true;
				queue.add(r * 10000 + c + 1);
			}
		}
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				max = Math.max(max, kyori[i][j]);
			}
		}
		System.out.println(max);
	}
}