import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] c = new int[N - 1];
		int[] s = new int[N - 1];
		int[] f = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}

		sc.close();

		// 各iについてしらべる
		for (int i = 0; i < N - 1; i++) {
			// aは、i+1に到着する時間
			int a = s[i] + c[i]; // iが出発地点のときのi+1の到着は、始発+走行時刻
			for (int j = i + 1; j < N - 1; j++) {
				if (a <= s[j]) {
					// jの到着がjの始発より前なら始発を待って乗る
					a = s[j];
				} else {
					// 始発よりあとなら、次の列車にのる
					int b = a - s[j]; // aは始発のb秒後
					int d = b / f[j] + (b % f[j] > 0 ? 1 : 0); // 始発からd本目に乗れる
					a = s[j] + f[j] * d;
				}

				// j->j+1の走行時間
				a += c[j];
			}
			out.println(a);
		}
		out.println(0);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
