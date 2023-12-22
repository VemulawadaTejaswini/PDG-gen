import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();

		int[] a = nextIntArray1origin(sc, A);
		int[] b = nextIntArray1origin(sc, B);
		a[0] = Integer.MAX_VALUE;
		b[0] = Integer.MAX_VALUE;
		
		int[] x = new int[M];
		int[] y = new int[M];
		int[] c = new int[M];
		for (int i = 0; i < M; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		sc.close();

		int ans1 = min(a) + min(b);

		int ans2 = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			ans2 = Math.min(ans2, a[x[i]] + b[y[i]] - c[i]);
		}

		out.println(Math.min(ans1, ans2));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
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
