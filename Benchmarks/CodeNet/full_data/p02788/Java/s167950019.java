import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	Deque<long[]> d = new ArrayDeque<>();
	long a = 0;

	// 爆弾追加 (right:範囲の右端座標 z:威力)
	void addBomb(long right, long z) {
		d.offer(new long[] { right, z });
		a += z;
	}

	// 爆弾効果取得
	long getBomb(long x) {
		if (d.isEmpty()) {
			return 0;
		}

		while (!d.isEmpty() && x > d.peekFirst()[0]) {
			a -= d.peekFirst()[1];
			d.poll();
		}
		return a;
	}

	long A;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		long D = sc.nextLong();
		A = sc.nextLong();
		long[][] XH = new long[N][2];
		for (int i = 0; i < N; i++) {
			XH[i][0] = sc.nextLong();
			XH[i][1] = sc.nextLong();
		}

		sc.close();

		Arrays.sort(XH, (a, b) -> (Long.compare(a[0], b[0])));

		//
		long ans = 0;

		for (int i = 0; i < N; i++) {
			long x = XH[i][0];
			long h = XH[i][1];

			while (h > getBomb(x)) {
				long s = (h - getBomb(x) + A - 1) / A;
				addBomb(x + 2 * D, A * s);
				ans += s;
//				System.err.println(ans);
			}
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
