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

	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}

	// static int count(int max, int interval, int skip) {
	// 	int a = max % interval;
	// 	int b = max / interval;

	// 	return b * (interval - skip) + count2(a);
	// }

	// static int count2(int max, int D, int E) {
	// }

	static long count(long max, long C, long D, long CD) {
		long v1 = max / C;
		long v2 = max / D;
		long v3 = max / CD;
		return max - v1 - v2 + v3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextInt();
		long D = sc.nextInt();
		long count = 0;
		long gcd = gcd(C, D);
		long CD = D / gcd * C;
		long ans = count(B, C, D, CD) - count(A - 1, C, D, CD);

		// System.out.println((A - 1) + ":" + count(A - 1, C, D, CD));
		// System.out.println(B + ":" + count(B, C, D, CD));
		System.out.println(ans);
	}
}
