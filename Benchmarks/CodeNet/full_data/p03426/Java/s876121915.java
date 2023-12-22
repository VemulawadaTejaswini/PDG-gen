import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int MAX = h * w + 1;
		int[] x = new int[MAX];
		int[] y = new int[MAX];
		int[][] dd = new int[h][w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				y[a] = i;
				x[a] = j;
			}
		}

		for (int i = 1; i < MAX; i++) {
			if (i <= d) {
				dd[y[i]][x[i]] = 0;
			} else {
				dd[y[i]][x[i]] = dd[y[i-d]][x[i-d]] + mp(y[i], x[i], y[i-d], x[i-d]);
			}
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int dl = dd[y[l]][x[l]];
			int dr = dd[y[r]][x[r]];

			System.out.println(dr - dl);
		}
	}

	private static int mp(int y1, int x1, int y2, int x2) {
		return Math.abs(y2 - y1) + Math.abs(x2 - x1);
	}
}
