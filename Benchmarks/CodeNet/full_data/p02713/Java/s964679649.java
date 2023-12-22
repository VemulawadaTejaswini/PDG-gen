import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int k = 0;
		long ans = 0;

		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		sc.close();

		for (int i = 1; i < k + 1; i++) {
			for (int j = 1; j < k + 1; j++) {
				for (int m = 1; m < k + 1; m++) {
					if (i == 1 || j == 1 || m == 1) {
						ans += 1;
					} else if (i == j && j == m) {
						ans += i;
					} else {
						ans += gcd(i, j, m);
					}
				}
			}
		}
		System.out.println(ans);
	}

	public static final int gcd(final int... param) {
		final int len = param.length;
		int g = gcd(param[0], param[1]);
		for (int i = 1; i < len - 1; i++) {
			g = gcd(g, param[i + 1]);
		}
		return g;
	}

	public static final int gcd(int a, int b) {
		// a > b にする（スワップ）
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		// ユークリッドの互除法
		int r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}