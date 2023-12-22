import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static long[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new long[N];
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		if (2 * sum % (N * (N + 1)) != 0) {
			System.out.println("NO");
			return;
		} else {
			System.out.println("YES");
		}

		long[] C = new long[N];
		long[] a = new long[N];
		a = Arrays.copyOf(A, A.length);
		long[][] mx = new long[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				mx[i][j] = (N - 1 + j + i) % N + 1;
				--mx[i][j];
			}
			a[i] -= sum * 2 / (N * (N + 1));
			if (a[i] < 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
