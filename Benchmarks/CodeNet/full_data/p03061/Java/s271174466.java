import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int i;
		long[] A = new long[N];
		long[] B = new long[N];
		long max = 0;
		long gcd = 0;
		long maxgcd = 0;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			if (max < A[i])
				max = A[i];
		}
		int j;
		long n;
		for (i = 0; i < N; i++)
			B[i] = A[i];
		for (i = 0; i < N - 1; i++) {
			B[i + 1] = gcd(B[i], B[i + 1]);
		}
		if (gcd < B[N - 1])
			gcd = B[N - 1];

		for (j = 0; j < N; j++) {
			for (n = gcd; n < max; n++) {
				for (i = 0; i < N; i++)
					B[i] = A[i];
				B[j] = n;
				for (i = 0; i < N - 1; i++) {
					B[i + 1] = gcd(B[i], B[i + 1]);
				}
				if (gcd < B[N - 1])
					gcd = B[N - 1];
			}
		}
		System.out.println(gcd);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}