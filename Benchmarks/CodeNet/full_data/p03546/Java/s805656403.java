import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(), w = sc.nextInt();
		int[][] c = new int[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				c[i][j] = sc.nextInt();

		int[] d = new int[10];
		for (int i = 0; i < 10; i++)
			d[i] = d(c, i)[1];

		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				if (a != 1 && a != -1)
					count += d[a];
			}
		}
		System.out.println(count);
	}

	static int[] d(int[][] g, int s) {
		final int M = Integer.MAX_VALUE;
		int[] d = new int[10];
		Arrays.fill(d, M);
		d[s] = 0;

		boolean[] visited = new boolean[10];
		while (true) {
			int u = -1;
			int min = M;

			for (int i = 0; i < 10; i++) {
				if (!visited[i] && d[i] < min) {
					u = i;
					min = d[i];
				}
			}
			if (min == M) break;
			visited[u] = true;
			for (int i = 0; i < 10; i++)
				d[i] = Math.min(d[i], d[u] + g[u][i]);
		}
		return d;
	}
}
