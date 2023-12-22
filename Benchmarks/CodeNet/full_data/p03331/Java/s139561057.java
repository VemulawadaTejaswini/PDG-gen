import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = Integer.MAX_VALUE / 3;
		for (int A = 1; A < N - 1; ++A) {
			int B = N - A;
			ans = Math.min(ans, cnt(A) + cnt(B));
		}
		System.out.println(ans);
	}

	int cnt(int a) {
		int ret = 0;
		while (a > 0) {
			ret += a % 10;
			a /= 10;
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
