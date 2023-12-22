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

	static class Zero extends RuntimeException { }

	static long MOD = 1000000007;

	static long calc2(ArrayList<Integer>[] edge, int K, int myPat, int node, int parent) {
		if (myPat <= 0) {
			throw new Zero();
		}
		long result = myPat;
		int pat = 1;
		for (int n : edge[node]) {
			if (n == parent) continue;
			pat++;

			result *= calc2(edge, K, K - pat, n, node);
			result %= MOD;
		}
		// System.out.printf("%d %d %n", node, result);
		return result;
	}

	static long calc(ArrayList<Integer>[] edge, int K) {
		long result = K;
		int pat = 0;
		if (edge[1] != null) {
			for (int node : edge[1]) {
				pat++;
				result *= calc2(edge, K, K - pat, node, 1);
				result %= MOD;
			}
		}
		// System.out.printf("%d %d %n", 1, result);
		return result;
	}

	static void reg(ArrayList<Integer>[] edge, int a, int b) {
		if (edge[a] == null) {
			edge[a] = new ArrayList<>();
		}
		edge[a].add(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] edge = new ArrayList[N + 1];
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			reg(edge, a, b);
			reg(edge, b, a);
		}
		long value;
		try {
			value = calc(edge, K);
		} catch (Zero e) {
			value = 0;
		}

		System.out.println(value);
	}
}
