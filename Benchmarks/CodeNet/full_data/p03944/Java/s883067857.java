import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();

		int left = 0;
		int right = W;
		int bottom = 0;
		int top = H;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			switch (a) {
			case 1:
				left = Math.max(left, x);
				break;
			case 2:
				right = Math.min(right, x);
				break;
			case 3:
				bottom = Math.max(bottom, y);
				break;
			case 4:
				top = Math.min(top, y);
				break;
			}
		}

		if (left >= right || bottom >= top) {
			out.println(0);
		} else {
			out.println((right - left) * (top - bottom));
		}
		sc.close();

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

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
