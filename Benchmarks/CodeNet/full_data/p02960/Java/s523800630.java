import java.util.*;

public class Main {
	public static void printArray(long[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

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

	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		byte[] bytes = s.getBytes();
		int LEN = bytes.length;
		long[][] X = new long[LEN][13];

		if (bytes[LEN-1] == '?') {
			for (int i = 0; i <= 9; i++) {
				X[0][i] = 1;
			}
		} else {
			int c = bytes[LEN-1] - '0';
			X[0][c] = 1;
		}
		// System.out.println(LEN);
		// printArray(X[0]);

		int baseMod = 1;
		for (int i = 1; i < LEN; i++) {
			baseMod *= 10;
			baseMod %= 13;
			byte c = bytes[LEN - i - 1];
			if (c == '?') {
				for (int n = 0; n <= 9; n++) {
					int mod = n * baseMod % 13;
					for (int j = 0; j < 13; j++) {
						long v = X[i-1][j];
						X[i][(j + mod) % 13] += v;
						X[i][(j + mod) % 13] %= MOD;
					}
				}
			} else {
				int n = c - '0';
				int mod = n * baseMod % 13;
				for (int j = 0; j < 13; j++) {
					X[i][(j + mod) % 13] = X[i-1][j];
				}
			}
			// printArray(X[i]);
		}

		System.out.println(X[LEN-1][5]);
	}
}
