
import java.util.Scanner;

public class Main {

	private long INF = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		// 階乗数
		long[] x = new long[h + w - 1];
		x[0] = 1;
		for (int i = 1; i < h + w - 1; i++) {
			x[i] = (i * x[i - 1]) % INF;
		}

		long ans = 0;

		for (int j = b; j < w; j++) {
			int height = h - a - 1;
			long tmp = x[height + j] / ((x[height] * x[j]) % INF);
			long tmp1 = x[a - 1 + w - j - 1] / ((x[a - 1] * x[w - j - 1]) % INF);
			ans += ((tmp % INF) * (tmp1 % INF)) % INF;
		}

		System.out.println(ans);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
