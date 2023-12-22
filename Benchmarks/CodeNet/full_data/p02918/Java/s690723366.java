import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();

		sc.close();

		int h = 0; // 初期の幸福度
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'L') {
				if (i == 0) {
					continue;
				}

				if (S.charAt(i - 1) == 'L') {
					h++;
				}

			} else { // 'R'
				if (i == N - 1) {
					continue;
				}

				if (S.charAt(i + 1) == 'R') {
					h++;
				}
			}
		}

		int r = 1;
		for (int i = 1; i < N; i++) {
			if (S.charAt(i) != S.charAt(i - 1)) {
				r++;
			}
		}

		int ans;

		if (r == 1) {
			ans = h;
		} else if (r == 2) {
			ans = h + 1;
		} else {
			ans = h + Math.min(r - 2, K) * 2;
			ans += Math.max(Math.min(K - r, 2), 0);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
