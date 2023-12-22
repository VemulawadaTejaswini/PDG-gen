
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int st, sx, sy, et, ex, ey;
		et = 0;
		ex = 0;
		ey = 0;
		for (int i = 0; i < n; i++) {
			st = et;
			sx = ex;
			sy = ey;

			et = sc.nextInt();
			ex = sc.nextInt();
			ey = sc.nextInt();

			if (!can(et - st, ex - sx, ey - sy)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	public static boolean can(int t, int x, int y) {
		int d = Math.abs(x) + Math.abs(y);
		return (d <= t) && (t % 2 == d % 2);
	}
}
