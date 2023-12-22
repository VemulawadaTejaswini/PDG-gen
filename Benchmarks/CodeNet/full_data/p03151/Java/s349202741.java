import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);
		int[] B = nextIntArray(sc, N);

		sc.close();

		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = A[i] - B[i];
		}

		Arrays.sort(d);

		int ans = 0;

		// dのうち、負の値を合計する
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (d[i] < 0) {
				sum += d[i];
				ans++; // 負は必ず変更しないといけない
			}
		}

		// 正の値を大きいものから順にみて、sumが0以上になるまで足し込む。
		for (int i = N - 1; i >= 0; i--) {
			if (sum >= 0) {
				break;
			}

			if (d[i] > 0) {
				sum += d[i];
				ans++;
			}
		}

		if (sum < 0) {
			out.println(-1);
		} else {
			out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
