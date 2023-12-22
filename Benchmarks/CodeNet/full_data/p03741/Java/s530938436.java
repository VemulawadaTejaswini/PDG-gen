import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		long[] sum = new long[n];
		for (int i = 0; i < n; ++i) {
			sum[i] = (i > 0 ? sum[i - 1] : 0) + a[i];
		}

		long d = 0;
		long cnt = 0;
		for (int i = 1; i < n; ++i) {
			if ((sum[i] + d) * (sum[i - 1] + d) < 0) {
				continue;
			}
			if (sum[i - 1] + d > 0) {
				cnt += sum[i] + d + 1;
				d += -(sum[i] + d) - 1;
			} else if (sum[i - 1] + d < 0) {
				cnt += -(sum[i] + d) + 1;
				d += -(sum[i] + d) + 1;
			} else {
				throw new AssertionError();
			}
		}
		System.out.println(cnt);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}