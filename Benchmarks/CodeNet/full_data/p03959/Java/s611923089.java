import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static final long MOD = 1000000007;

	static long solve(int N, int[] T, int[] A) {
		long pat = 1;
		for (int i = 0; i < N && pat != 0; i++) {
			boolean fixed = false;
			int h = Math.min(T[i], A[i]);
			if (i > 0) {
				if (T[i-1] > T[i]) return 0;
				if (T[i-1] < T[i]) {
					if (h != T[i]) return 0;
					fixed = true;
				}
			} else {
				if (h != T[i]) return 0;
				fixed = true;
			}

			if (i < N - 1) {
				if (A[i] < A[i+1]) return 0;
				if (A[i] > A[i+1]) {
					if (h != A[i]) return 0;
					fixed = true;
				}
			} else {
				if (h != A[i]) return 0;
				fixed = true;
			}

			if (fixed) {
				// System.out.println(1);
			} else {
				// System.out.println(h);
				pat *= h;
				pat %= MOD;
			}
		}
		return pat;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = nextIntArray(sc, N);
		int[] A = nextIntArray(sc, N);
		System.out.println(solve(N, T, A));
	}
}
