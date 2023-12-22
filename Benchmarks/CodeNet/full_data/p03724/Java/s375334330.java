import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		for (int i = 0; i < M; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
		}
		solve(N, M, a, b);
	}

	void solve(int N, int M, int[] a, int[] b) {
		int[] deg = new int[N];
		for (int i = 0; i < M; ++i) {
			++deg[a[i]];
			++deg[b[i]];
		}
		boolean f = true;
		for (int i = 0; i < N; ++i) {
			f &= deg[i] % 2 == 0;
		}
		System.out.println(f ? "YES" : "NO");
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
