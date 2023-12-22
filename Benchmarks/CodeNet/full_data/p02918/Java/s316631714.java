import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		int c = 1;
		for (int i = 0; i + 1 < S.length(); ++i) {
			if (S.charAt(i) != S.charAt(i + 1)) {
				++c;
			}
		}
		for (int i = 0; c > 1 && i < K; ++i) {
			if (c >= 3) {
				c -= 2;
			} else {
				c -= 1;
			}
		}
		System.out.println(N - c);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
