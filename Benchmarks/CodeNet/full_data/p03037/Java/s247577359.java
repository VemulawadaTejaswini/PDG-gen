import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int n = s.nextInt();
			final int m = s.nextInt();

			int[][] g = new int[m][];

			for (int i = 0; i < m; i++) {
				g[i] = new int[2];
				g[i][0] = s.nextInt();
				g[i][1] = s.nextInt();
			}

			int count = 0;
			for (int i = 1; i <= n; i++) {
				boolean all = true;
				for (int j = 0; j < m; j++) {
					if (i < g[j][0] || g[j][1] < i) {
						all = false;
						break;
					}
				}
				if (all) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}