
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] s = new int[N];
		int[] t = new int[N];
		int[] c = new int[N];
		int[][] a = new int[C][100000];
		for (int i = 0; i < N; ++i) {
			s[i] = sc.nextInt();
			--s[i];
			t[i] = sc.nextInt();
			--t[i];
			c[i] = sc.nextInt();
			--c[i];
			for (int j = s[i]; j <= t[i]; ++j) {
				if (a[c[i]][j] == 0)
					a[c[i]][j]++;
			}
		}

		int ans = 0;
		for (int i = 0; i < 100000; ++i) {
			int tmp = 0;
			for (int j = 0; j < C; ++j) {
				tmp += a[j][i];
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
