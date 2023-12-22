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

		int num = 0;
		for (int i = 1; i < N; i++) {
			if (S.charAt(i - 1) != S.charAt(i)) {
				num++;
			}
		}

		int ans = h + Math.min(num / 2, K) * 2 + Math.min(num % 2, Math.max(K - num / 2, 0));

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
