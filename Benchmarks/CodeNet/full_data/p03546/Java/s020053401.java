import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int f(int[][] c, int from, boolean[] visited) {
		if (visited[from]) {
			return 1000000;
		}
		visited[from] = true;

		int[] a = new int[10];
		for (int i = 0; i <= 9; i++) {
			if (i == 1) {
				a[1] = c[from][1];
			} else if (i == from) {
				a[i] = Integer.MAX_VALUE;
			} else {
				boolean[] v2 = visited.clone();
				a[i] = c[from][i] + f(c, i, v2);
			}
		}

		return min(a);

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] c = new int[10][10];

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[] A = nextIntArray(sc, W * H);

		sc.close();

		int[] a = new int[10];
		for (int i = 0; i <= 9; i++) {
			a[i] = f(c, i, new boolean[10]);
		}

		int ans = 0;
		for (int x : A) {
			if (x != -1) {
				ans += a[x];
			}
		}

		out.println(ans);
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
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
