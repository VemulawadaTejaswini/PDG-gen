
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (!can(t[i], 0, 0, x[i], y[i])) {
					System.out.println("No");
					return;
				}
			} else {
				if (!can(t[i] - t[i - 1], x[i - 1], y[i - 1], x[i], y[i])) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	public static boolean can(int t, int sx, int sy, int ex, int ey) {
		if (t == 0) {
			return (sx == ex) && (sy == ey);
		}
		return can(t - 1, sx - 1, sy, ex, ey) || can(t - 1, sx + 1, sy, ex, ey) || can(t - 1, sx, sy - 1, ex, ey)
				|| can(t - 1, sx, sy + 1, ex, ey);
	}
}
