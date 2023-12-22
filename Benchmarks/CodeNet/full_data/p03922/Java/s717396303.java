import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] lis = new int[(int) 1e5 + 1];
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			++lis[x];
		}
		int[] c2 = new int[m];
		int[] c1 = new int[m];
		for (int i = 0; i < lis.length; ++i) {
			c2[i % m] += lis[i] / 2 * 2;
			c1[i % m] += lis[i] % 2;
		}
		for (int i = 0; i <= m / 2; ++i) {
			int j = (m - i) % m;
			if (i == j) {
				c2[i] += c1[i] / 2 * 2;
				c1[i] %= 2;
				continue;
			}
			int tmp = Math.min(c1[i], c1[j]);
			c1[i] -= tmp;
			c1[j] -= tmp;
			if (c1[i] > c1[j]) {
				tmp = c1[i];
				c1[i] = c1[j];
				c1[j] = tmp;
				tmp = c2[i];
				c2[i] = c2[j];
				c2[j] = tmp;
			}
			tmp = Math.min(c2[i], c1[j] / 2 * 2);
			c1[j] -= tmp;
			c2[i] -= tmp;
		}
		int ans = 0;
		for (int v : c1) {
			ans += v;
		}
		if ((n - ans) % 2 == 1) {
			throw new AssertionError();
		}
		System.out.println((n - ans) / 2);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
