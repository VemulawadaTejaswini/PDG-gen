import java.util.*;

public class Main {

	public static long[] X;
	public static long[] Y;
	public static boolean[] cached;

	public static long cache(boolean b, int index, int N, int[] A) {
		if (!cached[index]) {
			if (index == 0) {
				Y[index] = -A[index];
				X[index] = A[index];
				cached[index] = true;
			} else {
				long x1 = cache(false, index - 1, N, A);
				long y1 = cache(true, index - 1, N, A);
				Y[index] = Math.max(-A[index] + x1, A[index] + y1);
				X[index] = Math.max(A[index] + x1, -A[index] + y1);
			}
		}
		if (b) {
			return Y[index];
		} else {
			return X[index];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		X = new long[N];
		Y = new long[N];
		cached = new boolean[N];

		long x = A[N-1] + cache(false, N - 2, N, A);
		long y = -A[N-1] + cache(true, N - 2, N, A);

		System.out.println(Math.max(x, y));
	}
}
