import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	int gcd(int[] arr) {
		int ans = gcd(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			ans = gcd(ans, arr[i]);
		}
		return ans;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		if (N == 2) {
			out.println(gcd(a));
			return;
		}

		int[] left = new int[N];
		int[] right = new int[N];

		left[0] = a[0];
		for (int i = 1; i < N; i++) {
			left[i] = gcd(left[i - 1], a[i]);
		}

		right[N - 1] = a[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			right[i] = gcd(right[i + 1], a[i]);
		}

		int ans = 1;

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				ans = Math.max(ans, right[i + 1]);
			} else if (i == N - 1) {
				ans = Math.max(ans, left[N - 2]);
			} else {
				int l = left[i - 1];
				int r = right[i + 1];

				ans = Math.max(ans, gcd(l, r));
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
