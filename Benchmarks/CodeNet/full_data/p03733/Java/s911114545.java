import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] t = new long[N];
		long T = sc.nextLong();
		for (int i = 0; i < N; ++i) {
			t[i] = sc.nextLong();
		}
		long ans = 0;
		ans = 0;
		ans += T;
		for (int i = N - 2; i >= 0; --i) {
			if (t[i + 1] - t[i] < T) {
				ans += t[i + 1] - t[i];
			} else {
				ans += T;
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}