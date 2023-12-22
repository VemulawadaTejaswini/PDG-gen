import java.util.*;

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

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	// static boolean[] sieve(int max) {
	// 	boolean[] ret = new boolean[max+1];
	// 	Arrays.fill(ret, true);
	// 	ret[0] = false;
	// 	ret[1] = false;
	// 	int lim = (int)Math.sqrt(max + 1) + 1;
	// 	for (int i = 2; i < lim; i++) {
	// 		if (ret[i]) {
	// 			for (int j = i * i; j < ret.length; j++) {
	// 				ret[j] = false;
	// 			}
	// 		}
	// 	}
	// 	return ret;
	// }

	static boolean solve(int N, int K, int[] A, int max) {
		int[] B = new int[N];
		for (int j = 0; j < N; j++) {
			B[j] = A[j] % max;
		}
		int k = 0;
		Arrays.sort(B);
		int l = 0;
		int r = N - 1;
		while (l < r) {
			int v1 = B[l];
			int v2 = max - B[r];
			if (v1 <= v2) {
				k += v1;
				B[l] -= v1;
				B[r] += v1;
				l++;
			} else {
				k += v2;
				B[l] -= v2;
				B[r] += v2;
				r--;
			}
		}
		if (k <= K) {
			System.out.println(max);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = intArray(sc, N);
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += A[i];
		}
		int lim = (int)Math.sqrt(sum) + 1;
		boolean ok = false;
		for (int i = 1; i < lim; i++) {
			if (sum % i != 0) continue;

			int max = sum / i;
			// System.out.println("candidate = " + max);

			ok = solve(N, K, A, max);
			if (ok) break;
		}
		if (!ok) {
			for (int i = lim; i >= 1; i--) {
				if (sum % i != 0) continue;
				ok = solve(N, K, A, i);
				if (ok) break;
			}
		}
	}

	static int[] intArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
