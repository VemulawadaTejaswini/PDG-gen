import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long ans = Long.MAX_VALUE / 16;
		ans = Math.min(ans, solve(H, W));
		ans = Math.min(ans, solve(W, H));
		System.out.println(ans);
	}

	long solve(long H, long W) {
		long ans = Long.MAX_VALUE / 16;
		if (W / 3 != 0 && W - W / 3 * 2 != 0)
			ans = H * (Math.max(W / 3, W - W / 3 * 2) - Math.min(W / 3, W - W / 3 * 2));
		for (int i = 1; i < H; ++i) {
			ans = Math.min(ans, max(i * W, (H - i) * (W / 2), (H - i) * (W - W / 2))
					- min(i * W, (H - i) * (W / 2), (H - i) * (W - W / 2)));
		}
		return ans;
	}

	long max(long a, long b, long c) {
		long ret = a;
		ret = Math.max(ret, b);
		ret = Math.max(ret, c);
		return ret;
	}

	long min(long a, long b, long c) {
		return -max(-a, -b, -c);
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
