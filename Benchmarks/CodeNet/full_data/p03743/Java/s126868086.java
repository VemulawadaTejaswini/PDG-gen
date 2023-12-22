import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int D = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; ++i) {
			d[i] = sc.nextInt();
		}
		int Q = sc.nextInt();

		int[] a = new int[n];// a[i]:=d[0],d[1],...,d[i]によって到達する位置
		int[] b = new int[n + 1];// b[i]:=d[i],d[i+1],d[i+2],...,d[n]によって到達できないDに最も近い位置のDとの距離
		b[n] = 1;
		for (int i = 0; i < n; ++i) {
			if (Math.abs((i > 0 ? a[i - 1] : 0) + d[i] - D) < Math.abs((i > 0 ? a[i - 1] : 0) - D)) {
				a[i] = D - Math.abs((i > 0 ? a[i - 1] : 0) + d[i] - D);
			} else {
				a[i] = (i > 0 ? a[i - 1] : 0);
			}
		}
		for (int i = n - 1; i >= 0; --i) {
			if (d[i] >= 2 * b[i + 1]) {
				b[i] = b[i + 1];
			} else {
				b[i] = b[i + 1] + d[i];
			}
		}
		for (int i = 0; i < n; ++i) {
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < Q; ++i) {
			int q = sc.nextInt();
			--q;
			boolean f = (q > 0 ? a[q - 1] : 0) <= (D - b[q + 1]);
			pw.println(f ? "YES" : "NO");
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}